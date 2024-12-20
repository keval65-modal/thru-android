package com.thru.components

import android.content.Context
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.MarkerOptions

class LocationMarker(private val context: Context)
{
    fun addMarker(map : GoogleMap, latitude : Double, Longitude: Double, title : String)
    {
        val markerOptions = MarkerOptions().position(LatLng(latitude, Longitude)).title(title)
        map.addMarke(markerOptions)
    }
}