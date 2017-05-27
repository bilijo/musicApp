package com.example.android.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class ClassicAlbum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classic_album);

        // Create an ArrayList of tracks objects
        ArrayList<Track> classicAlbums = new ArrayList<>();


// get param from ClassicArtist
        Intent recupIntent = getIntent();
        String vTrackName = recupIntent.getStringExtra("IntentTrackName");
        Log.d("ClassicAlbum", "IntentTrackName" + vTrackName);


    }

}
