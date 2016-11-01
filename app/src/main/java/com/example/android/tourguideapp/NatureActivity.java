package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by SmritiDas on 2016-10-12.
 */

public class NatureActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);
        ArrayList<Place> places = new ArrayList<Place>();

        //Created a list of locations
        places.add(new Place("Scarborough Bluffs", "61 Under Cliff Drive", R.drawable.ic_landscape));
        places.add(new Place("Rouge Park", "Meadowvale Road", R.drawable.ic_landscape));
        places.add(new Place("Rouge Beach", "195 Rouge Hills Drive", R.drawable.ic_landscape));
        places.add(new Place("Toronto Zoo", "2000 Meadowvale Drive", R.drawable.ic_landscape));
        places.add(new Place("Colonel Danforth Park", "73 Colonel Danforth Trail", R.drawable.ic_landscape));

        //Create a {@link PlaceAdapter} whose data source is places from {@link Place}
        //The adapter knows how to create list items for each item
        PlaceAdapter adapter =
                new PlaceAdapter(this, places, R.color.category_nature);

        //Find the {@link ListView} object in the view hierarchy of the {@link Activity}
        //There should be a {@link ListView} with the view which is declared in the
        //word_list.xml file
        ListView listView = (ListView)findViewById(R.id.list);

        //Make the ListView use the WordAdapter we created above so that
        //it will display the list items for each in the list
        listView.setAdapter(adapter);
    }
}
