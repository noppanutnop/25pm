package com.example.a25pm.page

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.a25pm.AirRepository
import com.example.a25pm.R
import kotlinx.android.synthetic.main.activity_auto_page.*

class Auto : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_page)

        AirRepository().getResponse { data ->
            textViewHumidity.text = data.humidity
            textViewTemp.text = data.temperature
            textViewPM25.text = data.pm25
            textViewRemain.text = data.remain
        }

        buttonPower?.setOnClickListener {
            val intent = Intent(applicationContext, Off::class.java)
            startActivity(intent)
        }

        button13?.setOnClickListener {
            val intent = Intent(applicationContext, Auto::class.java)
            startActivity(intent)
        }

        button14?.setOnClickListener {
            val intent = Intent(applicationContext, Night::class.java)
            startActivity(intent)
        }

        button15?.setOnClickListener {
            val intent = Intent(applicationContext, Manual::class.java)
            startActivity(intent)
        }
    }

}