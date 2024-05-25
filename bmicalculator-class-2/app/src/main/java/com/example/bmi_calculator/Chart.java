package com.example.bmi_calculator;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class Chart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new ChartView(this));
    }

    private class ChartView extends View {
        private Paint paint;
        private List<Float> bmiValues;

        public ChartView(Chart context) {
            super(context);
            paint = new Paint();
            bmiValues = new ArrayList<>();

            bmiValues.add(18f);
            bmiValues.add(22f);
            bmiValues.add(15f);
            bmiValues.add(30f);
            bmiValues.add(34f);
            bmiValues.add(36f);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            float width = getWidth();
            float height = getHeight();
            float margin = 100f;

            paint.setColor(Color.BLACK);
            paint.setStrokeWidth(5);

            canvas.drawLine(margin, height - margin, width - margin, height - margin, paint); // Oś X
            canvas.drawLine(margin, height - margin, margin, margin, paint); // Oś Y

            float previousX = margin;
            float previousY = height - margin - bmiValues.get(0) * 10;
            paint.setTextSize(55);
            canvas.drawText("BMI", 0, getHeight()-margin-10, paint);
            for (int i = 1; i < bmiValues.size(); i++) {
                float x = margin + (i * (width - 2 * margin) / (bmiValues.size() - 1));
                float y = height - margin - bmiValues.get(i) * 10;

                canvas.drawCircle(x, y, 8, paint);
                canvas.drawLine(previousX, previousY, x, y, paint);

                previousX = x;
                previousY = y;
            }
        }
    }
}