package com.btnc.reiviewmidterm;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProductDetailActivity extends AppCompatActivity {
    private EditText edt_product_id,edt_product_name,edt_product_code,edt_product_price;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_product_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu_product, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
    private void initializeViews() {
        edt_product_id = findViewById(R.id.edt_product_id);
        edt_product_name = findViewById(R.id.edt_product_name);
        edt_product_code = findViewById(R.id.edt_product_code);
        edt_product_price = findViewById(R.id.edt_product_price);
        btnSave = findViewById(R.id.btnSave);
    }

    private void setupSaveButton() {
        btnSave.setOnClickListener(v -> {
            if (validateInput()) {
                saveProduct();
            }
        });
    }

    private boolean validateInput() {
        if (edt_product_id.getText().toString().trim().isEmpty()){
            edt_product_id.setError("Product ID is required");
            return false;
        }
        if (edt_product_name.getText().toString().trim().isEmpty()) {
            edt_product_name.setError("Product name is required");
            return false;
        }
        if (edt_product_code.getText().toString().trim().isEmpty()) {
            edt_product_code.setError("Product code is required");
            return false;
        }
        if (edt_product_price.getText().toString().trim().isEmpty()) {
            edt_product_price.setError("Price is required");
            return false;
        }
        return true;
    }

    private void saveProduct() {
        String name = edt_product_name.getText().toString().trim();
        String code = edt_product_code.getText().toString().trim();
        double price = Double.parseDouble(edt_product_price.getText().toString().trim());
        int id = Integer.parseInt(edt_product_id.getText().toString().trim());

        Intent resultIntent = new Intent();
        resultIntent.putExtra("productName", name);
        resultIntent.putExtra("productCode", code);
        resultIntent.putExtra("price", price);
        resultIntent.putExtra("id", id);

        setResult(RESULT_OK, resultIntent);
        finish();
    }
}