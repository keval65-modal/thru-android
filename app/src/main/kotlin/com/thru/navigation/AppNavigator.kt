package com.thru.navigation

import android.content.Context
import android.content.Intent
import com.thru.screens.CheckoutScreen
import com.thru.screens.VendorDetailScreen

class AppNavigator {
    fun navigateToVendorDetail(context: Context) {
        val intent = Intent(context, VendorDetailScreen::class.java)
        context.startActivity(intent)
    }

    fun navigateToCheckout(context: Context) {
        val intent = Intent(context, CheckoutScreen::class.java)
        context.startActivity(intent)
    }
}
