package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by SmritiDas on 2016-10-12.
 */

public class ShoppingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        ArrayList<Place> places = new ArrayList<Place>();

        //Created a list of locations
        places.add(new Place("Scarborough Town Centre", "300 Borough Road"));
        places.add(new Place("Malvern Town Centre", "31 Tapscott Road"));
        places.add(new Place("Woodside Square", "1571 Sandhurst Circle"));
        places.add(new Place("Parkway Mall", "85 Ellesmere Road"));
        places.add(new Place("Eglinton Square", "1 Eglinton Square"));
        places.add(new Place("Agincourt Mall", "3850 Sheppard Ave E"));
        places.add(new Place("Cedarbrae Mall", "3495 Lawrence Ave"));

        //Create a {@link PlaceAdapter} whose data source is places from {@link Place}
        //The adapter knows how to create list items for each item
        PlaceAdapter adapter =
                new PlaceAdapter(this, places, R.color.category_shopping);

        //Find the {@link ListView} object in the view hierarchy of the {@link Activity}
        //There should be a {@link ListView} with the view which is declared in the
        //word_list.xml file
        ListView listView = (ListView)findViewById(R.id.list);

        //Make the ListView use the WordAdapter we created above so that
        //it will display the list items for each in the list
        listView.setAdapter(adapter);
    }
}
