package com.example.list_test;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    GridAdapter gridAdapter;

    // 정사각형 image 권장
    final static int imglist[] = {R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.six};
    final static String namelist[] = {"가나다" ,"라마바" ,"사아자" ,"차카타" ,"파하", "abcd"};
    final static String pricelist[] = {"1000원", "2000원", "3000원", "4000원", "5000원", "6000원"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        gridView = findViewById(R.id.grid);
        gridAdapter = new GridAdapter(this, imglist, namelist, pricelist);

        gridView.setAdapter(gridAdapter);
    }
}
