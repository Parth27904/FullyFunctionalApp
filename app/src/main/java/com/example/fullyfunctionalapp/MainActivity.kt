package com.example.fullyfunctionalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            Toast.makeText(applicationContext, "Let's Go", Toast.LENGTH_SHORT).show()
            intent = Intent(applicationContext , MainActivity2::class.java)
            startActivity(intent)
        }

    }
}