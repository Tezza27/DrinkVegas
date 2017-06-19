package com.example.android.drinkvegas;

/**
 * Created by Terry on 15/06/2017.
 * Creates an object for each venue
 */

public class listfiller {
    private int mVenueName;
    private int mVenue$;
    private int mVenueImage;
    private int mVenueLocation;
    private int mVenueOffers;
    private int mVenueDescription;

    public listfiller(int mVenueName, int mVenue$, int mVenueImage, int mVenueLocation, int mVenueOffers, int mVenueDescription) {
        this.mVenueName = mVenueName;
        this.mVenue$ = mVenue$;
        this.mVenueImage = mVenueImage;
        this.mVenueLocation = mVenueLocation;
        this.mVenueOffers = mVenueOffers;
        this.mVenueDescription = mVenueDescription;
    }

    public int getmVenueName() {
        return mVenueName;
    }

    public int getmVenue$() {
        return mVenue$;
    }

    public int getmVenueImage() {
        return mVenueImage;
    }

    public int getmVenueLocation() {
        return mVenueLocation;
    }

    public int getmVenueOffers() {
        return mVenueOffers;
    }

    public int getmVenueDescription() {
        return mVenueDescription;
    }
}
