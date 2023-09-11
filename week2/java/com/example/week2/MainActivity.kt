package com.example.week2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import java.util.*

class MainActivity : ComponentActivity() {
    private lateinit var Resulttextview : TextView
    private lateinit var Rolldicebutton : Button
    private lateinit var Diceimage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Resulttextview = findViewById(R.id.ResulttextView)
        Rolldicebutton = findViewById(R.id.Rolldicebutton)

        Rolldicebutton.setOnClickListener {
            rolldice()
        }
        Diceimage = findViewById(R.id.Diceimage)
    }
    private fun rolldice() {
        val random = Random()
        val randomno = random.nextInt(6) + 1
        val finaltext = "You rolled a $randomno"
        Resulttextview.text = finaltext
        val dimage = when (randomno) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }

        Diceimage.setImageResource(dimage)

    }
}

