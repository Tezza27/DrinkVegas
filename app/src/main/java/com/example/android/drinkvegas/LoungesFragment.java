package com.example.android.drinkvegas;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class LoungesFragment extends Fragment {

    public LoungesFragment() {
    } // Required empty public constructor

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_venues, container, false);

        // Create a list of Lounge details
        ArrayList<listfiller> listElements = new ArrayList<listfiller>();
        listElements.add(new listfiller(R.string.LoungeName1, R.string.Lounge$1, R.drawable.loungeimage1,
                R.string.LoungeLocation1, R.string.LoungeOffers1, R.string.LoungeDescription1));
        listElements.add(new listfiller(R.string.LoungeName2, R.string.Lounge$2, R.drawable.loungeimage2,
                R.string.LoungeLocation2, R.string.LoungeOffers2, R.string.LoungeDescription2));
        listElements.add(new listfiller(R.string.LoungeName3, R.string.Lounge$3, R.drawable.loungeimage3,
                R.string.LoungeLocation3, R.string.LoungeOffers3, R.string.LoungeDescription3));
        listElements.add(new listfiller(R.string.LoungeName4, R.string.Lounge$4, R.drawable.loungeimage4,
                R.string.LoungeLocation4, R.string.LoungeOffers4, R.string.LoungeDescription4));
        listElements.add(new listfiller(R.string.LoungeName5, R.string.Lounge$5, R.drawable.loungeimage5,
                R.string.LoungeLocation5, R.string.LoungeOffers5, R.string.LoungeDescription5));
        listElements.add(new listfiller(R.string.LoungeName6, R.string.Lounge$6, R.drawable.loungeimage6,
                R.string.LoungeLocation6, R.string.LoungeOffers6, R.string.LoungeDescription6));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings and images. The
        // adapter knows how to create layouts for each item in the list, using the
        // custom list_item.xml layout.

        venueAdapter adapter = new venueAdapter(getActivity(), listElements, R.color.colorBackgroundCategory3);

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
