package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cube extends AppCompatActivity {

    EditText cubeRadius;
    TextView cubeResult;
    Button cubeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);
        cubeRadius = findViewById(R.id.cubeRadius);
        cubeResult = findViewById(R.id.cubeResult);
        cubeButton = findViewById(R.id.cubeButton);

        cubeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double r = Double.parseDouble(cubeRadius.getText().toString());
                r = (r * r * r);
                cubeResult.setText("Result: " + r + "m^3");
            }
        });
    }
}