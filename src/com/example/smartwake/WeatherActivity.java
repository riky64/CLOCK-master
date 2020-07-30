package com.example.smartwake;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class WeatherActivity  extends Activity{
	
	private TextView tempMax;
	private TextView tempMin;
	private TextView lluvia;
	private ImageView icon;
	
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_weather);
		
	    tempMax = (TextView) findViewById(R.id.textWeather2);
	    tempMin = (TextView) findViewById(R.id.textWeather3);
	    lluvia = (TextView) findViewById(R.id.textWeather4);
	    
	    //Habra que obtener los valores de max, min y probabilidad de lluvia. Yo las meto como constantes.
	    CharSequence max = "16";
	    CharSequence min = "8";
	    CharSequence lluv = "no"; //no, si, nublado.
	    
	    tempMax.setText("máximas de " +max +"º y");
	    tempMin.setText("mínimas de " +min +"º");
	    
	    //Esto habra que hacerlo con % de lluvia pienso, entre tanto y tanto tal y entre tanto y tanto pascual
	    if(lluv.equals("no")){
	    	lluvia.setText("Día soleado.");
	    }
	    else if(lluv.equals("si")){
	    	lluvia.setText("LLuvias intermitentes.");
	    }
	    else if(lluv.equals("nublado")){
	    	lluvia.setText("Nublado sin lluvias.");
	    }

	}
}
