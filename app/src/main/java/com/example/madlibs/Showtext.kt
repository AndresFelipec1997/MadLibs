package com.example.madlibs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_showtext.*

class Showtext : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_showtext)
        val objetoIntent: Intent = intent
        var nombre = objetoIntent.getStringExtra("texto")

     TextTxt.text=nombre

    }
}