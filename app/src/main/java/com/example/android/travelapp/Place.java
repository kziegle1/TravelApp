package com.example.android.travelapp;

/**
 * {@link Place} represents a place that the user wants to go.
 * It contains resource IDs for the place, adress, audio file, and
 * optional image file for that place.
 */
public class Place {
    /**
     * String resource ID for the place
     */
    private int mPlaceId;

    /**
     * String resource ID for the address of the place
     */
    private int mAddressId;

    /**
     * Image resource ID for the place
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this place
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Place object.
     *
     * @param PlaceId   is the string resource Id for the place the user wants to go
     * @param AddressId is the string resource ID for the address of the place
     */
    public Place(int AddressId, int PlaceId, int imageResourceId ) {
        mPlaceId = PlaceId;
        mAddressId = AddressId;
        mImageResourceId = imageResourceId;
    }


    /**
     * Get the string resource ID for the place.
     */
    public int getPlaceId() {
        return mPlaceId;
    }

    /**
     * Get the string resource ID for the address.
     */
    public int getAddressId() {
        return mAddressId;
    }

    /**
     * Return the image resource ID of the place.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this place.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
