package com.first.dialerredirect

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvBusinessName: TextView = findViewById(R.id.tvBusinessName)
        val tvBusinessDescription: TextView = findViewById(R.id.tvBusinessDescription)
        val btnContact: Button = findViewById(R.id.btnContact)

        // Replace with your business information
        tvBusinessName.text = "Your Business Name"
        tvBusinessDescription.text = "Description of your business activities."

        btnContact.setOnClickListener {
            // Replace with your contact information
            val contactUri = Uri.parse("tel: 1234567890") // Replace with your phone number
            val contactIntent = Intent(Intent.ACTION_DIAL, contactUri)
            startActivity(contactIntent)
        }
    }
}