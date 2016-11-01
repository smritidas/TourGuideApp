package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by SmritiDas on 2016-10-12.
 */

public class RestaurantActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<Place> places = new ArrayList<Place>();

        //Created a list of locations
        places.add(new Place("Fratelli Village Pizzeria", "384 Old Kingston Road",R.drawable.ic_food));
        places.add(new Place("Peking Garden Restaurant", "4532 Kingston Road",R.drawable.ic_food));
        places.add(new Place("Mandalay Fusion", "3478 Lawrence Ave",R.drawable.ic_food));
        places.add(new Place("Baton Rouge", "520 Progress Ave",R.drawable.ic_food));
        places.add(new Place("Ted's Restaurant", "404 Old Kingston Road",R.drawable.ic_food));
        places.add(new Place("Prague Restaurant", "450 Scarborough Golf Club Road",R.drawable.ic_food));
        places.add(new Place("Souvlaki Hut", "265 Port Union Road",R.drawable.ic_food));

        //Create a {@link PlaceAdapter} whose data source is places from {@link Place}
        //The adapter knows how to create list items for each item
        PlaceAdapter adapter =
                new PlaceAdapter(this, places, R.color.category_restaurants);

        //Find the {@link ListView} object in the view hierarchy of the {@link Activity}
        //There should be a {@link ListView} with the view which is declared in the
        //word_list.xml file
        ListView listView = (ListView)findViewById(R.id.list);

        //Make the ListView use the WordAdapter we created above so that
        //it will display the list items for each in the list
        listView.setAdapter(adapter);

    }
}


