package com.app.places.placesapp;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Fragment displayed when the Food Tab is selected
 */
public class FoodTabFrag extends ListFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // The array to be displayed
        String[] array =
                {"McDonald's","Denny's","Chipotle","Panera Bread","Burger King","The Black Cow",
                "The Cheesecake Factory","Bertucci's","Apple Bee's","TGI Friday's","Olive Garden",
                "Mikado","Depot Diner"};

        ArrayAdapter adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,array);
        setListAdapter(adapter);
        return inflater.inflate(R.layout.tabs, container, false);
    }
}
