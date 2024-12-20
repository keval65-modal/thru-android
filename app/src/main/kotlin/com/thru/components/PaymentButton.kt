package com.thru.components

import android.content.Context
import android.util.AttributeSet
import android.widget.Button

class PaymentButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : Button(context, attrs, defStyleAttr) {
    init {
        text = "Pay Now"
        setOnClickListener {
            // Trigger payment process
        }
    }
}
