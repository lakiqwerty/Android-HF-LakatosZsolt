package com.example.hazifeladat4;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        ArrayList<Currency> currencies = new ArrayList<>();
        currencies.add(new Currency("EUR", 4.4100, 4.5500, R.drawable.eur_flag));
        currencies.add(new Currency("USD", 3.9750, 4.1450, R.drawable.usd_flag));
        currencies.add(new Currency("GBP", 6.1250, 6.3550, R.drawable.gbp_flag));
        currencies.add(new Currency("AUD", 2.9600, 3.0600, R.drawable.aud_flag));
        currencies.add(new Currency("CAD", 3.0950, 3.2650, R.drawable.cad_flag));
        currencies.add(new Currency("CHF", 4.2300, 4.3300, R.drawable.chf_flag));
        currencies.add(new Currency("DKK", 0.5850, 0.6150, R.drawable.dkk_flag));
        currencies.add(new Currency("HUF", 0.0136, 0.0146, R.drawable.huf_flag));

        CurrencyAdapter adapter = new CurrencyAdapter(this, currencies);
        listView.setAdapter(adapter);
    }
}

