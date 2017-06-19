package com.example.android.drinkvegas;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ClubsFragment extends Fragment {

    public ClubsFragment() {
    } // Required empty public constructor

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_venues, container, false);

        // Create a list of Club details
        ArrayList<listfiller> listElements = new ArrayList<listfiller>();
        listElements.add(new listfiller(R.string.ClubName1, R.string.Club$1, R.drawable.clubimage1,
                R.string.ClubLocation1, R.string.ClubOffers1, R.string.ClubDescription1));
        listElements.add(new listfiller(R.string.ClubName2, R.string.Club$2, R.drawable.clubimage2,
                R.string.ClubLocation2, R.string.ClubOffers2, R.string.ClubDescription2));
        listElements.add(new listfiller(R.string.ClubName3, R.string.Club$3, R.drawable.clubimage3,
                R.string.ClubLocation3, R.string.ClubOffers3, R.string.ClubDescription3));
        listElements.add(new listfiller(R.string.ClubName4, R.string.Club$4, R.drawable.clubimage4,
                R.string.ClubLocation4, R.string.ClubOffers4, R.string.ClubDescription4));
        listElements.add(new listfiller(R.string.ClubName5, R.string.Club$5, R.drawable.clubimage5,
                R.string.ClubLocation5, R.string.ClubOffers5, R.string.ClubDescription5));
        listElements.add(new listfiller(R.string.ClubName6, R.string.Club$6, R.drawable.clubimage6,
                R.string.ClubLocation6, R.string.ClubOffers6, R.string.ClubDescription6));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings and images. The
        // adapter knows how to create layouts for each item in the list, using the
        // custom list_item.xml layout.

        venueAdapter adapter = new venueAdapter(getActivity(), listElements, R.color.colorBackgroundCategory4);

        // Find the {@link List} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link List view} use the {@link ArrayAdapter} we created above, so that the
        // {@link List view} will display list items for each element in the list.
        // Do this by calling the setAdapter method on the {@link List view} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name venueAdapter.
        listView.setAdapter(adapter);

        return rootView;
    }
}
