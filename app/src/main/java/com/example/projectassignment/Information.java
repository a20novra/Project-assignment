package com.example.projectassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String name     = bundle.getString("name");
            String size     = bundle.getString("size");
            String cost     = bundle.getString("cost");
            String location = bundle.getString("location");
            String auxdata  = bundle.getString("auxdata");

            TextView textViewName = findViewById(R.id.name);
            TextView textViewSize = findViewById(R.id.size);
            TextView textViewCost = findViewById(R.id.cost);
            TextView textViewLocation = findViewById(R.id.location);
            ImageView imageView = findViewById(R.id.imageView);

            textViewName.setText("Name: " + name);
            textViewSize.setText("Size: " + size);
            textViewCost.setText("Cost: " + cost);
            textViewLocation.setText("Location: " + location);
            imageView.setImageResource(Integer.parseInt(auxdata));


        }
    }
}