package com.app.places.placesapp;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Fragment displayed when a tab is selected
 */
public class TabFragment extends ListFragment {

    ArrayList<String> output;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tabs, container, false);
    }

    public void populateList(ArrayList<Place> places) {
        // The list to be displayed
        output = new ArrayList<String>();

        // Adapt the data from the places array into a list to be displayed
        for (int i = 0; i < places.size(); i ++) {
            Place currPlace = places.get(i);

            // new lines make more readable
            String outString = "\n" + currPlace.getName()
                    + "\n\n        " + currPlace.getAddress()+ "\n";
            output.add(i, outString);
        }

        // Display the array
        setListView(output);
    }

    private void setListView (ArrayList<String> toDisplay) {
        if (isAdded()) {
            ArrayAdapter adapter = new ArrayAdapter<String>(getActivity(),
                    android.R.layout.simple_list_item_1, toDisplay);
            setListAdapter(adapter);
        }
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // Get the list that was saved and display it
        if (savedInstanceState != null) {
            output = savedInstanceState.getStringArrayList("output");
            if (output != null) {
                setListView(output);
            }
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // Save the list to be displayed
        outState.putStringArrayList("output", output);
    }
}
