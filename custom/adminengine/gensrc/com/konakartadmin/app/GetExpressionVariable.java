package com.konakartadmin.app;

import com.konakartadmin.appif.*;
import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - GetExpressionVariable - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class GetExpressionVariable
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public GetExpressionVariable(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public AdminExpressionVariable getExpressionVariable(String sessionId, int id) throws KKAdminException
     {
         return kkAdminEng.getExpressionVariable(sessionId, id);
     }
}
