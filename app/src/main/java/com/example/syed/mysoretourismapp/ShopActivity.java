package com.example.syed.mysoretourismapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.syed.mysoretourismapp.R.id.eat;
import static com.example.syed.mysoretourismapp.R.id.places;

public class ShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        ArrayList<Place> shops = new ArrayList<Place>();
        shops.add(new Place(getString(R.string.Shop1), getString(R.string.Sdesc1)));
        shops.add(new Place(getString(R.string.Shop2), getString(R.string.Sdesc2)));
        shops.add(new Place(getString(R.string.Shop3), getString(R.string.Sdesc3)));
        shops.add(new Place(getString(R.string.Shop4), getString(R.string.Sdesc4)));
        shops.add(new Place(getString(R.string.Shop5), getString(R.string.Sdesc5)));
        shops.add(new Place(getString(R.string.Shop6), getString(R.string.Sdesc6)));
        customAdapter itemsAdapter = new customAdapter(this, shops);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
