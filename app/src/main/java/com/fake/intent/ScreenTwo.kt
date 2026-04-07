package com.fake.intent

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ScreenTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_screen_two)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val name = intent.getStringExtra("Mam's name")

        val tvText = findViewById<TextView>(R.id.tvText)
        val btnIntent = findViewById<Button>(R.id.btnIntent)
        val btnExit = findViewById<Button>(R.id.btnExit)

        btnIntent.setOnClickListener {
            tvText.text = name
        }

        btnExit.setOnClickListener {
            finishAffinity()
        }
    }
}