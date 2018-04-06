package com.konakart.app;

import com.konakart.appif.*;

/**
 *  The KonaKart Custom Engine - GetVendors - Generated by CreateKKCustomEng
 */
@SuppressWarnings("all")
public class GetVendors
{
    KKEng kkEng = null;

    /**
     * Constructor
     */
     public GetVendors(KKEng _kkEng)
     {
         kkEng = _kkEng;
     }

     public VendorsIf getVendors(DataDescriptorIf dataDesc, VendorSearchIf search) throws KKException
     {
         return kkEng.getVendors(dataDesc, search);
     }
}