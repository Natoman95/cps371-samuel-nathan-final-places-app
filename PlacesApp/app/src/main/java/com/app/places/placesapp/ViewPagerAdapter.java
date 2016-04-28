package com.app.places.placesapp;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.ListFragment;

/**
 * Chooses which Fragment to display based on the selected tab position
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public ListFragment getItem(int position) {

        // Which Fragment should be dislpayed by the viewpager for the given position
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
    }

    @Override
    public int getCount() {
        return 3; // As there are only 3 Tabs
    }
}
