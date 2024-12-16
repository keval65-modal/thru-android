package com.thru.components

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.Button

class PaymentButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : Button(context, attrs) {
    init {
        text = "Pay Now"
        setOnClickListener {
            // Trigger payment processing
        }
    }
}
