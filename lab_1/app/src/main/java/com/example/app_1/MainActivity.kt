package com.example.app_1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val startBtn: ImageButton = findViewById(R.id.helloButton)
        val text: TextView = findViewById(R.id.helloText)
        val image: ImageView = findViewById(R.id.helloImage)

        startBtn.setOnClickListener(View.OnClickListener {
            startBtn.visibility = View.INVISIBLE
            text.visibility = View.VISIBLE
            image.visibility = View.VISIBLE
            startBtn.isClickable = false
        })

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}