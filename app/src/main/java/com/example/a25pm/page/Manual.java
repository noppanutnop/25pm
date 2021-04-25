package com.example.a25pm.page;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import com.example.a25pm.R;

public class Manual extends AppCompatActivity {

    Button Power, Auto, Night, Manual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manunl_page);

        Power = (Button) findViewById(R.id.button20);

        Auto = (Button) findViewById(R.id.button21);

        Night = (Button) findViewById(R.id.button22);

        Manual = (Button) findViewById(R.id.button23);

        Power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Off.class);
                startActivity(intent);
            }
        });

        Auto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), com.example.a25pm.page.Auto.class);
                startActivity(intent);
            }
        });

        Night.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), com.example.a25pm.page.Night.class);
                startActivity(intent);
            }
        });

        Manual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), com.example.a25pm.page.Manual.class);
                startActivity(intent);
            }
        });
    }
}