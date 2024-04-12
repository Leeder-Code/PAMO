package com.example.bmi_calculator;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
//import android.window.SplashScreen;
import androidx.core.splashscreen.SplashScreen;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//    getSupportActionBar().hide();
        new Handler().postDelayed(() -> {
            startActivity(new Intent(MainActivity.this, Home.class));
            finish();
        }, 3000);
    }


}