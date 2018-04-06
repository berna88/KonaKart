package com.konakartadmin.app;

import com.konakartadmin.appif.*;
import com.konakart.app.*;
import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - InsertKKEvent - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class InsertKKEvent
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public InsertKKEvent(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public int insertKKEvent(String sessionId, KKEvent event) throws KKAdminException
     {
         return kkAdminEng.insertKKEvent(sessionId, event);
     }
}
