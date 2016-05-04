package com.example.Splash;



import com.example.projectapp.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.SearchScreen.Search;


public class SplashScreen extends Activity {
	Thread timer;
	
	protected void onCreate(Bundle savedInstanceState)
	{
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
        			Intent nn= new Intent(SplashScreen.this,Search.class);
        			startActivity(nn);
        			
        			
        		}
        	}
        	
        };
        timer.start();
        
		
	}
	
	

}
