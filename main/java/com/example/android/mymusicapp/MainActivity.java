package com.example.android.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //*********************************************************************
        // Find the View that shows the Classic Music category
        TextView classic = (TextView) findViewById(R.id.Artist);

        // Set a click listener on that Classic View
        classic.setOnClickListener(new View.OnClickListener(){
            // The code in this method will be executed when the Classic Music ButtonView is clicked on.
            @Override
            public void onClick (View view){
                Intent classicIntent = new Intent(MainActivity.this, ClassicMusic.class);

                startActivity(classicIntent);
            }
        });

        //*********************************************************************
        // Find the View that shows the Jazz Music category
        TextView jazz = (TextView) findViewById(R.id.jazz);

        // Set a click listener on that Jazz View
        jazz.setOnClickListener(new View.OnClickListener(){
            // The code in this method will be executed when the Classic Music ButtonView is clicked on.
            @Override
            public void onClick (View view){
                Intent jazzIntent = new Intent(MainActivity.this, JazzMusic.class);

                startActivity(jazzIntent);

            }
        });


    }

}
