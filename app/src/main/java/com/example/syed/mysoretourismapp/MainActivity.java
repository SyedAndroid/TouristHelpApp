package com.example.syed.mysoretourismapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView place = (TextView) findViewById(R.id.places);

        // Set a click listener on that View
        place.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent placeIntent = new Intent(MainActivity.this , PlacesActivity.class);

                // Start the new activity
                startActivity(placeIntent);
            }
        });

        TextView shop = (TextView) findViewById(R.id.shop);

        // Set a click listener on that View
        shop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent shopIntent = new Intent(MainActivity.this , ShopActivity.class);

                // Start the new activity
                startActivity(shopIntent);
            }
        });
        TextView eat = (TextView) findViewById(R.id.eat);

        // Set a click listener on that View
        eat.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent eatIntent = new Intent(MainActivity.this , EatActivity.class);

                // Start the new activity
                startActivity(eatIntent);
            }
        });
        TextView stay = (TextView) findViewById(R.id.hotel);

        // Set a click listener on that View
        stay.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent stayIntent = new Intent(MainActivity.this , StayActivity.class);

                // Start the new activity
                startActivity(stayIntent);
            }
        });
    }
}
