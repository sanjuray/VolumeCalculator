package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sphere extends AppCompatActivity {

    EditText sphereRadius;
    TextView sphereResult;
    Button sphereButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);
        sphereRadius = findViewById(R.id.sphereRadius);
        sphereResult = findViewById(R.id.sphereResult);
        sphereButton = findViewById(R.id.sphereButton);

        sphereButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double r = Double.parseDouble(sphereRadius.getText().toString());
                r = (4/3 * 3.14 * r * r * r);
                sphereResult.setText("Result: "+r+"m^3");
            }
        });
    }
}