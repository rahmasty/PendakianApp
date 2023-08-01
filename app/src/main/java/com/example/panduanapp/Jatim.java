package com.example.panduanapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Jatim extends AppCompatActivity implements View.OnClickListener {

    private CardView argopuro, arjuno, bromo;
    private Button btn_back_home;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jatim);

        argopuro = findViewById(R.id.argopuro);
        arjuno = findViewById(R.id.arjuno);
        bromo = findViewById(R.id.bromo);
        btn_back_home = findViewById(R.id.btn_back_home);

        argopuro.setOnClickListener(this);
        arjuno.setOnClickListener(this);
        bromo.setOnClickListener(this);
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
            case R.id.argopuro:  i = new Intent(this, Argopuro.class); startActivity(i); break;
            case R.id.arjuno:  i = new Intent(this, arjuno.class); startActivity(i); break;
            case R.id.bromo:  i = new Intent(this, bromo.class); startActivity(i); break;
        }
    }
}