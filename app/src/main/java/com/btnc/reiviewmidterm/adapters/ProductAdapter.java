package com.btnc.reiviewmidterm.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
 // Đảm bảo bạn đã thêm Glide
import com.btnc.reiviewmidterm.R;
import com.btnc.reiviewmidterm.models.Product;

import java.util.List;

public class ProductAdapter extends ArrayAdapter<Product> {
    private Context context;
    private List<Product> productList;

    public ProductAdapter(@NonNull Context context, @NonNull List<Product> productList) {
        super(context, 0, productList);
        this.context = context;
        this.productList = productList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Product product = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_list_product, parent, false);
        }

        ImageView image = convertView.findViewById(R.id.productImage);
        TextView name = convertView.findViewById(R.id.productName);
        TextView code = convertView.findViewById(R.id.productCode);
        TextView price = convertView.findViewById(R.id.productPrice);

        name.setText(product.getProductName());
        code.setText("Code: " + product.getProductCode());
        price.setText(String.format("Price: %.0f đ", product.getUnitPrice()));


        return convertView;
    }
}
