package com.example.android.mymusicapp;

/**
 * Created by dam on 23.05.2017.
 */
import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ArtistAdapter extends ArrayAdapter<Artist>{

    public ArtistAdapter(Activity context, List<Artist> artists ) {
        super(context, 0, artists);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.classic_artist_list, parent, false);

        }

        // Get the {@link Artist} object located at this position in the list
        Artist currentClassicArtist = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.artist_name);
        // Get the version name from the current Artist object and
        // set this text on the name TextView
        nameTextView.setText(currentClassicArtist.getArtistName());


        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current Artist object and
        // set the image to iconView
        iconView.setImageResource(currentClassicArtist.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
