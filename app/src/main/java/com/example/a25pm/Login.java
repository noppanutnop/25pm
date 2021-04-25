package com.example.a25pm;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;

import com.example.a25pm.page.Off;

public class Login extends AppCompatActivity {

    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        next = (Button)findViewById(R.id.button31);

        next.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Off.class);
            startActivity(intent);
        });
    }

}