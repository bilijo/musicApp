package com.example.android.mymusicapp;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ClassicArtist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classic_artist);

        // Create an ArrayList of Albums objects
        ArrayList<Album> classicAlbums = new ArrayList<>();

        // get param from ClassicMusic
        Intent recupIntent = getIntent();
        String vArtistName = recupIntent.getStringExtra("IntentArtistName");
        Log.d("ClassicArtist", "IntentArtistName" + vArtistName);


        // check the name os the artist to display the corresponding album
        if (vArtistName.equals("Berlioz")){

            classicAlbums.add(new Album("Symphonie fantastique - Berlioz",  R.drawable.ic_play_arrow_black_48dp));

        }else if (vArtistName.equals("Beethoven")){

            classicAlbums.add(new Album("Symphonie nº 1 - Beethoven",R.drawable.ic_play_arrow_black_48dp));
        }


        // create adapter for albums' list
        AlbumAdapter albumAdapter = new AlbumAdapter(this, classicAlbums);

        //*********************************************************************
        // Find the View that shows a Music album
        ListView listView = (ListView) findViewById(R.id.listview_album);

        // make album item clickable
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                String inName = ((TextView) view.findViewById(R.id.album_name)).getText().toString();
                //Artist inName = (Artist) parent.getItemAtPosition(position);

                Intent albumIntent = new Intent(ClassicArtist.this, ClassicAlbum.class);
                albumIntent.putExtra("IntentAlbumName", inName);
                startActivity(albumIntent);

                Log.d("ClassicArtist", "IntentAlbumName" + albumIntent);

            }
        });



        listView.setAdapter(albumAdapter);
    }
}
