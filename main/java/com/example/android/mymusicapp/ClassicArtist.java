package com.example.android.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ClassicArtist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classic_artist);

        //*********************************************************************
        // Find the View that shows a Classic Music album
        TextView classicAlbum = (TextView) findViewById(R.id.classicAlbum1);

        // Set a click listener on that View
        classicAlbum.setOnClickListener(new View.OnClickListener(){
            // The code in this method will be executed when the Classic Album ButtonView is clicked on.
            @Override
            public void onClick (View view){
                Intent classicAlbumIntent = new Intent(ClassicArtist.this, ClassicAlbum.class);

                startActivity(classicAlbumIntent);
            }
        });
    }
}
