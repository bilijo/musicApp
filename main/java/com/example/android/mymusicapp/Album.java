package com.example.android.mymusicapp;

/**
 * Created by dam on 26.05.2017.
 */

public class Album {

    private String mAlbumTitle;

    // constructor
      public Album(String vAlbumName){
          mAlbumTitle = vAlbumName;

     }

    /**
     * Get the name of the Album
     */
    public String getAlbumTitle() {
        return mAlbumTitle;
    }
}
