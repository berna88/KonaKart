package com.konakartadmin.app;

import com.konakartadmin.appif.*;
import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - RemoveTagGroupsFromCategory - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class RemoveTagGroupsFromCategory
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public RemoveTagGroupsFromCategory(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public void removeTagGroupsFromCategory(String sessionId, AdminTagGroup[] tagGroups, int categoryId) throws KKAdminException
     {
         kkAdminEng.removeTagGroupsFromCategory(sessionId, tagGroups, categoryId);
     }
}