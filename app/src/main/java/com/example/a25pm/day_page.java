package com.example.a25pm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import  android.content.Intent;

public class day_page extends AppCompatActivity {

    Button Power,Auto,Night,Manunl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_page);


        Power = (Button)findViewById(R.id.button8);
        Auto = (Button)findViewById(R.id.button9);
        Night = (Button)findViewById(R.id.button10);
        Manunl = (Button)findViewById(R.id.button11);

        Power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Off_page.class);
                startActivity(intent);
            }
        });

        Auto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Auto_page.class);
                startActivity(intent);
            }
        });

        Night.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),night_page.class);
                startActivity(intent);
            }
        });

        Manunl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),manunl_page.class);
                startActivity(intent);
            }
        });


    }
}