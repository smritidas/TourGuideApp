package com.example.android.tourguideapp;

import static android.R.attr.resource;

/**
 * {@link Place} represents a place with both the name of the place and the address
 * it contains a place name, an address and an icon
 */

public class Place {

    //Default place
    private String mLocation;

    //The address of the place
    private String mAddress;

    //Image resource ID for the place
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    //This is the constant value if no image is provided
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a place object
     *
     * @param defaultLocation is the name of the place
     * @param address is the address of the place
     *
     * */
    public Place(String defaultLocation, String address){
        mLocation = defaultLocation;
        mAddress = address;
    }

    /**
     * This is the constructor if the object has a picture
     * @param defaultLocation is the name of the place
     * @param address is the address of the place
     * @param imageResourceId is the drawable resource associated with the object
     * */
    public Place(String defaultLocation, String address, int imageResourceId){
        mLocation = defaultLocation;
        mAddress = address;
        mImageResourceId = imageResourceId;
    }

    //Get the location
    public String getLocation(){
        return mLocation;
    }

    //Get the address
    public String getAddress(){
        return mAddress;
    }

    //Returns the image resource id of the place

    public int getImageResourceId(){
       return mImageResourceId;
    }

    //Returns whether or not their is an image for the word
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
