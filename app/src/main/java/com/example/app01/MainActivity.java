package com.example.app01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    final double cambioEuroDollaro=1.1177;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_usdToEuro = (Button) findViewById(R.id.button);
        button_usdToEuro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usdtoeuro(v);
            }
        });

        Button button_euroToUsd = (Button) findViewById(R.id.button2);
        button_euroToUsd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eurotousd(v);
            }
        });
    }

    protected void usdtoeuro(View v){
        EditText edit_usd = (EditText)findViewById(R.id.editText);
        EditText edit_euro = (EditText)findViewById(R.id.editText2);
        double usd = Double.parseDouble(edit_usd.getText().toString());
        double euro = usd/cambioEuroDollaro;
        edit_euro.setText(String.valueOf(euro));
    }

    protected void eurotousd(View v){
        EditText edit_usd = (EditText)findViewById(R.id.editText);
        EditText edit_euro = (EditText)findViewById(R.id.editText2);
        double euro = Double.parseDouble(edit_usd.getText().toString());
        double usd = euro*cambioEuroDollaro;
        edit_euro.setText(String.valueOf(usd));
    }
}
