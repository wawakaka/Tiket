package com.example.mubarak.tiket.CustomListAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mubarak.tiket.R;

/**
 * Created by MUBARAK on 5/9/2016.
 */
public class CustomList extends ArrayAdapter<String>{

    public CustomList(Context context, String[] data){
        super(context, R.layout.list_item, data);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater li = LayoutInflater.from(getContext());
        View cv = li.inflate(R.layout.list_item,parent,false);

        String a = getItem(position);
        TextView tv = (TextView) cv.findViewById(R.id.listItem);
        ImageView iv = (ImageView) cv.findViewById(R.id.listImage);

        tv.setText(a);
        iv.setImageResource(R.mipmap.ic_launcher);
        return cv;
    }
}
