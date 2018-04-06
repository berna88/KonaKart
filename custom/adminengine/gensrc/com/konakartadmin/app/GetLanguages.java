package com.konakartadmin.app;

import com.konakartadmin.appif.*;
import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - GetLanguages - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class GetLanguages
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public GetLanguages(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public AdminLanguageSearchResult getLanguages(AdminLanguageSearch search) throws KKAdminException
     {
         return kkAdminEng.getLanguages(search);
     }
}
