package com.konakartadmin.app;

import com.konakartadmin.appif.*;
import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - GetTagsPerProduct - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class GetTagsPerProduct
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public GetTagsPerProduct(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public AdminTag[] getTagsPerProduct(String sessionId, int productId, int languageId) throws KKAdminException
     {
         return kkAdminEng.getTagsPerProduct(sessionId, productId, languageId);
     }
}
