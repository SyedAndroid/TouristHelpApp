package com.example.syed.mysoretourismapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);


        ArrayList <Place> eat = new ArrayList<Place>();

        eat.add(new Place(getString(R.string.E1), getString(R.string.Edesc1)));
        eat.add(new Place(getString(R.string.E2), getString(R.string.Edesc2)));
        eat.add(new Place(getString(R.string.E3), getString(R.string.Edesc3)));
        eat.add(new Place(getString(R.string.E4), getString(R.string.Edesc4)));
        eat.add(new Place(getString(R.string.E5), getString(R.string.Edesc5)));
        eat.add(new Place(getString(R.string.E6), getString(R.string.Edesc6)));
        customAdapter itemsAdapter = new customAdapter(this, eat);



        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
