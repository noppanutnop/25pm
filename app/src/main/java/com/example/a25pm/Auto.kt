package com.example.a25pm

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_auto_page.*

class Auto : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_page)

        button12?.setOnClickListener {
            val intent = Intent(applicationContext, Off_page::class.java)
            startActivity(intent)
        }

        button13?.setOnClickListener {
            val intent = Intent(applicationContext, Auto::class.java)
            startActivity(intent)
        }

        button14?.setOnClickListener {
            val intent = Intent(applicationContext, night_page::class.java)
            startActivity(intent)
        }

        button15?.setOnClickListener {
            val intent = Intent(applicationContext, manunl_page::class.java)
            startActivity(intent)
        }
    }
}