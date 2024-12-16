package com.thru.components

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.thru.R
import com.thru.models.Vendor

class VendorList(private val vendors: List<Vendor>) : BaseAdapter() {
    override fun getCount(): Int = vendors.size

    override fun getItem(position: Int): Vendor = vendors[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: LayoutInflater.from(parent?.context).inflate(R.layout.item_vendor, parent, false)
        val vendor = getItem(position)
        view.findViewById<TextView>(R.id.vendorName).text = vendor.name
        return view
    }
}
