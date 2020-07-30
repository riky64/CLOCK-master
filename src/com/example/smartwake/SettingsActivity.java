package com.example.smartwake;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class SettingsActivity extends Activity{
	
	private CheckBox checkBox;
	private CheckBox checkBox2;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
		
		checkBox = (CheckBox) findViewById(R.id.ChkMarcame);
		checkBox2 = (CheckBox) findViewById(R.id.ChkMarcame2);
	}
	public void onCheckBoxClicked(View view) {
        String opcion = "";
        switch(view.getId()) {
            case R.id.ChkMarcame:
                opcion = "brillo al pairo";
                break;
            case R.id.ChkMarcame2:
                opcion = "otras opciones";
                break;
        }
        Toast.makeText(this, opcion, Toast.LENGTH_SHORT).show();
}

}
