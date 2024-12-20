package com.thru.components

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.thru.model.Vendor

class VendorListAdapter(private val vendors: List<Vendor>) : RecyclerView.Adapter<VendorViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VendorViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.vendor_item, parent, false)
        return VendorViewHolder(view)
    }

    override fun onBindViewHolder(holder: VendorViewHolder, position: Int) {
        val vendor = vendors[position]
        holder.bind(vendor)
    }

    override fun getItemCount(): Int {
        return vendors.size
    }
}
