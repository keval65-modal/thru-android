package com.thru

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.thru.navigation.AppNavigator
import com.thru.screens.HomeScreen

class MainActivity : AppCompatActivity() {
    private lateinit var appNavigator: AppNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        appNavigator = AppNavigator()
    }
}
