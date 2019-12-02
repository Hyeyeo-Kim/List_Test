package com.example.list_test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomGridItem extends LinearLayout {

    ImageView food_img;
    TextView food_name;
    TextView food_price;

    public CustomGridItem(Context context) {
        super(context);
        init(context);
    }

    public void init(Context context) {
        food_img = findViewById(R.id.food_image);
        food_name = findViewById(R.id.food_name);
        food_price = findViewById(R.id.food_price);
    }
}
