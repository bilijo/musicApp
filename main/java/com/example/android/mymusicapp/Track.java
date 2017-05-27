package com.example.android.mymusicapp;

/**
 * Created by dam on 27.05.2017.
 */

public class Track {

    private String mTrackName;
    private int mImageResourceId;


    public Track(String vTrackName){
        mTrackName = vTrackName;
    }


    /**
     * Get the name of the Track
     */
    public String getTrackTitle()
    {
        return mTrackName;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
