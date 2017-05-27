package com.example.android.mymusicapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import static android.R.attr.resource;

/**
 * Created by dam on 27.05.2017.
 */

public class TrackAdapter extends ArrayAdapter<Track> {
    public TrackAdapter(Activity context, List<Track> trackList) {
        super(context, 0, trackList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.track_list, parent, false);

        }

        // Get the {@link Artist} object located at this position in the list
        Track currentTrack = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.track_name);
        // Get the version name from the current Artist object and
        // set this text on the name TextView
        nameTextView.setText(currentTrack.getTrackTitle());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current Artist object and
        // set the image to iconView
        iconView.setImageResource(currentTrack.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView

        return listItemView;
    }


}
