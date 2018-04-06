-- (c) 2006 DS Data Systems UK Ltd, All rights reserved.
-- 
-- DS Data Systems and KonaKart and their respective logos, are
-- trademarks of DS Data Systems UK Ltd. All rights reserved.
-- 
-- The information in this document below this text is free software; you can redistribute
-- it and/or modify it under the terms of the GNU Lesser General Public
-- License as published by the Free Software Foundation; either
-- version 2.1 of the License, or (at your option) any later version.
-- 
-- This software is distributed in the hope that it will be useful,
-- but WITHOUT ANY WARRANTY; without even the implied warranty of
-- MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
-- Lesser General Public License for more details.
-- 
-- -----------------------------------------------------------
-- KonaKart upgrade database script for PostgreSQL
-- From version 8.3.0.0 to version 8.5.0.0
-- -----------------------------------------------------------
-- In order to upgrade from versions prior to 8.3.0.0, the upgrade
-- scripts must be run sequentially.
-- 

-- Set database version information
INSERT INTO kk_config (kk_config_key, kk_config_value, date_added) VALUES ('HISTORY', '8.5.0.0 U', now());
UPDATE kk_config SET kk_config_value='8.5.0.0 PostgreSQL', date_added=now() WHERE kk_config_key='VERSION';

-- Used in storefront to decide whether to update the product viewed count every time a product is viewed
DELETE FROM configuration WHERE configuration_key = 'UPDATE_PRODUCT_VIEWED_COUNT';
INSERT INTO configuration (configuration_title, configuration_key, configuration_value, configuration_description, configuration_group_id, sort_order, set_function, date_added, return_by_api, store_id) SELECT 'Update product viewed count','UPDATE_PRODUCT_VIEWED_COUNT','false','When true, the product viewed count is incremented every time a product is viewed',1, 55, 'choice(''true''=''true'',''false''=''false'')', now(), '1', store_id FROM configuration WHERE configuration_key = 'STORE_COUNTRY';

-- Update to new form of configuration set_function
UPDATE configuration SET set_function = 'choice(''true''=''true'',''false''=''false'')' WHERE set_function = 'tep_cfg_select_option(array(''true'', ''false''), ';

-- Add reservation_id to kk_reserved_stock
ALTER TABLE kk_reserved_stock ADD reservation_id int DEFAULT 0 NOT NULL;
DROP INDEX IF EXISTS idxkk_reserved_stock_reservation_id;
CREATE INDEX idxkk_reserved_stock_reservation_id ON kk_reserved_stock (reservation_id);

-- For specifying whether or not customer tags can be set using KKEngIf API calls
ALTER TABLE kk_customer_tag ADD set_by_api INTEGER NOT NULL DEFAULT 0;
-- Do not allow the B2B_ tags to be set
UPDATE kk_customer_tag set set_by_api = 1 WHERE NOT name LIKE 'B2B_%';

-- Addition of custom fields
ALTER TABLE products_quantity ADD COLUMN custom1 varchar(128);
ALTER TABLE products_quantity ADD COLUMN custom2 varchar(128);

-- New API calls
INSERT INTO kk_api_call (api_call_id, name, description, date_added) VALUES (DEFAULT,'deleteProdAttrDescWithOptions', '', now());
INSERT INTO kk_api_call (api_call_id, name, description, date_added) VALUES (DEFAULT,'deleteProducts', '', now());

--Promotion tester customer tag
DELETE FROM kk_customer_tag WHERE name = 'PROMOTION_TESTER';

INSERT INTO kk_customer_tag (name, description, validation, tag_type, max_ints, date_added, store_id) SELECT 'PROMOTION_TESTER', 'Promotion Tester', 'true|false', 5, 1, now(), store_id FROM (SELECT store_id FROM kk_customer_tag GROUP BY store_id) STORES;

--Promotion tester expression
DELETE FROM kk_expression WHERE name = 'PromotionTester';
INSERT INTO kk_expression (name, description, num_variables, date_added, store_id) SELECT 'PromotionTester', 'Determines whether user is a promotion tester', 1, now(), store_id FROM (SELECT store_id FROM kk_customer_tag GROUP BY store_id) STORES;

-- Promotion tester expression variable
DELETE FROM kk_expression_variable WHERE kk_customer_tag_id IN (select kk_customer_tag_id from kk_customer_tag where name = 'PROMOTION_TESTER');
INSERT INTO kk_expression_variable (kk_customer_tag_id, kk_expression_id, tag_type, tag_value, date_added, store_id) SELECT CT.kk_customer_tag_id, E.kk_expression_id, 5, 'true', now(), AF.store_id FROM kk_customer_tag CT, kk_expression E, (SELECT DISTINCT store_id FROM kk_customer_tag) AF WHERE CT.name = 'PROMOTION_TESTER' AND E.name = 'PromotionTester' AND ((AF.store_id=E.store_id AND AF.store_id=CT.store_id) OR AF.store_id = '' OR AF.store_id IS NULL);

-- For Setting the default expression for promotion testers
DELETE FROM configuration WHERE configuration_key = 'PROMOTION_TESTER_EXPRESSION';
INSERT INTO configuration (configuration_title, configuration_key, configuration_value, configuration_description, configuration_group_id, sort_order, date_added, return_by_api, store_id) SELECT 'Promotion Tester Expression', 'PROMOTION_TESTER_EXPRESSION', 'PromotionTester', 'The expression used for determining promotion testers', '5', '25', now(), '1', store_id FROM configuration WHERE configuration_key = 'STORE_COUNTRY';

DROP TABLE IF EXISTS kk_credit_card;
CREATE TABLE kk_credit_card (
   kk_credit_card_id SERIAL,
   store_id VARCHAR(64),
   customers_id INTEGER NOT NULL,
   address_id INTEGER,
   ccType VARCHAR(32),
   ccOwner VARCHAR(32),
   ccNumber VARCHAR(32),
   ccToken VARCHAR(32),
   ccExpires VARCHAR(16),
   ccExpiryMonth INTEGER,
   ccExpiryYear INTEGER,
   ccImage VARCHAR(32),
   custom1 VARCHAR(128),
   custom2 VARCHAR(128),
   custom3 VARCHAR(128),
   custom4 VARCHAR(128),
   custom5 VARCHAR(128),
   PRIMARY KEY (kk_credit_card_id)
);
CREATE INDEX idx_credit_card_customers_id ON kk_credit_card (customers_id);

-- For Setting the tz database time zone for the store
DELETE FROM configuration WHERE configuration_key = 'TZ_DB_TIME_ZONE';
INSERT INTO configuration (configuration_title, configuration_key, configuration_value, configuration_description, configuration_group_id, sort_order, date_added, return_by_api, store_id) SELECT 'TZ DB Time Zone', 'TZ_DB_TIME_ZONE', '', 'The tz database time zone for the store. e.g. US/Pacific', '1', '7', now(), '1', store_id FROM configuration WHERE configuration_key = 'STORE_COUNTRY';

-- New API call
INSERT INTO kk_api_call (api_call_id, name, description, date_added) VALUES (DEFAULT,'getStoreTime', '', now());

-- Admin Caches
DELETE FROM configuration WHERE configuration_key = 'ADMIN_CONFIG_CACHE_CHECK_SECS';
INSERT INTO configuration (configuration_title, configuration_key, configuration_value, configuration_description, configuration_group_id, sort_order, date_added, return_by_api, store_id) SELECT 'Admin caches refresh check interval', 'ADMIN_CONFIG_CACHE_CHECK_SECS', '30', 'Interval in seconds for checking to see whether to refresh the KonaKartAdmin caches', '11', '10', now(), '1', store_id FROM configuration WHERE configuration_key = 'STORE_COUNTRY';

DELETE FROM configuration WHERE configuration_key = 'ADMIN_CONFIG_CACHE_CHECK_FLAG';
INSERT INTO configuration (configuration_title, configuration_key, configuration_value, configuration_description, configuration_group_id, sort_order, date_added, return_by_api, store_id) SELECT 'Admin caches refresh flag','ADMIN_CONFIG_CACHE_CHECK_FLAG','false','Boolean to determine whether to refresh the admin config caches','100', '1' , now(), '1', store_id FROM configuration WHERE configuration_key = 'STORE_COUNTRY';

-- B2B Customer tags for monthly order limit
DELETE FROM kk_customer_tag WHERE name ='B2B_AGGREGATE_ORDER_LIMIT';
INSERT INTO kk_customer_tag (name, description, validation, tag_type, max_ints, date_added, store_id) SELECT 'B2B_AGGREGATE_ORDER_LIMIT', 'Maximum total order value that can be submitted in a period of time', '', 3, 1, now(), store_id FROM (SELECT store_id FROM kk_customer_tag GROUP BY store_id) STORES;

DELETE FROM kk_customer_tag WHERE name ='B2B_AGGREGATE_ORDER_TOTAL';
INSERT INTO kk_customer_tag (name, description, validation, tag_type, max_ints, date_added, store_id) SELECT 'B2B_AGGREGATE_ORDER_TOTAL', 'The current order value total for a period of time', '', 3, 1, now(), store_id FROM (SELECT store_id FROM kk_customer_tag GROUP BY store_id) STORES;
