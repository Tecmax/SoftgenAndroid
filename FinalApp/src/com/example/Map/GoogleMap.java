package com.example.Map;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.FixedTab.fixedTab;
import com.example.Map.GoogleMap;
import com.example.Widgets.widget;
import com.example.finalapp.R;
import com.google.android.gms.maps.SupportMapFragment;

public class GoogleMap extends FragmentActivity {
	private com.google.android.gms.maps.GoogleMap map;
	Spinner dropdown;
	String[] items;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mapscreen);
		createMap();
		map.setMyLocationEnabled(true);

	}

	private void createMap() {
		if (map == null) {
			map = ((SupportMapFragment) getSupportFragmentManager()
					.findFragmentById(R.id.map)).getMap();

			if (map == null) {
				Toast.makeText(getApplicationContext(), "Unable to load Map",
						Toast.LENGTH_SHORT).show();
			}
		}

	}

	
}
