package com.example.my_listview_project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GoodsListAdapter extends BaseAdapter {
    Context ctx; ArrayList<Product> products;

    public GoodsListAdapter(Context ctx, ArrayList<Product> products){
        this.ctx = ctx;
        this.products = products;
    }

    @Override
    public int getCount() {
        return products.size();
    }
    @Override
    public Object getItem(int position) {
        return products.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Product tovar = products.get(position);
        convertView = LayoutInflater.from(ctx).inflate(R.layout.productitem, parent, false);
        ImageView productImage = convertView.findViewById(R.id.itemImage);
        TextView productName = convertView.findViewById(R.id.itemName);
        TextView productPNT = convertView.findViewById(R.id.itemPNT);
        TextView productPrice = convertView.findViewById(R.id.itemPrice);

        productName.setText(tovar.name);
        productPNT.setText(tovar.PNT);
        productPrice.setText(tovar.price);

        switch (tovar.PNT){
            case "100001": productImage.setImageResource(R.drawable.knife); break;
            case "100002": productImage.setImageResource(R.drawable.fountain); break;
            case "100003": productImage.setImageResource(R.drawable.armored_car); break;
            case "100004": productImage.setImageResource(R.drawable.cup); break;
            case "100005": productImage.setImageResource(R.drawable.panther); break;
        }

        return convertView;
    }
}
