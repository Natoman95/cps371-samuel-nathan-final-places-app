package com.app.places.placesapp;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Fragment displayed when the Food Tab is selected
 */
public class FoodTabFrag extends ListFragment {

    private List<String> myData;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        // retain this fragment
        setRetainInstance(true);

        return inflater.inflate(R.layout.tabs, container, false);
    }

    public void updateView(ArrayList<Place> food) {
        // The array to be displayed
        ArrayList<String> output = new ArrayList<String>();

        for (int i = 0; i < food.size(); i ++) {
            Place currPlace = food.get(i);
            String spaces = "";
            for (int j = 0; j < (40 - currPlace.getName().length()); j ++) {
                spaces = spaces + " ";
            }
            output.add(i, currPlace.getName() + spaces + currPlace.getAddress());
        }

        ArrayAdapter adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,output);
        setListAdapter(adapter);
    }

//    @Override
//    public void onSaveInstanceState(final Bundle outState) {
//        super.onSaveInstanceState(outState);
//        outState.putSerializable("list", (Serializable) myData);
//    }
//
//    @Override
//    public void onActivityCreated(Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//
//        if (savedInstanceState != null) {
//            //probably orientation change
//            myData = (List<String>) savedInstanceState.getSerializable("list");
//        } else {
//            if (myData != null) {
//                //returning from backstack, data is fine, do nothing
//            }
//        }
//    }
}
