package com.example.Widgets;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.RatingBar.OnRatingBarChangeListener;

import com.example.finalapp.R;



import com.example.FixedTab.fixedTab;
import com.example.Map.GoogleMap;
import com.example.Widgets.widget;

public class widget extends Activity {

	Button validate;
	ToggleButton togle;
	CheckBox check;
	RatingBar rating1;
	SeekBar seekbar1;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.widgets);
		 rating1 = (RatingBar) findViewById(R.id.ratingBar1);
		 Drawable drawable = rating1.getProgressDrawable();  drawable.setColorFilter(Color.parseColor("#D4AF37"),PorterDuff.Mode.SRC_ATOP);

		validate = (Button) findViewById(R.id.vali);
		togle = (ToggleButton) findViewById(R.id.toggleButton1);
		check = (CheckBox) findViewById(R.id.checkBox1);
		seekbar1 = (SeekBar)findViewById(R.id.seekBar1);
		rating1 = (RatingBar) findViewById(R.id.ratingBar1);
		final TextView t1=(TextView) findViewById(R.id.textView1);
		rating1.setRating((float) 2);
		//seekbar1.setOnSeekBarChangeListener(this);
		
		
		rating1.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
			
			@Override
			public void onRatingChanged(RatingBar ratingBar, float rating,
					boolean fromUser) {
				
					
				
				String ratings=String.valueOf(rating1.getRating());  
                Toast.makeText(getApplicationContext(), "Rating is " + ratings, Toast.LENGTH_LONG).show();
			}
		});
	    
		check.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				if (((CheckBox) v).isChecked())
					Toast.makeText(getApplicationContext(), "Check",
							Toast.LENGTH_LONG).show();
				else
					Toast.makeText(getApplicationContext(), "Uncheck",
							Toast.LENGTH_LONG).show();
			}

		});
		

		togle.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if (((ToggleButton) v).isChecked())
					Toast.makeText(getApplicationContext(), "ON",
							Toast.LENGTH_LONG).show();
				else
					Toast.makeText(getApplicationContext(), "OFF",
							Toast.LENGTH_LONG).show();
			}
		});

	}

	

}
