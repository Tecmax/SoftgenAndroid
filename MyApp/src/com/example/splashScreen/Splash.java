package com.example.splashScreen;


import com.example.googleSearch.Search;
import com.example.myapp.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class Splash extends Activity {
Thread timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logoscreen);
        timer =new Thread()
        {
        	public void run()
        	{
        		try
        		{
        			sleep(2000);
        		}catch(InterruptedException e)
        		{
        			e.printStackTrace();
        		}finally
        		{
        			Intent nn= new Intent(Splash.this,Search.class);
        			startActivity(nn);
        			
        			
        		}
        	}
        	
        };
        timer.start();
       
    }
    /*public void onBackPressed() {
        finish();
    }*/

   
}
