package com.example.syed.mysoretourismapp;



/**
 * Created by syed on 12/05/2017.
 */

class Place {

    private  String mName;
    private  String mDesc;


    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

   Place(String placeName, String description,  int imageResourceId) {
        mName = placeName;
        mDesc = description;

        mImageResourceId = imageResourceId;

    }
    Place(String placeName, String description) {
        mName = placeName;
        mDesc = description;
    }

    public String getPlaceName() {
        return mName;
    }

    public String getDescription() {
        return mDesc;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}

