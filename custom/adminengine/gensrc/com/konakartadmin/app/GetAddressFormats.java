package com.konakartadmin.app;

import com.konakartadmin.appif.*;
import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - GetAddressFormats - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class GetAddressFormats
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public GetAddressFormats(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public AdminAddressFormatSearchResult getAddressFormats(AdminAddressFormatSearch search) throws KKAdminException
     {
         return kkAdminEng.getAddressFormats(search);
     }
}