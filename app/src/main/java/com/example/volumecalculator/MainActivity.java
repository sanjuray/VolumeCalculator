package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Shape> shapeList;
    private MyCustomAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        shapeList = new ArrayList<>();

        Shape s1 = new Shape(R.drawable.sphere,"Sphere");
        Shape s2 = new Shape(R.drawable.cylinder,"Cylinder");
        Shape s3 = new Shape(R.drawable.cube,"Cube");
        Shape s4 = new Shape(R.drawable.prism,"Prism");
        shapeList.add(s1);
        shapeList.add(s2);
        shapeList.add(s3);
        shapeList.add(s4);

        myAdapter = new MyCustomAdapter(getApplicationContext(), shapeList);

        gridView.setAdapter(myAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String shape = myAdapter.getItem(position).getShapeName();
                try {
                    Intent i = new Intent(getApplicationContext(), Class.forName("com.example.volumecalculator."+shape));
                    startActivity(i);
                }catch (Exception e){e.printStackTrace();}
            }
        });
    }
}