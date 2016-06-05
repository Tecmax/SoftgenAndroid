package com.example.FixedTab;






import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabPagerAdapter extends FragmentStatePagerAdapter {
	public TabPagerAdapter(FragmentManager fm) {
		super(fm);

	}

	@Override
	public Fragment getItem(int i) {
		switch (i) {
		case 0:
			return new ftab1();

		case 1:

			return new ftab2();
		case 2:
			return new ftab3();
		case 3:
			return new ftab4();
		case 4:

			return new ftab5();

		}
		return null;

	}

	@Override
	public int getCount() {

		return 5;
	}

}