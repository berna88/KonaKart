package com.konakartadmin.app;

import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - DeleteProductAttribute - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class DeleteProductAttribute
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public DeleteProductAttribute(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public void deleteProductAttribute(String sessionId, int productAttributeId) throws KKAdminException
     {
         kkAdminEng.deleteProductAttribute(sessionId, productAttributeId);
     }
}
