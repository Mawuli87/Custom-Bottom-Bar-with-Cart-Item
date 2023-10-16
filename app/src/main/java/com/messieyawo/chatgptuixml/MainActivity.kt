package com.messieyawo.chatgptuixml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cartItemCountTextView = findViewById<TextView>(R.id.cartItemCount)
        val fabCart = findViewById<FloatingActionButton>(R.id.fabCart)

// To update the cart item count (e.g., when items are added to the cart):
        val itemCount = 5 // Replace with the actual item count
        cartItemCountTextView.text = itemCount.toString()
        cartItemCountTextView.visibility = if (itemCount > 0) View.VISIBLE else View.GONE

// Set a click listener for the FAB (for example, to open the cart activity)
        fabCart.setOnClickListener {
            // Implement your cart logic here
        }

    }
}