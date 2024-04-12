package com.example.bmi_calculator;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Home extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button dailyButton = findViewById(R.id.daily);
        Button bmiButton = findViewById(R.id.bmi_calculator);
        Button recipesButton = findViewById(R.id.recipes);

        dailyButton.setOnClickListener(v -> {
            startActivity(new Intent(Home.this, Daily.class));
        });
        bmiButton.setOnClickListener(v -> {
            startActivity(new Intent(Home.this, BMI_Calculator.class));
        });
        recipesButton.setOnClickListener(v -> {
            startActivity(new Intent(Home.this, Recipes.class));
        });
    }
}