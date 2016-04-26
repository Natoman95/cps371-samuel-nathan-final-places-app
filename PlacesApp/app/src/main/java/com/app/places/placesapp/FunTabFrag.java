package com.app.places.placesapp;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Fragment displayed when the Fun Tab is selected
 */
public class FunTabFrag extends ListFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // The array to be displayed
        String[] array =
                {"Cinemagic","Six Flags","Richardson's","Monster Golf","Canobie Lake Park","Skyzone",
                "Lazer Quest","Singing Beach","Crane's Beach","Roller Palace","Jordan's Furniture Imax",
                "Trapeze","Topsfield Fair","New England Aquarium"};

        ArrayAdapter adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,array);
        setListAdapter(adapter);
        return inflater.inflate(R.layout.tabs, container, false);
    }
}
