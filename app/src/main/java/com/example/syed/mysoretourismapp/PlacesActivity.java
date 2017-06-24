package com.example.syed.mysoretourismapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList <Place> places = new ArrayList<Place>();

        places.add(new Place( getString(R.string.place1), getString(R.string.pdesc1),R.drawable.palace));
        places.add(new Place(getString(R.string.place2), getString(R.string.pdesc2),R.drawable.hill));
        places.add(new Place(getString(R.string.place3), getString(R.string.pdesc3),R.drawable.zoo));
        places.add(new Place(getString(R.string.place4), getString(R.string.pdesc4),R.drawable.tipu));
        places.add(new Place(getString(R.string.place5), getString(R.string.pdesc5),R.drawable.krs));
        places.add(new Place(getString(R.string.place6), getString(R.string.pdesc6),R.drawable.bird));
        places.add(new Place(getString(R.string.place7), getString(R.string.pdesc7),R.drawable.jungle));
        customAdapter itemsAdapter = new customAdapter(this, places);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
