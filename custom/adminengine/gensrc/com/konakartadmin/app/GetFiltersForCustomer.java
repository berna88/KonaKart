package com.konakartadmin.app;

import com.konakartadmin.appif.*;
import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - GetFiltersForCustomer - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class GetFiltersForCustomer
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public GetFiltersForCustomer(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public AdminFilter[] getFiltersForCustomer(String sessionId, int custId) throws KKAdminException
     {
         return kkAdminEng.getFiltersForCustomer(sessionId, custId);
     }
}