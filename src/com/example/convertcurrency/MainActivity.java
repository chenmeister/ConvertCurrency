package com.example.convertcurrency;

import java.text.DecimalFormat;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
				
	}
	
	public void convertToPounds(View view){
		EditText enterCurrency = (EditText) findViewById(R.id.enter_currency);
		double priceInPounds = Double.parseDouble(enterCurrency.getText().toString());
		calculate(priceInPounds);
	}
	
	private void calculate(double price){
		
		double inUSD = price/0.61;
		TextView setPounds = (TextView) findViewById(R.id.show_pounds);
		TextView setUSD = (TextView) findViewById(R.id.show_usd);
		DecimalFormat df = new DecimalFormat("#.##");
		
		setPounds.setText(df.format(price));
		setUSD.setText(df.format(inUSD));
		
	}
	
}
