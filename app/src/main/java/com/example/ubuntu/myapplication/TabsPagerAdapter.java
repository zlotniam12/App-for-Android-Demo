package com.example.ubuntu.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
/**
 * This class defines what fragments will be displayed when each tab is clicked,
 * what order the tabs corresponding to the fragments will be in, what order the tabs are in,
 * the titles of the tabs, and how many tabs there are.
 *
 * @author Alyssa Zlotnicki
 * @version 12/3/15.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {

	private CharSequence tabNames[];
	private int tabNum;
    //constructor where all of the needed variables are created.
	public TabsPagerAdapter(FragmentManager fm, CharSequence mNames[], int mTabNum) {
		super(fm);
		this.tabNames = mNames;
		this.tabNum = mTabNum;
	}

    /**
     * Assigns fragments to the list of tabs in the order that is desired.
     *
     * @param index, the index of the tab in the list of tabs
     * @return the fragment specified for each tab index
     */
	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Search fragment activity
			return new SearchFragment();
		case 1:
			// Calc fragment activity
			return new CalcFragment();

        case 2:
            // Calc other fragment activity
            return new CalcOtherFragment();
			
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return tabNum;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return tabNames[position];
	}

}
