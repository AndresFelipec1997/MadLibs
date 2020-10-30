package com.example.madlibs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


import kotlinx.android.synthetic.main.activity_main.*
import java.io.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        StartButton.setOnClickListener{
       readList()
           // val intent = Intent(this,FillTheWords ::class.java)
           /* var intent = Intent(this, FillTheWords::class.java)
            startActivity(intent)*/
        }

    }

    fun readList(){

        var file : File
        file= getFileStreamPath("lib1.txt")
        if (file.exists()){
           // val input =Scanner(openFileInput("lib1.txt"))

            var inputAsString = resources.openRawResource(R.raw.lib1).bufferedReader().use { it.readText() }


            Log.d("variable","variable $inputAsString")
            /*while (inputAsString.lineSequence() == null){
                inputAsString.replace("<adjective>","asdasd")

            }*/
            var intent = Intent(this, FillTheWords::class.java)
            intent.putExtra("texto",inputAsString)
            startActivity(intent)



        }else
        {
            android.widget.Toast.makeText(this, "No hay lista para ver", android.widget.Toast.LENGTH_SHORT).show()
        }

    }

    }

