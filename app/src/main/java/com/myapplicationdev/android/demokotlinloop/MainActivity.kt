package com.myapplicationdev.android.demokotlinloop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            for (i in 1..5) {
                Log.d("Number ", i.toString())
            }
        }

        button2.setOnClickListener{
            var input = editText.text.toString()
            for (letter in input) {
                Log.d("MainActivity", letter.toString())
            }
        }
    }
}