package com.example.syed.mysoretourismapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.syed.mysoretourismapp.R.id.places;

public class StayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<Place> hotels = new ArrayList<Place>();

        hotels.add(new Place(getString(R.string.Stay1), getString(R.string.StDesc1),R.drawable.sun));
        hotels.add(new Place(getString(R.string.Stay2), getString(R.string.StDesc2),R.drawable.rad));
        hotels.add(new Place(getString(R.string.Stay3), getString(R.string.StDesc3),R.drawable.gin));
        hotels.add(new Place(getString(R.string.Stay4), getString(R.string.StDesc4),R.drawable.pai));
        hotels.add(new Place(getString(R.string.Stay5), getString(R.string.StDesc5),R.drawable.fort));
        hotels.add(new Place(getString(R.string.Stay6), getString(R.string.StDesc6),R.drawable.inn));

        customAdapter itemsAdapter = new customAdapter(this, hotels);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
