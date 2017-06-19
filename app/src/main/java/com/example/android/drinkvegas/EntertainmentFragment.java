package com.example.android.drinkvegas;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EntertainmentFragment extends Fragment {

    public EntertainmentFragment() {
    } // Required empty public constructor

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_venues, container, false);

        // Create a list of Ent details
        ArrayList<listfiller> listElements = new ArrayList<listfiller>();
        listElements.add(new listfiller(R.string.EntName1, R.string.Ent$1, R.drawable.entimage1,
                R.string.EntLocation1, R.string.EntOffers1, R.string.EntDescription1));
        listElements.add(new listfiller(R.string.EntName2, R.string.Ent$2, R.drawable.entimage2,
                R.string.EntLocation2, R.string.EntOffers2, R.string.EntDescription2));
        listElements.add(new listfiller(R.string.EntName3, R.string.Ent$3, R.drawable.entimage3,
                R.string.EntLocation3, R.string.EntOffers3, R.string.EntDescription3));
        listElements.add(new listfiller(R.string.EntName4, R.string.Ent$4, R.drawable.entimage4,
                R.string.EntLocation4, R.string.EntOffers4, R.string.EntDescription4));
        listElements.add(new listfiller(R.string.EntName5, R.string.Ent$5, R.drawable.entimage5,
                R.string.EntLocation5, R.string.EntOffers5, R.string.EntDescription5));
        listElements.add(new listfiller(R.string.EntName6, R.string.Ent$6, R.drawable.entimage6,
                R.string.EntLocation6, R.string.EntOffers6, R.string.EntDescription6));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings and images. The
        // adapter knows how to create layouts for each item in the list, using the
        // custom list_item.xml layout.

        venueAdapter adapter = new venueAdapter(getActivity(), listElements, R.color.colorBackgroundCategory2);

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
