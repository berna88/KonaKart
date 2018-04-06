package com.konakartadmin.app;

import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - CustomSecure - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class CustomSecure
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public CustomSecure(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public String customSecure(String sessionId, String input1, String input2) throws KKAdminException
     {
         return kkAdminEng.customSecure(sessionId, input1, input2);
     }
}
