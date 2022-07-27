package com.example.implicit_intent_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickOpenWebpageButton(View view) {

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Button was clicked", Toast.LENGTH_SHORT).show();

            }
        });

    }

    public void onClickOpenMapButton(View view) {

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Button was clicked", Toast.LENGTH_SHORT).show();

            }
        });

    }

    public void yourOwnImplicitIntent(View view) {

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Button was clicked", Toast.LENGTH_SHORT).show();

            }
        });

    }
}