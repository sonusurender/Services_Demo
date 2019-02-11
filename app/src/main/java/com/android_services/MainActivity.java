package com.android_services;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends ActionBarActivity implements OnClickListener {

	Button start, stop;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		start = (Button) findViewById(R.id.start_service);
		stop = (Button) findViewById(R.id.stop_service);
		start.setOnClickListener(this);
		stop.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {

		// Action to start service
		case R.id.start_service:
			startService(new Intent(MainActivity.this, MyService.class));
			break;
		// Action to start service
		case R.id.stop_service:
			stopService(new Intent(MainActivity.this, MyService.class));
			break;
		}

	}

}
