package com.thru.components

import android.content.Context
import android.graphics.BitmapFactory
import android.location.Location
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.MarkerOptions

class LocationMarker {
    fun addMarker(map: GoogleMap, context: Context, location: Location) {
        val markerOptions = MarkerOptions()
            .position(com.google.android.gms.maps.model.LatLng(location.latitude, location.longitude))
            .icon(BitmapDescriptorFactory.fromBitmap(BitmapFactory.decodeResource(context.resources, R.drawable.ic_marker)))
        map.addMarker(markerOptions)
        map.moveCamera(CameraUpdateFactory.newLatLng(markerOptions.position))
    }
}
