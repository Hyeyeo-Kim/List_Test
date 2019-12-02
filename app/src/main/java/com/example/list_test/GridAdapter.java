package com.example.list_test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends BaseAdapter {

    private int[] imglist;
    private String[] namelist;
    private String[] pricelist;

    private Context context;

    public GridAdapter(Context context, int[] imglist, String[] namelist, String[] pricelist) {
        this.context = context;

        this.imglist = imglist;
        this.namelist = namelist;
        this.pricelist = pricelist;
    }

    @Override
    public int getCount() {
        return imglist.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View grid;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            grid = inflater.inflate(R.layout.custom_gird_item, null);

            ImageView food_img = grid.findViewById(R.id.food_image);
            TextView food_name = grid.findViewById(R.id.food_name);
            TextView food_price = grid.findViewById(R.id.food_price);

            food_img.setImageResource(imglist[position]);
            food_name.setText(namelist[position]);
            food_price.setText(pricelist[position]);
        } else {
            grid = (View) convertView;
        }
        return  grid;
    }
}
