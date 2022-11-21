package com.example.cv_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sentences = mutableListOf("sentence 1")
        sentences += ("sentence 2")
        sentences += ("sentence 3")
        sentences += ("sentence 4")
        sentences += ("sentence 5")
        sentences += ("sentence 6")
        sentences += ("sentence 7")
        sentences += ("sentence 8")
        sentences += ("sentence 9")
        sentences += ("sentence 10")
        print (sentences)


    }
}