package com.example.android.drinkvegas;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class BarsFragment extends Fragment {

    public BarsFragment() {
    } // Required empty public constructor

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_venues, container, false);

        // Create a list of Bar details
        ArrayList<listfiller> listElements = new ArrayList<listfiller>();
        listElements.add(new listfiller(R.string.BarName1, R.string.Bar$1, R.drawable.barimage1,
                R.string.BarLocation1, R.string.BarOffers1, R.string.BarDescription1));
        listElements.add(new listfiller(R.string.BarName2, R.string.Bar$2, R.drawable.barimage2,
                R.string.BarLocation2, R.string.BarOffers2, R.string.BarDescription2));
        listElements.add(new listfiller(R.string.BarName3, R.string.Bar$3, R.drawable.barimage3,
                R.string.BarLocation3, R.string.BarOffers3, R.string.BarDescription3));
        listElements.add(new listfiller(R.string.BarName4, R.string.Bar$4, R.drawable.barimage4,
                R.string.BarLocation4, R.string.BarOffers4, R.string.BarDescription4));
        listElements.add(new listfiller(R.string.BarName5, R.string.Bar$5, R.drawable.barimage5,
                R.string.BarLocation5, R.string.BarOffers5, R.string.BarDescription5));
        listElements.add(new listfiller(R.string.BarName6, R.string.Bar$6, R.drawable.barimage6,
                R.string.BarLocation6, R.string.BarOffers6, R.string.BarDescription6));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings and images. The
        // adapter knows how to create layouts for each item in the list, using the
        // custom list_item.xml layout.

        venueAdapter adapter = new venueAdapter(getActivity(), listElements, R.color.colorBackgroundCategory1);

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
