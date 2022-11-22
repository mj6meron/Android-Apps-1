package com.example.cv_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Importing
        var switchButton = findViewById<Button>(R.id.switchButton)
        var generatedText = findViewById<TextView>(R.id.generatedText)
        var imageView = findViewById<ImageView>(R.id.imageView)
        switchButton.setOnClickListener {

            var myText = generateSentence()
            generatedText.text = myText

            if (myText == "I like Messi!"){
                imageView.visibility = View.VISIBLE
            } else {
                imageView.visibility = View.INVISIBLE
            }

        }
    }

    fun generateSentence(): String{
        val sentences = mutableListOf("My name is Meron Habtemichael")
        sentences += ("I am a software development student")
        sentences += ("I live in Kristianstad")
        sentences += ("I like mobile development but more of cross platform than Native")
        sentences += ("I started programming when I was in highschool")
        sentences += ("I am passionate about Machine Learning!")
        sentences += ("I play basketball in my free time")
        sentences += ("I have lived in stockholm before coming to kristianstad")
        sentences += ("I am originally from Eritrea")
        sentences += ("I like Messi!")
        return (sentences[(0..9).random()])
    }
}