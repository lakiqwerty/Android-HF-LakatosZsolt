package com.example.hazifeladat_32;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    ArrayList<Product> products = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText productCode = findViewById(R.id.textProductCode);
        EditText productName = findViewById(R.id.textProductName);
        EditText productPrice = findViewById(R.id.textProductPrice);
        Button addProduct = findViewById(R.id.btnAddProduct);
        Button showProducts = findViewById(R.id.btnShowProducts);
        TextView textViewProducts = findViewById(R.id.textViewProducts);

        addProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String code = productCode.getText().toString();
                String name = productName.getText().toString();
                String price = productPrice.getText().toString();

                Product product = new Product(code,name,price);

                products.add(product);

                Toast.makeText(MainActivity.this, "Succesfully added new product!", Toast.LENGTH_SHORT).show();
            }
        });

        showProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!products.isEmpty()) {
                    String productDetails = "";
                    for (Product product : products) {
                        productDetails += "Code: " + product.getCode() + " Name: " + product.getName() + " Price: " + product.getPrice() + "\n";
                    }
                    textViewProducts.setText(productDetails);
                } else {
                    textViewProducts.setText("No products to show.");
                }
            }
        });
    }
}