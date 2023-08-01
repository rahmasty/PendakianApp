package com.example.panduanapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class JatengActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView lawu, merapi, merbabu;
    private Button btn_back_home;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jateng);

        lawu = findViewById(R.id.lawu);
        merapi = findViewById(R.id.merapi);
        merbabu = findViewById(R.id.merbabu);
        btn_back_home = findViewById(R.id.btn_back_home);

        lawu.setOnClickListener(this);
        merapi.setOnClickListener(this);
        merbabu.setOnClickListener(this);
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
            case R.id.lawu:  i = new Intent(this, lawu.class); startActivity(i); break;
            case R.id.merapi:  i = new Intent(this, merapi.class); startActivity(i); break;
            case R.id.merbabu:  i = new Intent(this, merbabu.class); startActivity(i); break;
        }
    }
}