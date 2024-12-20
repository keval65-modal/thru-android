package com.thru

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.thru.navigation.AppNavigator

class MainActivity : AppCompatActivity() {
    private lateinit var navigator: AppNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigator = AppNavigator(this)
        navigator.navigateToHome()
    }
}
