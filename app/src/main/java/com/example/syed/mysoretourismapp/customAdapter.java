package com.example.syed.mysoretourismapp;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by syed on 17/05/2017.
 */

public class customAdapter extends ArrayAdapter<Place> {

    public customAdapter (Activity context, ArrayList<Place> word){
        super(context,0,word);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Place currentWord = getItem(position);

        // Find the TextView in the list_view.xml layout with the ID version_name
        TextView title = (TextView) listItemView.findViewById(R.id.textView);

        title.setText(currentWord.getPlaceName());


        TextView desc = (TextView) listItemView.findViewById(R.id.textView1);

        desc.setText(currentWord.getDescription());
        ImageView image = (ImageView) listItemView.findViewById(R.id.img);
        if( currentWord.getImageResourceId() != -1 ) {


            image.setVisibility(View.VISIBLE);


            image.setImageResource(currentWord.getImageResourceId());
        } else  image.setVisibility(View.GONE);



               // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
