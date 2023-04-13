package com.example.fullyfunctionalapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btn1 = findViewById<Button>(R.id.button2)

        btn1.setOnClickListener {
            Toast.makeText(applicationContext, "Opening Phone", Toast.LENGTH_SHORT).show()

            val callIntent = Intent(Intent.ACTION_DIAL)
            callIntent.data = Uri.parse("tel:" + 123456789) //change the number

            startActivity(callIntent)
        }

        val card1 = findViewById<CardView>(R.id.cardView)
        card1.setOnClickListener {
            Toast.makeText(applicationContext, "Android", Toast.LENGTH_SHORT).show()
            intent = Intent(applicationContext, AndroidDev::class.java)
            startActivity(intent)
        }
    }
}