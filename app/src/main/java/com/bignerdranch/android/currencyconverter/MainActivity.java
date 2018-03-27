package com.bignerdranch.android.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {

        Log.i("Info", "Button Pressed!");
        EditText currencyType = (EditText) findViewById(R.id.currencyType);
        EditText currencyRate = (EditText) findViewById(R.id.currencyRate);
        EditText currencyValue = (EditText) findViewById(R.id.currencyValue);

        String currencyTypeString = currencyType.getText().toString();
        String currencyRateString = currencyRate.getText().toString();
        String currencyValueString= currencyValue.getText().toString();

        double currencyRateDouble = Double.parseDouble(currencyRateString);
        double currencyValueDouble = Double.parseDouble(currencyValueString);
        double currencyConversion = currencyRateDouble * currencyValueDouble;

        String currencyConversionDone = Double.toString(currencyConversion);
        String amountInDollars = String.format("%.2f", currencyConversion);

        Log.i("Amount in $AU", currencyConversionDone);

        Toast.makeText(this, currencyValueString +" " + currencyTypeString + " is $AU " + amountInDollars, Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
