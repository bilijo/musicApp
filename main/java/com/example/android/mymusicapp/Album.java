package com.example.android.mymusicapp;

/**
 * Created by dam on 26.05.2017.
 */

public class Album {

    private String mAlbumTitle;
    private int mImageResourceId;

    // constructor
      public Album(String vAlbumName, int imageResourceId){
          mAlbumTitle = vAlbumName;
          mImageResourceId = imageResourceId;
     }

    /**
     * Get the name of the Album
     */
    public String getAlbumTitle()
    {
        return mAlbumTitle;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

}
