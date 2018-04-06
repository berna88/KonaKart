package com.konakartadmin.app;

import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - UpdateProductsUsingTemplates - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class UpdateProductsUsingTemplates
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public UpdateProductsUsingTemplates(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public int updateProductsUsingTemplates(String sessionId, int[] templateIds) throws KKAdminException
     {
         return kkAdminEng.updateProductsUsingTemplates(sessionId, templateIds);
     }
}
