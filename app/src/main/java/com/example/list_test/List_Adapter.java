package com.example.list_test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class List_Adapter extends BaseAdapter {

    private Context context;

    private ArrayList<Integer> numlist;
    private ArrayList<String> namelist;
    private ArrayList<Integer> wonlist;

    public List_Adapter(Context context, ArrayList<Integer> numlist, ArrayList<String> namelist, ArrayList<Integer> wonlist) {
        this.context = context;

        this.numlist = numlist;
        this.namelist = namelist;
        this.wonlist = wonlist;
    }

    @Override
    public int getCount() {
        return namelist.size();
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
        View list;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {
            list = inflater.inflate(R.layout.custom_list_item, null);

            TextView num_tv = list.findViewById(R.id.num_tv);
            TextView name_tv = list.findViewById(R.id.name_tv);
            TextView won_tv = list.findViewById(R.id.won_tv);

            num_tv.setText(numlist.get(position) + ".");
            name_tv.setText(namelist.get(position));
            won_tv.setText(wonlist.get(position) + "원");
        } else {
            list = (View) convertView;
        }
        return  list;
    }
}
