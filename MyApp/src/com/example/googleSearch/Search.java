package com.example.googleSearch;

import com.example.myapp.R;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Search extends Activity {
	private EditText editTextInput;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.searchscreen);
		
		editTextInput = (EditText) findViewById(R.id.editText1);
	}
	public void onSearchClick(View v)
    {
    	if(editTextInput.toString().trim() != null || editTextInput != null)
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


