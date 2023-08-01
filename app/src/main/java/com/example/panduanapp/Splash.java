package com.example.panduanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splash.this, MainActivity.class));
            }
        }, 3000);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.hasExtra("exit")) {
            setIntent(intent);
        }
    }
    @Override
    protected void onResume() {
        super.onResume();
        if (getIntent() != null) {
            if (("exit").equalsIgnoreCase(getIntent().getStringExtra(("exit")))) {
                onBackPressed();
            }
        }
    }
}