package com.example.a25pm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Off_page extends AppCompatActivity {


    Button day,auto,Power,Manual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_off_page);

        day = (Button)findViewById(R.id.button3);
        auto = (Button)findViewById(R.id.button6);
        Power = (Button)findViewById(R.id.button5);
        Manual = (Button)findViewById(R.id.button7);

        day.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),day_page.class);
                startActivity(intent);
            }
        });

        auto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Auto_page.class);
                startActivity(intent);
            }
        });

        Power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Off_page.class);
                startActivity(intent);
            }
        });

        Manual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),manunl_page.class);
                startActivity(intent);
            }
        });
    }
}