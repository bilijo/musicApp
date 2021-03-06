package com.example.android.mymusicapp;

import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.resource;
/**
 * Created by dam on 26.05.2017.
 */

public class AlbumAdapter extends ArrayAdapter<Album> {

    public AlbumAdapter(Activity context, List<Album> albumList) {
        super(context, 0, albumList);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.album_list, parent, false);

        }

        // Get the {@link Artist} object located at this position in the list
        Album currentAlbum = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.album_name);
        // Get the version name from the current Artist object and
        // set this text on the name TextView
        nameTextView.setText(currentAlbum.getAlbumTitle());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current Artist object and
        // set the image to iconView
        iconView.setImageResource(currentAlbum.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView

        return listItemView;
    }
}


