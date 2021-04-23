package com.example.a25pm

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var Next: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        Next = findViewById<View>(R.id.button1) as Button
        Next!!.setOnClickListener {
            val intent = Intent(applicationContext, login::class.java)
            startActivity(intent)
        }
    }
}