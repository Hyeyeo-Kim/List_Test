package com.example.list_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ListView listView;
    GridAdapter gridAdapter;
    List_Adapter listAdapter;

    // 정사각형 image 권장
    final static int grid_imglist[] = {R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.six};
    final static String grid_namelist[] = {"가나다" ,"라마바" ,"사아자" ,"차카타" ,"파하", "abcd"};
    final static Integer grid_pricelist[] = {1000, 2000, 3000, 4000, 5000, 6000};

    final ArrayList<Integer> list_numlist = new ArrayList<>();
    final ArrayList<String> list_namelist = new ArrayList<>();
    final ArrayList<Integer> list_wonlist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView total_won_tv = findViewById(R.id.total_tv);

        gridView = findViewById(R.id.grid);
        listView = findViewById(R.id.list);

        gridAdapter = new GridAdapter(this, grid_imglist, grid_namelist, grid_pricelist);
        gridView.setAdapter(gridAdapter);

        listAdapter = new List_Adapter(this, list_numlist, list_namelist, list_wonlist);
        listView.setAdapter(listAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                list_numlist.add(listAdapter.getCount() + 1);
                list_namelist.add(grid_namelist[position]);
                list_wonlist.add(grid_pricelist[position]);

                listAdapter.notifyDataSetChanged();
                int total = sumTotal();
                total_won_tv.setText(total + "원");
            }
        });
    }

    private int sumTotal() {
        int sum = 0;

        for (int i = 0; i < list_wonlist.size(); i++)
            sum = sum + list_wonlist.get(i);

        return sum;
    }
}
