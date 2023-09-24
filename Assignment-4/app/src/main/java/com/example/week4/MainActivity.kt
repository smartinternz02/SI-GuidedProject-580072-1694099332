package com.example.week4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var loginbutton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginbutton = findViewById(R.id.loginbutton)
        loginbutton.setOnClickListener {
            val Intent = Intent(this,MainActivity2 ::class.java)
            startActivity(Intent)
        }


    }
}