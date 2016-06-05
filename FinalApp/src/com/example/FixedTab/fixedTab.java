package com.example.FixedTab;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.app.ActionBar.Tab;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import com.example.FixedTab.fixedTab;
import com.example.FixedTab.TabPagerAdapter;
import com.example.finalapp.R;

public class fixedTab extends FragmentActivity implements ActionBar.TabListener {

	private ViewPager Pager;
	private TabPagerAdapter Adapter;
	private ActionBar actionBar;

	private String[] tabnames = { "Apple", "Mango", "Banana", "Grape", "Orange" };

	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fixedtabs);

		Pager = (ViewPager) findViewById(R.id.pager);
		actionBar = getActionBar();
		Adapter = new TabPagerAdapter(getSupportFragmentManager());

		Pager.setAdapter(Adapter);
		actionBar.setHomeButtonEnabled(false);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		for (String tab_name : tabnames) {
			actionBar.addTab(actionBar.newTab().setText(tab_name)
					.setTabListener(this));
		}

		Pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

			@Override
			public void onPageSelected(int position) {

				actionBar.setSelectedNavigationItem(position);
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
			}
		});
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {

		Pager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
	}

}
