package com.example.panduanapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ArticleActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView makanan, p3k, cara, peralatan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);

        makanan = findViewById(R.id.makanan);
        p3k = findViewById(R.id.p3k);
        cara = findViewById(R.id.cara);
        peralatan = findViewById(R.id.peralatan);

        makanan.setOnClickListener(this);
        p3k.setOnClickListener(this);
        cara.setOnClickListener(this);
        peralatan.setOnClickListener(this);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.bottom_home);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.bottom_home:
                    return true;
                case R.id.bottom_article:
                    startActivity(new Intent(getApplicationContext(), ArticleActivity.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish();
                    return true;
            }
            return false;
        });
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.makanan:  i = new Intent(this, makanan.class); startActivity(i); break;
            case R.id.p3k:  i = new Intent(this, obat.class); startActivity(i); break;
            case R.id.cara:  i = new Intent(this, tatacara.class); startActivity(i); break;
            case R.id.peralatan:  i = new Intent(this, peralatan.class); startActivity(i); break;
        }
    }
}