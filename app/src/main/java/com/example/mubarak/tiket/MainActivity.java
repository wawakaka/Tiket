package com.example.mubarak.tiket;


import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;


import com.example.mubarak.tiket.Dialog.DatePickerDialog1;
import com.example.mubarak.tiket.Dialog.DatePickerDialog2;
import com.example.mubarak.tiket.PageAdapter.ViewPagerAdapter;
import com.example.mubarak.tiket.SlidingTab.SlidingTabLayout;


public class MainActivity extends ActionBarActivity {

    // Declaring Your View and Variables

    Toolbar toolbar;
    ViewPager pager;
    ViewPagerAdapter adapter;
    SlidingTabLayout tabs;
    CharSequence Titles[]={"Flights","Check Booking"};
    int Numboftabs =2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //hide keyboad on activity start
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Creating The Toolbar and setting it as the Toolbar for the activity

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);


        // Creating The ViewPagerAdapter and Passing Fragment Manager, Titles fot the Tabs and Number Of Tabs.
        adapter =  new ViewPagerAdapter(getSupportFragmentManager(),Titles,Numboftabs);

        // Assigning ViewPager View and setting the adapter
        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);

        // Assiging the Sliding Tab Layout View
        tabs = (SlidingTabLayout) findViewById(R.id.tabs);
        tabs.setDistributeEvenly(true); // To make the Tabs Fixed set this true, This makes the tabs Space Evenly in Available width

        // Setting Custom Color for the Scroll bar indicator of the Tab View
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.tabsScrollColor);
            }
        });

        // Setting the ViewPager For the SlidingTabsLayout
        tabs.setViewPager(pager);


    }

    public void setDate(View view){
        DatePickerDialog1 pickerDialog = new DatePickerDialog1();
        pickerDialog.show(getSupportFragmentManager(), "Date Picker 1");
    }

    public void setReturnDate(View view){
        DatePickerDialog2 pickerDialog2 = new DatePickerDialog2();
        pickerDialog2.show(getSupportFragmentManager(), "Date Picker 2");
    }

    public void toggle(View view){
        ToggleButton tb = (ToggleButton)findViewById(R.id.toggleButton);
        EditText et = (EditText)findViewById(R.id.editReturnDate);
        if(tb.isChecked()){
            et.setVisibility(View.VISIBLE);
        }
        else{
            et.setVisibility(View.GONE);
        }
    }

    public void search(View view){
        Intent b = new Intent(MainActivity.this,FlightList.class);
        MainActivity.this.startActivity(b);
        overridePendingTransition(R.animator.push_left_in,R.animator.push_left_out);
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.animator.push_right_in,R.animator.push_right_out);
    }

    public void plusa(View view){
        Context context = getApplicationContext();
        TextView n = (TextView)findViewById(R.id.amountNumber);
        try
        {
            String a = n.getText().toString().trim();

            int b = Integer.parseInt(a);

            int sum = b+1;
            n.setText(sum+"");
        }
        catch (NumberFormatException nfe)
        {
            Toast.makeText(context,nfe+"",Toast.LENGTH_LONG);
        }
    }

    public void plusb(View view){
        Context context = getApplicationContext();
        TextView n = (TextView)findViewById(R.id.amountNumber2);
        try
        {
            String a = n.getText().toString().trim();

            int b = Integer.parseInt(a);

            int sum = b+1;
            n.setText(sum+"");
        }
        catch (NumberFormatException nfe)
        {
            Toast.makeText(context,nfe+"",Toast.LENGTH_LONG);
        }
    }

    public void plusc(View view){
        Context context = getApplicationContext();
        TextView n = (TextView)findViewById(R.id.amountNumber3);
        try
        {
            String a = n.getText().toString().trim();

            int b = Integer.parseInt(a);

            int sum = b+1;
            n.setText(sum+"");
        }
        catch (NumberFormatException nfe)
        {
            Toast.makeText(context,nfe+"",Toast.LENGTH_LONG);
        }
    }

    public void mina(View view){
        Context context = getApplicationContext();
        TextView n = (TextView)findViewById(R.id.amountNumber);
        try
        {
            String a = n.getText().toString().trim();

            int b = Integer.parseInt(a);

            int sum = b-1;
            n.setText(sum+"");
        }
        catch (NumberFormatException nfe)
        {
            Toast.makeText(context,nfe+"",Toast.LENGTH_LONG);
        }
    }

    public void minb(View view){
        Context context = getApplicationContext();
        TextView n = (TextView)findViewById(R.id.amountNumber2);
        try
        {
            String a = n.getText().toString().trim();

            int b = Integer.parseInt(a);

            int sum = b-1;
            n.setText(sum+"");
        }
        catch (NumberFormatException nfe)
        {
            Toast.makeText(context,nfe+"",Toast.LENGTH_LONG);
        }
    }

    public void minc(View view){
        Context context = getApplicationContext();
        TextView n = (TextView)findViewById(R.id.amountNumber3);
        try
        {
            String a = n.getText().toString().trim();

            int b = Integer.parseInt(a);

            int sum = b-1;
            n.setText(sum+"");
        }
        catch (NumberFormatException nfe)
        {
            Toast.makeText(context,nfe+"",Toast.LENGTH_LONG);
        }
    }



}