package com.example.a25pm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Auto_page extends AppCompatActivity {

    Button Power,Auto,night,maunal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_page);


        Power = (Button)findViewById(R.id.button12);
        Auto=(Button)findViewById(R.id.button13);
        night=(Button)findViewById(R.id.button14);
        maunal=(Button)findViewById(R.id.button15);




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

        night.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),night_page.class);
                startActivity(intent);
            }
        });

        maunal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),manunl_page.class);
                startActivity(intent);
            }
        });



    }
}