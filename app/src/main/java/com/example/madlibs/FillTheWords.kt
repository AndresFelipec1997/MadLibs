package com.example.madlibs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fill_the_words.*


class FillTheWords : AppCompatActivity() {
    var palabra0 = ""
    var palabra1 = ""
    var palabra2 = ""
    var palabra3 = ""
    var palabra4 = ""
    var palabra5 = ""
    var palabra6 = ""
    var palabra7 = ""
    var palabra8 = ""
    var palabra9 = ""
    var palabra10 = ""
    var palabra11 = ""
    var palabra12 = ""
    var palabra13 = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fill_the_words)

        val objetoIntent: Intent = intent
        var nombre = objetoIntent.getStringExtra("texto")

        txt_title.setText("FILL IN THE WORDS TO COMPLETE THE STORY!!")
        TxtWord.setText("Write an Adjective")
        var contador = 0

        btn_continuar.setOnClickListener {



            contador++

            if (contador == 1) {
                TxtWord.setText("Write a plural-noun")
                palabra1 = Edit.text.toString()

                Edit.text.clear()


            }


            if (contador == 2) {
                TxtWord.setText("Write a noun")
                palabra2 = Edit.text.toString()
                Edit.text.clear()


            }

            if (contador == 3) {
                TxtWord.setText("Write an adjective")
                palabra3 = Edit.text.toString()
                Edit.text.clear()


            }

            if (contador == 4) {
                TxtWord.setText("Write a place")
                palabra4 = Edit.text.toString()
                Edit.text.clear()

            }

            if (contador == 5) {
                TxtWord.setText("Write a plural-noun")
                palabra5 = Edit.text.toString()
                Edit.text.clear()

            }

            if (contador == 6) {
                TxtWord.setText("Write a noun")
                palabra6 = Edit.text.toString()
                Edit.text.clear()

            }

            if (contador == 7) {
                TxtWord.setText("Write a funny-noise")
                palabra7 = Edit.text.toString()
                Edit.text.clear()

            }

            if (contador == 8) {
                TxtWord.setText("Write an Adjective")
                palabra8 = Edit.text.toString()
                Edit.text.clear()

            }

            if (contador == 9) {
                TxtWord.setText("Write a noun")
                palabra9 = Edit.text.toString()
                Edit.text.clear()

            }

            if (contador == 10) {
                TxtWord.setText("Write an Adjective")
                palabra10 = Edit.text.toString()
                Edit.text.clear()

            }

            if (contador == 11) {
                TxtWord.setText("Write a plural-noun")
                palabra11 = Edit.text.toString()
                Edit.text.clear()

            }

            if (contador == 12) {
                TxtWord.setText("Write a person's-name")
                palabra12 = Edit.text.toString()
                Edit.text.clear()

            }


            if (contador == 13) {
                TxtWord.setText("")
                palabra13 = Edit.text.toString()
                Edit.text.clear()





                if (nombre != null) {

                    nombre = nombre!!.replace("<adjective>", " $palabra1 ")
                    nombre = nombre!!.replace("<plural-noun>", " $palabra2 ")
                    nombre = nombre!!.replace("<noun>", " $palabra3 ")
                    nombre = nombre!!.replace("<adjective1>", " $palabra4 ")
                    nombre = nombre!!.replace("<place>", " $palabra5 ")
                    nombre = nombre!!.replace("<plural-noun1>", " $palabra6 ")
                    nombre = nombre!!.replace("<noun1>", " $palabra7 ")
                    nombre = nombre!!.replace("<funny-noise>", " $palabra8 ")
                    nombre = nombre!!.replace("<adjective2>", " $palabra9 ")
                    nombre = nombre!!.replace("<noun2>", " $palabra10 ")
                    nombre = nombre!!.replace("<adjective3>", " $palabra11 ")
                    nombre = nombre!!.replace("<plural-noun1>", " $palabra12 ")
                    nombre = nombre!!.replace("<person's-name>", " $palabra13 ")


                    var intent = Intent(this, Showtext::class.java)
                    intent.putExtra("texto",nombre)
                    startActivity(intent)
                }




            }



        }


    }
}




