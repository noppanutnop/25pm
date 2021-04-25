package com.example.a25pm.page;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import com.example.a25pm.R;

public class Off extends AppCompatActivity {


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
                Intent intent = new Intent(getApplicationContext(), Day.class);
                startActivity(intent);
            }
        });

        auto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Auto.class);
                startActivity(intent);
            }
        });

        Power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Off.class);
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