package com.app.places.placesapp;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by Admin on 11-12-2015.
 */
public class StoresTabFrag extends ListFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        String[] array =
                {"Staples","Target","BestBuy","Market Basket","Kohl's","Home Depot","PayLess",
                "Manchester by the Book","Barnes & Noble","Dick's Sporting Goods","Newbury Comics",
                "Macy's","Sear's"};

        ArrayAdapter adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,array);
        setListAdapter(adapter);
        return inflater.inflate(R.layout.tabs, container, false);
    }
}