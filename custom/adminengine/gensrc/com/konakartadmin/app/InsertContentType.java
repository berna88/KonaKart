package com.konakartadmin.app;

import com.konakartadmin.appif.*;
import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - InsertContentType - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class InsertContentType
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public InsertContentType(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public int insertContentType(String sessionId, AdminContentType contentType) throws KKAdminException
     {
         return kkAdminEng.insertContentType(sessionId, contentType);
     }
}
