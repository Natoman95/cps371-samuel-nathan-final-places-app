package com.app.places.placesapp;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.ListFragment;
import android.util.SparseArray;
import android.view.ViewGroup;

/**
 * Chooses which Fragment to display based on the selected tab position
 *
 * The registeredFragments Array concept and code came from:
 *
 * https://github.com/erg/caltrain-dating/blob/master/src/com/codepath/caltraindating/adapters/
 * SmartFragmentStatePagerAdapter.java
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    // Contains all the currently instantiated fragments
    private SparseArray<TabFragment> registeredFragments = new SparseArray<TabFragment>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public ListFragment getItem(int position) {

        // Which Fragment should be dislpayed by the viewpager for the given position
        // Each tab is registered so it can be accessed later and data can be passed to it
        switch(position) {
            case 0:
                TabFragment foodFrag = new TabFragment();
                registeredFragments.put(0, foodFrag);
                return foodFrag;
            case 1:
                TabFragment funFrag = new TabFragment();
                registeredFragments.put(1, funFrag);
                return funFrag;
            case 2:
                TabFragment storeFrag = new TabFragment();
                registeredFragments.put(2, storeFrag);
                return storeFrag;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3; // As there are only 3 Tabs
    }

    // Register the fragment when the item is instantiated
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        TabFragment fragment = (TabFragment) super.instantiateItem(container, position);
        registeredFragments.put(position, fragment);
        return fragment;
    }

    // Unregister when the item is inactive
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        registeredFragments.remove(position);
        super.destroyItem(container, position, object);
    }

    // Returns the fragment for the position (if instantiated)
    public TabFragment getRegisteredFragment(int position) {
        return registeredFragments.get(position);
    }
}
