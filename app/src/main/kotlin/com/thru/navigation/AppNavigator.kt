package com.thru.navigation

import android.content.Context
import android.content.Intent
import com.thru.screens.HomeScreen
import com.thru.screens.VendorDetailScreen
import com.thru.screens.CheckoutScreen

class AppNavigator(private val context: Context) {
    fun navigateToHome() {
        val intent = Intent(context, HomeScreen::class.java)
        context.startActivity(intent)
    }

    fun navigateToVendorDetail() {
        val intent = Intent(context, VendorDetailScreen::class.java)
        context.startActivity(intent)
    }

    fun navigateToCheckout() {
        val intent = Intent(context, CheckoutScreen::class.java)
        context.startActivity(intent)
    }
}
