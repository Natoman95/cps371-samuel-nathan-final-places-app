package com.app.places.placesapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by tkdsa on 5/8/2016.
 */
public class CardFragment extends Fragment {

    public CardFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.cardlocation, container, false);

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.rv);

        ViewPagerAdapter adapter = new ViewPagerAdapter()

    }
}
