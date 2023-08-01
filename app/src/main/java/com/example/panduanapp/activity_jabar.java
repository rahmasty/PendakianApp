package com.example.panduanapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class activity_jabar extends AppCompatActivity implements View.OnClickListener {
    private CardView gede, cikuray, ciremai;
    private Button btn_back_home;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jabar);
        gede = findViewById(R.id.gede);
        cikuray = findViewById(R.id.cikuray);
        ciremai = findViewById(R.id.ciremai);
        btn_back_home = findViewById(R.id.btn_back_home);

        gede.setOnClickListener(this);
        cikuray.setOnClickListener(this);
        ciremai.setOnClickListener(this);
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
            case R.id.gede:  i = new Intent(this, gede.class); startActivity(i); break;
            case R.id.cikuray:  i = new Intent(this, cikuray.class); startActivity(i); break;
            case R.id.ciremai:  i = new Intent(this, ciremai.class); startActivity(i); break;
        }
    }
}

