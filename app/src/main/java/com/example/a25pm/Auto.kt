package com.example.a25pm

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button

class Auto : AppCompatActivity() {
    var Power: Button? = null
    var Auto: Button? = null
    var night: Button? = null
    var maunal: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_page)
        Power = findViewById<View>(R.id.button12) as Button
        Auto = findViewById<View>(R.id.button13) as Button
        night = findViewById<View>(R.id.button14) as Button
        maunal = findViewById<View>(R.id.button15) as Button
        Power!!.setOnClickListener {
            val intent = Intent(applicationContext, Off_page::class.java)
            startActivity(intent)
        }
        Auto!!.setOnClickListener {
            val intent = Intent(applicationContext, Auto::class.java)
            startActivity(intent)
        }
        night!!.setOnClickListener {
            val intent = Intent(applicationContext, night_page::class.java)
            startActivity(intent)
        }
        maunal!!.setOnClickListener {
            val intent = Intent(applicationContext, manunl_page::class.java)
            startActivity(intent)
        }
    }
}