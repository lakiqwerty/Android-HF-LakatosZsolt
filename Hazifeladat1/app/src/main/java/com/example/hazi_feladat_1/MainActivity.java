package com.example.hazi_feladat_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText szam1 = findViewById(R.id.txtSzam1);
        EditText szam2 = findViewById(R.id.txtSzam2);
        Button osszeadas = findViewById(R.id.btnOsszead);
        Button kivonas = findViewById(R.id.btnKivonas);
        Button szorzas = findViewById(R.id.btnSzorzas);
        Button osztas = findViewById(R.id.btnOsztas);
        TextView szam3 = findViewById(R.id.txtSzam3);

        osszeadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(szam1.getText().toString());
                int num2 = Integer.parseInt(szam2.getText().toString());
                int eredmeny1 = num1 + num2;

                szam3.setText(String.valueOf(eredmeny1));
            }
        });

        kivonas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(szam1.getText().toString());
                int num2 = Integer.parseInt(szam2.getText().toString());
                int eredmeny2 = num1 - num2;

                szam3.setText(String.valueOf(eredmeny2));
            }
        });

        szorzas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(szam1.getText().toString());
                int num2 = Integer.parseInt(szam2.getText().toString());
                int eredmeny3 = num1 * num2;

                szam3.setText(String.valueOf(eredmeny3));
            }
        });

        osztas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(szam1.getText().toString());
                int num2 = Integer.parseInt(szam2.getText().toString());
                int eredmeny4 = num1 / num2;

                szam3.setText(String.valueOf(eredmeny4));
            }
        });


    }
}