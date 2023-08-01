package com.example.panduanapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class luarjawa extends AppCompatActivity implements View.OnClickListener {

    private CardView jaya, kerinci, rinjani;
    private Button btn_back_home;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luarjawa);

        jaya = findViewById(R.id.jaya);
        kerinci = findViewById(R.id.kerinci);
        rinjani = findViewById(R.id.rinjani);
        btn_back_home = findViewById(R.id.btn_back_home);

        jaya.setOnClickListener(this);
        kerinci.setOnClickListener(this);
        rinjani.setOnClickListener(this);
        btn_back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.jaya:  i = new Intent(this, jayawijaya.class); startActivity(i); break;
            case R.id.kerinci:  i = new Intent(this, kerinci.class); startActivity(i); break;
            case R.id.rinjani:  i = new Intent(this, rinjani.class); startActivity(i); break;
        }
    }
}