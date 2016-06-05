package com.example.Splash;

//import com.example.SearchScreen.Search;
import com.example.GoogleSearch.SearchGoogle;
import com.example.Splash.SplashScreen;
import com.example.finalapp.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends Activity {
	Thread timer;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.logo);
		timer = new Thread() {
			public void run() {
				try {
					sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					Intent nn= new Intent(SplashScreen.this,SearchGoogle.class);
					 startActivity(nn);
					finish();

				}
			}

		};
		timer.start();

	}
}
