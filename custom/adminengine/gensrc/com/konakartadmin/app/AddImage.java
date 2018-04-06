package com.konakartadmin.app;

import com.konakartadmin.appif.*;
import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - AddImage - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class AddImage
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public AddImage(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public void addImage(String sessionId, AdminImageOptions options) throws KKAdminException
     {
         kkAdminEng.addImage(sessionId, options);
     }
}