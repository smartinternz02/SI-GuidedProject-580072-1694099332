package com.example.week4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity4 : AppCompatActivity() {
    private lateinit var prev : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        prev = findViewById(R.id.prev)
        prev.setOnClickListener {
            val Intent2 = Intent(this,MainActivity2 ::class.java)
            startActivity(Intent2)
        }
    }
}