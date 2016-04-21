package com.app.places.placesapp;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.ListFragment;

/**
 * Created by Admin on 11-12-2015.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public ListFragment getItem(int position) {
        switch(position) {
            case 0:
                return new FoodTabFrag();
            case 1:
                return new FunTabFrag();
            case 2:
                return new StoresTabFrag();
            default:
                return null;
        }
        // Which Fragment should be dislpayed by the viewpager for the given position
        // In my case we are showing up only one fragment in all the three tabs so we are
        // not worrying about the position and just returning the TabFragment
    }

    @Override
    public int getCount() {
        return 3;           // As there are only 3 Tabs
    }

}
