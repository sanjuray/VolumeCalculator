package com.example.volumecalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<Shape> {

    private ArrayList<Shape> shapesArrayList;
    Context context;

    public MyCustomAdapter(@NonNull Context context,ArrayList<Shape> shapesArrayList) {
        super(context, R.layout.grid_item_layout, shapesArrayList);
        this.shapesArrayList = shapesArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Shape shape = shapesArrayList.get(position);
        ViewHolder viewHolder;
        if(convertView == null){
            convertView = LayoutInflater.from(context)
                    .inflate(R.layout.grid_item_layout,
                            parent,
                            false);

            viewHolder = new ViewHolder();
            viewHolder.imageView = convertView.findViewById(R.id.imageView);
            viewHolder.textView = convertView.findViewById(R.id.textView);

            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.imageView.setImageResource(shape.getShapeImage());
        viewHolder.textView.setText(shape.getShapeName());

        return convertView;
    }

    private static class ViewHolder{
        ImageView imageView;
        TextView textView;
        ViewHolder(){}
    }
}
