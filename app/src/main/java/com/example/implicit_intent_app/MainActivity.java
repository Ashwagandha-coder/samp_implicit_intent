package com.example.implicit_intent_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickOpenWebpageButton(View view) {

        openWebPage("https://www.google.com");

    }


    public void onClickOpenMapButton(View view) {

        Intent intent = new Intent(Intent.ACTION_VIEW);

        Uri adressUri = Uri.parse("geo:0,0")
                .buildUpon()
                .appendQueryParameter("q","Тверская улица, 1")
                .build();

        intent.setData(adressUri);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    public void yourOwnImplicitIntent(View view) {

        String tel = "(212) 555 1212";

        dialPhoneNumber(tel);

    }


    public void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void dialPhoneNumber(String phoneNumber) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

}