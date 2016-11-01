package com.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link PlaceAdapter} is an ArrayAdapter that can provide the layout for each list item
 * based on a data source which is the Place Objects
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    /* Modified to include the background color for the list of words */

    private int mResourceColorId;

    /**
     * Create a new Place Object
     *
     * @param context is the current context that the adapter is being created in
     * @param places is the list of words to be displayed
     * @param colorResourceId is the resourceID for the background color
     * */
    public PlaceAdapter(Context context, ArrayList<Place> places, int colorResourceId) {
        super(context, 0, places);
        mResourceColorId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check if currentview is being reused otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Get the place object for this position
        Place currentPlace = getItem(position);

        //Find the textview in the list item layout with the correct ID
        TextView placeTextview = (TextView) listItemView.findViewById(R.id.place_textview);

        //Get the word and set it on the textview
        placeTextview.setText(currentPlace.getLocation());

        //Find the address textview which will go below the name of the place
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_textview);

        //This sets the address
        addressTextView.setText(currentPlace.getAddress());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentPlace.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentPlace.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        //Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        //Find the color that it corresponds with
        int color = ContextCompat.getColor(getContext(), mResourceColorId);
        //Set the background color of the text container view
        textContainer.setBackgroundColor(color);

        //Finally, return the whole list item layout so that it can be shown in the listview
        return listItemView;
    }
}
