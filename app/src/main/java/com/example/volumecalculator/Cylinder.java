package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Cylinder extends AppCompatActivity {

    EditText cylinderRadius, cylinderHeight;
    TextView cylinderResult;
    Button cylinderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);
        cylinderRadius = findViewById(R.id.cylinderRadius);
        cylinderResult = findViewById(R.id.cylinderResult);
        cylinderButton = findViewById(R.id.cylinderButton);
        cylinderHeight = findViewById(R.id.cylinderHeight);

        cylinderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double r = Double.parseDouble(cylinderRadius.getText().toString());
                double h = Double.parseDouble(cylinderHeight.getText().toString());
//                Toast.makeText(getApplicationContext(), "r: "+r+" h: "+h,Toast.LENGTH_SHORT).show();
                double result = (r * r * h * 3.14 * 1 / 3);
                cylinderResult.setText("Result: " + result + "m^3");
            }
        });
    }
}