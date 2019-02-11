package com.android_services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// Let it continue running until it is stopped.
		Toast.makeText(this, "Services Started", Toast.LENGTH_SHORT).show();
		return super.onStartCommand(intent, flags, startId);

	}

	@Override
	public void onDestroy() {
		Toast.makeText(this, "Services Stopped", Toast.LENGTH_SHORT).show();
		super.onDestroy();
	}
}
