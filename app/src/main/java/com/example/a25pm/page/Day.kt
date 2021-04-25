package com.example.a25pm.page

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.a25pm.AirRepository
import com.example.a25pm.R
import kotlinx.android.synthetic.main.activity_auto_page.*
import kotlinx.android.synthetic.main.activity_day_page.*

class Day : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day_page)

        AirRepository().getResponse {
            it.apply {
                textViewDayTemp?.text = temperature
                textViewDayHumidity?.text = humidity
                textViewDayPM25?.text = pm25
                textViewDayRemain?.text = remain
            }
        }

        button8?.setOnClickListener {
            val intent = Intent(applicationContext, Off::class.java)
            startActivity(intent)
        }

        button9?.setOnClickListener {
            val intent = Intent(applicationContext, Auto::class.java)
            startActivity(intent)
        }

        button10?.setOnClickListener {
            val intent = Intent(applicationContext, Night::class.java)
            startActivity(intent)
        }

        button11?.setOnClickListener {
            val intent = Intent(applicationContext, Manual::class.java)
            startActivity(intent)
        }
    }
}