package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Prism extends AppCompatActivity {

    EditText prismBase, prismHeight;
    TextView prismResult;
    Button prismButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);
        prismBase = findViewById(R.id.prismBase);
        prismResult = findViewById(R.id.prismResult);
        prismButton = findViewById(R.id.prismButton);
        prismHeight = findViewById(R.id.prismHeight);

        prismButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double b = Double.parseDouble(prismBase.getText().toString());
                double h = Double.parseDouble(prismHeight.getText().toString());
//                Toast.makeText(getApplicationContext(), "r: " + r + " h: " + h, Toast.LENGTH_SHORT).show();
                double result = (b * h);
                prismResult.setText("Result: " + result + "m^3");
            }
        });
    }
}