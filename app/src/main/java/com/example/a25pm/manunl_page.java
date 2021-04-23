package com.example.a25pm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class manunl_page extends AppCompatActivity {

    Button Power,Auto,Night,Manual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manunl_page);

        Power=(Button)findViewById(R.id.button20);

        Auto=(Button)findViewById(R.id.button21);

        Night=(Button)findViewById(R.id.button22);

        Manual=(Button)findViewById(R.id.button23);

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
                Intent intent = new Intent(getApplicationContext(), Auto.class);
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

        Manual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),manunl_page.class);
                startActivity(intent);
            }
        });
    }
}