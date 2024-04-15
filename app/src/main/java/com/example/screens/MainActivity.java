package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;
    int amountOfCookies = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                amountOfCookies++;
                Intent intent = new Intent(MainActivity.this, CookieActivity.class);
                intent.putExtra("name", "Amount of Cookies: ");
                intent.putExtra("number", amountOfCookies);
                startActivity(intent);
            }
        });
    }





}
