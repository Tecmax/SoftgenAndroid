package com.example.SearchScreen;


import android.app.Activity;
import com.example.projectapp.R;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.GoogleMap.googleMap;

public class Search extends Activity {
	private EditText editTextInput;
	String searchText;
	
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.searchscreen);
		editTextInput = (EditText) findViewById(R.id.editText1);
		searchText = editTextInput.getText().toString();
		addButtonClickListner();
	}
	private void addButtonClickListner() {
		// TODO Auto-generated method stub
		Button btnMap = (Button)findViewById(R.id.button2);
		btnMap.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View arg) 
			{
				startActivity(new Intent(Search.this, googleMap.class));
				
			}
			
		});
		
	}
	public void onSearchClick(View v)
    {
    	if(searchText.matches(""))
    	{
    		
    		 Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
             String term = editTextInput.getText().toString();
             
             
             intent.putExtra(SearchManager.QUERY, term);
             startActivity(intent);
		} else
		{
			Toast.makeText(this.getApplicationContext(),"Enter value",Toast.LENGTH_LONG).show();
		}
              
		}
	
	

}
