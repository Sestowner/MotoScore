package de.markusfisch.android.motoscore.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
	@Override
	protected void onCreate(Bundle state) {
		super.onCreate(state);

		// It's important _not_ to inflate a layout file here
		// because that would happen after the app is fully
		// initialized what is too late.

		startActivity(new Intent(getApplicationContext(),
				MainActivity.class));
		finish();
	}
}
