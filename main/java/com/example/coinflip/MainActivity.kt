package com.example.coinflip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val coinSides :List<String> = listOf("heads","tails")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flipButton = findViewById<Button>(R.id.button)
        val textViewResult = findViewById<TextView>(R.id.textView)

        flipButton.setOnClickListener {
            val random: Int = (0 until (coinSides.size)).random()
            textViewResult.text = coinSides[random]
        }
    }
}