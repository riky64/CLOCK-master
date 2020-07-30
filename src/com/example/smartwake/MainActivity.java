package com.example.smartwake;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity{
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void getWeather(View view){
		Intent intent = new Intent(this, WeatherActivity.class);
        startActivity(intent);
	}
	public void getAlarm(View view){
		Intent intent = new Intent(this, AlarmActivity.class);
        startActivity(intent);
	}
	

}
