package com.example.android.drinkvegas;

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
 * Created by Terry on 15/06/2017.
 */
public class venueAdapter extends ArrayAdapter<listfiller> {

    private int mColorIdentifier;

    public venueAdapter(Activity context, ArrayList<listfiller> listElements, int ColorIdentifier) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for five TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, listElements);
        mColorIdentifier = ColorIdentifier;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }

        // Get the {@link listfiller} object located at this position in the list
        listfiller currentBar = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID VenueName
        TextView venueNameTextView = (TextView) listItemView.findViewById(R.id.VenueName);
        // Get the venue name from the current listfiller object and
        // set this text on the VenueName TextView
        venueNameTextView.setText(currentBar.getmVenueName());

        // Find the TextView in the list_item.xml layout with the ID Venue$
        TextView venue$TextView = (TextView) listItemView.findViewById(R.id.Venue$);
        // Get the $ rating from the current listfiller object and
        // set this text on the Venue$ TextView
        venue$TextView.setText(currentBar.getmVenue$());

        // Find the ImageView in the list_item.xml layout with the ID VenueImage
        ImageView venueImageImageView = (ImageView) listItemView.findViewById(R.id.VenueImage);
        // Get the Venue Image from the current listfiller object and
        // set this image on the VenueImage ImageView
        venueImageImageView.setImageResource(currentBar.getmVenueImage());

        // Find the TextView in the list_item.xml layout with the ID VenueLocation
        TextView venueLocationTextView = (TextView) listItemView.findViewById(R.id.VenueLocation);
        // Get the Venue Location from the current listfiller object and
        // set this text on the VenueLocation TextView
        venueLocationTextView.setText(currentBar.getmVenueLocation());

        // Find the TextView in the list_item.xml layout with the ID VenueOffers
        TextView venueOffersTextView = (TextView) listItemView.findViewById(R.id.VenueOffers);
        // Get the Venue Offers from the current listfiller object and
        // set this text on the VenueOffers TextView
        venueOffersTextView.setText(currentBar.getmVenueOffers());

        // Find the TextView in the list_item.xml layout with the ID VenueDescription
        TextView venueDescriptionTextView = (TextView) listItemView.findViewById(R.id.VenueDescription);
        // Get the Venue Description from the current listfiller object and
        // set this text on the VenueDescription TextView
        venueDescriptionTextView.setText(currentBar.getmVenueDescription());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.colorBackground);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorIdentifier);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 5 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
