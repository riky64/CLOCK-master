package com.example.smartwake;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class ClockActivity extends Activity{
	
	private CheckBox checkBox;
	private CheckBox checkBox2;
	private RadioButton rbOpcion1;
	private RadioButton rbOpcion2;
	private RadioButton rbOpcion3;
	boolean estaChecado = false;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_clock);
		
		
		checkBox = (CheckBox) findViewById(R.id.ChkMarcame);
		/*checkBox.setOnClickListener(new View.OnClickListener() {
		    @Override
		    public void onClick(View view) {
		        boolean isChecked = ((CheckBox)view).isChecked();
		 
		        if (isChecked) {
		        	esChecado();
		            //checkBox.setText("Meteorología en cuenta");
		        }
		        else {
		        	noEsChecado();
		            //checkBox.setText("Cuidado meteorología NO en cuenta");
		        }
		    }
		});*/
		
		rbOpcion1 = (RadioButton)findViewById(R.id.RbOpcion1);
		rbOpcion2 = (RadioButton)findViewById(R.id.RbOpcion2);
		rbOpcion3 = (RadioButton)findViewById(R.id.RbOpcion3);
		
		checkBox2 = (CheckBox) findViewById(R.id.ChkMarcame2);

	}
	public void onCheckBoxClicked(View view) {
		        String opcion = "";
		        switch(view.getId()) {
		            case R.id.ChkMarcame:
		                opcion = "Meteorología";
		                break;
		            case R.id.ChkMarcame2:
		                opcion = "Tráfico";
		                break;
		        }
		        Toast.makeText(this, ""+opcion+" se tendrá en cuenta", Toast.LENGTH_SHORT).show();
	}
	public void onRadioButtonClicked(View view) {
		String opcion = "";
        switch(view.getId()) {
            case R.id.RbOpcion1:
                opcion = "5";
                break;
            case R.id.RbOpcion2:
                opcion = "10";
                break;
            case R.id.RbOpcion3:
                opcion = "15";
                break;
        }
        Toast.makeText(this, "La opcion es: "+opcion+" minutos", Toast.LENGTH_SHORT).show();
	}
	
	public void esChecado(){
		Toast.makeText(this, "La meteorología afectará a la hora de despertar", Toast.LENGTH_SHORT).show();
		estaChecado=true;
	}
	public void noEsChecado(){
		Toast.makeText(this, "La meteorología NO afectará a la hora de despertar", Toast.LENGTH_SHORT).show();
		estaChecado=false;
	}
	
}
