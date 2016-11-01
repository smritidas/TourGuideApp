package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by SmritiDas on 2016-10-12.
 */

public class HistoricActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_list);

        //Create a list of historic places
        ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place("Museum", "1007 Brimley Road", R.drawable.ic_tree));
        places.add(new Place("Old Mill", "20 Tywn Rivers Drive", R.drawable.ic_tree));
        places.add(new Place("General Store", "6282 Old Kingston Road", R.drawable.ic_tree));
        places.add(new Place("Pickering Village", "2365 Concession Road", R.drawable.ic_tree));
        places.add(new Place("Miller Lash House", "130 Old Kingston Road", R.drawable.ic_tree));
        places.add(new Place("The Guild", "201 Guildwood Pkwy", R.drawable.ic_tree));
        places.add(new Place("Pearse House", "1749 Meadowvale Ave", R.drawable.ic_tree));

        //Create a {@link PlaceAdapter} whose data source is places from {@link Place}
        //The adapter knows how to create list items for each item
        PlaceAdapter adapter =
                new PlaceAdapter(this, places, R.color.category_history);

        //Find the {@link ListView} object in the view hierarchy of the {@link Activity}
        //There should be a {@link ListView} with the view which is declared in the
        //word_list.xml file
        ListView listView = (ListView)findViewById(R.id.list);

        //Make the ListView use the WordAdapter we created above so that
        //it will display the list items for each in the list
        listView.setAdapter(adapter);


    }
}
