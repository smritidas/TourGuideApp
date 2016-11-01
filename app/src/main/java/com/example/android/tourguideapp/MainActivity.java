package com.example.android.tourguideapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set the content of the activity_main.xml file
        setContentView(R.layout.activity_main);

        //Find the view that shows the nature category
        TextView nature = (TextView) findViewById(R.id.nature);

        //Set a click listener on that view
        nature.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the user clicks
            @Override
            public void onClick(View v) {
            //Create an intent
                Intent natureIntent = new Intent(MainActivity.this, NatureActivity.class);

            //Start the intent
                startActivity(natureIntent);
            }
        });

        //Find the view that shows the shopping category
        TextView shopping = (TextView) findViewById(R.id.shopping);

        //Set a click listener on that view
        shopping.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the user clicks
            @Override
            public void onClick(View v) {
                //Create an intent
                Intent shoppingIntent = new Intent(MainActivity.this, ShoppingActivity.class);

                //Start the intent
                startActivity(shoppingIntent);
            }
        });

        //Find the view that shows the historic category
        TextView historic = (TextView) findViewById(R.id.historic);

        //Set a click listener on that view
        historic.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the user clicks
            @Override
            public void onClick(View v) {
                //Create an intent
                Intent historicIntent = new Intent(MainActivity.this, HistoricActivity.class);

                //Start the intent
                startActivity(historicIntent);
            }
        });

        //Find the view that shows the restaurants category
        TextView restaurants = (TextView) findViewById(R.id.restaurants);

        //Set a click listener on that view
        restaurants.setOnClickListener(new View.OnClickListener() {
            //The code in this method will be executed when the user clicks
            @Override
            public void onClick(View v) {
                //Create an intent
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantActivity.class);

                //Start the intent
                startActivity(restaurantsIntent);
            }
        });
    }
}
