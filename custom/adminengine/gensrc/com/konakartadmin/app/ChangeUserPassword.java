package com.konakartadmin.app;

import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - ChangeUserPassword - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class ChangeUserPassword
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public ChangeUserPassword(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public void changeUserPassword(String user, String currentPassword, String newPassword) throws KKAdminException
     {
         kkAdminEng.changeUserPassword(user, currentPassword, newPassword);
     }
}