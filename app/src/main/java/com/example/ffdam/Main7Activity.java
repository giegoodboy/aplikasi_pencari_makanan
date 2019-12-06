package com.example.ffdam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        ImageView btn1 = (ImageView) findViewById(R.id.imageView15);
        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(Main7Activity.this,Main12Activity.class);
                startActivity(i);
            }
        });

        ImageView btn6 = (ImageView) findViewById(R.id.imageView27);
        btn6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(Main7Activity.this,Main8Activity.class);
                startActivity(i);
            }
        });

        Button btn2 = (Button) findViewById(R.id.button5);
        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(Main7Activity.this,Main9Activity.class);
                startActivity(i);
            }
        });

        Button btn3 = (Button) findViewById(R.id.button7);
        btn3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(Main7Activity.this,Main10Activity.class);
                startActivity(i);
            }
        });

        Button btn4 = (Button) findViewById(R.id.button6);
        btn4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent i = new Intent(Main7Activity.this,MapsActivity.class);
                startActivity(i);
            }
        });
    }
}
