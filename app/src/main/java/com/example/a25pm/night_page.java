package com.example.a25pm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class night_page extends AppCompatActivity {

    Button Power, Auto, day, mananl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_night_page);
        Power = (Button) findViewById(R.id.button16);
        Auto = (Button) findViewById(R.id.button17);
        day = (Button) findViewById(R.id.button18);
        mananl = (Button) findViewById(R.id.button19);

        Power.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Off_page.class);
            startActivity(intent);
        });

        Auto.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Auto_page.class);
            startActivity(intent);
        });

        day.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), day_page.class);
            startActivity(intent);
        });

        mananl.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), manunl_page.class);
            startActivity(intent);
        });

    }
}