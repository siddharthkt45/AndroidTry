package com.e.mapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class HomeActivity extends AppCompatActivity {

    private TextView textView;
    private static int timeout = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() { 
                startActivity(new Intent(HomeActivity.this, MainActivity.class));
                finish();
            }
        },timeout);
        textView = findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener{
            @Override
            public void onClick() {
                startActivity(new Intent(HomeActivity.this, MainActivity2.class);
                finish();
            }
        });
    }
}
