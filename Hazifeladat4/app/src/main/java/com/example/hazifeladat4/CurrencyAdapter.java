package com.example.hazifeladat4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CurrencyAdapter extends ArrayAdapter<Currency> {

    private Context myContext;
    private List<Currency> currencyList;

    public CurrencyAdapter(@NonNull Context context, @NonNull List<Currency> list) {
        super(context, 0, list);
        myContext = context;
        currencyList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(myContext).inflate(R.layout.list_item, parent, false);
        }

        Currency currentCurrency = currencyList.get(position);

        ImageView flag = listItem.findViewById(R.id.imgFlag);
        flag.setImageResource(currentCurrency.getFlagResId());

        TextView name = listItem.findViewById(R.id.textCurrency);
        name.setText(currentCurrency.getName());

        TextView rates = listItem.findViewById(R.id.textRates);
        rates.setVisibility(View.GONE);

        listItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rates.getVisibility() == View.GONE) {
                    rates.setText("Buy: " + currentCurrency.getBuyRate() + "\nSell: " + currentCurrency.getSellRate());
                    rates.setVisibility(View.VISIBLE);
                } else {
                    rates.setVisibility(View.GONE);
                }
            }
        });

        return listItem;
    }
}

