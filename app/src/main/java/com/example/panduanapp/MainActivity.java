package com.example.panduanapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView jabar, jateng, jatim, luarjawa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jabar = findViewById(R.id.jabar);
        jateng = findViewById(R.id.jateng);
        jatim = findViewById(R.id.jatim);
        luarjawa = findViewById(R.id.luarjawa);

        jabar.setOnClickListener(this);
        jateng.setOnClickListener(this);
        jatim.setOnClickListener(this);
        luarjawa.setOnClickListener(this);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.bottom_home);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.bottom_home:
                    // Kode yang ingin Anda lakukan ketika memilih bottom_home
                    return true;
                case R.id.bottom_article:
                    startActivity(new Intent(getApplicationContext(), ArticleActivity.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    return true; // Tidak ada "finish()" di sini
            }
            return false;
        });
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.jabar:  i = new Intent(this, activity_jabar.class); startActivity(i); break;
            case R.id.jateng:  i = new Intent(this, JatengActivity.class); startActivity(i); break;
            case R.id.jatim:  i = new Intent(this, Jatim.class); startActivity(i); break;
            case R.id.luarjawa:  i = new Intent(this, luarjawa.class); startActivity(i); break;
        }
    }
}
