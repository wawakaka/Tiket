package com.example.mubarak.tiket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;


import com.example.mubarak.tiket.CustomListAdapter.CustomList;

public class FlightList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Kota asal -> Kota tujuan");

        /*ArrayList<String> arrayList;
        ArrayAdapter<String> adapter;
        ListView ls = (ListView)findViewById(R.id.listView);*/


        String[] dataa = {
                "a",
                "b",
                "c",
                "d",
                "e",
                "f",
                "g",
                "h",
                "i",
                "j",
                "k",
                "l"
        };

        ListView lv = (ListView)findViewById(R.id.listView);

        ListAdapter la = new CustomList(this,dataa);

        lv.setAdapter(la);

        /*arrayList = new ArrayList<>(Arrays.asList(data));
        adapter = new ArrayAdapter<String>(this, R.layout.list_item,R.id.listItem,arrayList);*/
        //ls.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(FlightList.this, FlightDetail.class);
                startActivity(i);
            }
        });
    }


}
