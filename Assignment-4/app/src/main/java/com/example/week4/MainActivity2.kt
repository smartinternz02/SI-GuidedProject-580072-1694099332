package com.example.week4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity2 : AppCompatActivity() {
    private lateinit var back : ImageButton
    private lateinit var mcd : ImageButton
    private lateinit var taco : ImageButton
    private lateinit var domino : ImageButton
    private lateinit var chaat : ImageButton
    private lateinit var sandwich : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        back= findViewById(R.id.back)
        mcd = findViewById(R.id.mcd)
        taco = findViewById(R.id.taco)
        domino= findViewById(R.id.domino)
        chaat = findViewById(R.id.chaat)
        sandwich = findViewById(R.id.sandwich)

        back.setOnClickListener {
            val Intent = Intent(this,MainActivity ::class.java)
            startActivity(Intent)
        }

        mcd.setOnClickListener {
            val Intent1 = Intent(this,MainActivity3 ::class.java)
            startActivity(Intent1)
        }
        taco.setOnClickListener {
            val Intent1 = Intent(this,MainActivity4 ::class.java)
            startActivity(Intent1)
        }
        domino.setOnClickListener {
            val Intent1 = Intent(this,MainActivity5 ::class.java)
            startActivity(Intent1)
        }
        chaat.setOnClickListener {
            val Intent1 = Intent(this,MainActivity6 ::class.java)
            startActivity(Intent1)
        }
        sandwich.setOnClickListener {
            val Intent1 = Intent(this,MainActivity7 ::class.java)
            startActivity(Intent1)
        }

    }
}