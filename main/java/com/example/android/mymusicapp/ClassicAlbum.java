package com.example.android.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class ClassicAlbum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classic_album);

        // Create an ArrayList of Albums objects
        ArrayList<Album> classicAlbums = new ArrayList<>();

        classicAlbums.add(new ClassicAlbum("Symphonie nº 1 - Beethoven",R.drawable.ic_play_arrow_black_48dp));

        classicAlbums.add(new Artist("Symphonie fantastique - Berlioz",  R.drawable.ic_play_arrow_black_48dp));

    }

}
