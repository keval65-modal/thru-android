package com.thru.services

import com.thru.models.Vendor

class VendorService {
    private val vendors = mutableListOf<Vendor>()

    fun getVendors(): List<Vendor> {
        return vendors
    }

    fun addVendor(vendor: Vendor) {
        vendors.add(vendor)
    }
}
