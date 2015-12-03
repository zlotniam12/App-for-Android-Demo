package com.example.ubuntu.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	private CharSequence tabNames[];
	private int tabNum;
	public TabsPagerAdapter(FragmentManager fm, CharSequence mNames[], int mTabNum) {
		super(fm);
		this.tabNames = mNames;
		this.tabNum = mTabNum;
	}

	@Override
	public Fragment getItem(int index) {

		switch (index) {
		case 0:
			// Search fragment activity
			return new SearchFragment();
		case 1:
			// Spectra fragment activity
			return new CalcFragment();
			
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 2;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return tabNames[position];
	}

}
