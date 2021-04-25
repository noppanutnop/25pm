package com.example.a25pm.page

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a25pm.R
import android.content.Intent
import android.view.View
import android.widget.Button
import com.example.a25pm.AirRepository
import com.example.a25pm.page.Off
import com.example.a25pm.page.Auto
import com.example.a25pm.page.Day
import com.example.a25pm.page.Manual
import kotlinx.android.synthetic.main.activity_night_page.*

class Night : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_night_page)

        AirRepository().getResponse {
            it.apply {
                textViewNightPM.text = pm25
                textViewNightHumidity.text = humidity
                textViewNightTemp.text = temperature
                textViewNightRemain.text = remain
            }
        }

        button16?.setOnClickListener {
            val intent = Intent(applicationContext, Off::class.java)
            startActivity(intent)
        }
        button17?.setOnClickListener {
            val intent = Intent(applicationContext, Auto::class.java)
            startActivity(intent)
        }
        button18?.setOnClickListener {
            val intent = Intent(applicationContext, Day::class.java)
            startActivity(intent)
        }
        button19?.setOnClickListener {
            val intent = Intent(applicationContext, Manual::class.java)
            startActivity(intent)
        }
    }

}