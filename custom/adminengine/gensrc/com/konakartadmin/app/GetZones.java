package com.konakartadmin.app;

import com.konakartadmin.appif.*;
import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - GetZones - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class GetZones
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public GetZones(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public AdminZoneSearchResult getZones(AdminZoneSearch search, int offset, int size) throws KKAdminException
     {
         return kkAdminEng.getZones(search, offset, size);
     }
}
