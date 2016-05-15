package com.example.mubarak.tiket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

public class FlightDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Flight Details");
    }

    public void contactDetails(View view){
        Intent b = new Intent(FlightDetail.this,RegisterActivity.class);
        FlightDetail.this.startActivity(b);
        overridePendingTransition(R.animator.push_left_in,R.animator.push_left_out);
    }

    public void fdContinue(View view){
        Intent b = new Intent(FlightDetail.this,ReviewActivity.class);
        FlightDetail.this.startActivity(b);
        overridePendingTransition(R.animator.push_left_in,R.animator.push_left_out);
    }
    public void toggle2(View view){
        ToggleButton tb = (ToggleButton)findViewById(R.id.toggleButton2);
        LinearLayout ln = (LinearLayout)findViewById(R.id.lncb);
        if(tb.isChecked()){
            ln.setVisibility(View.VISIBLE);
        }
        else{
            ln.setVisibility(View.GONE);
        }
    }

}
