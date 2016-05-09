package com.example.mubarak.tiket.Dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;
import android.widget.EditText;

import com.example.mubarak.tiket.R;

import java.util.Calendar;

/**
 * Created by MUBARAK on 5/7/2016.
 */
public class DatePickerDialog2 extends DialogFragment implements android.app.DatePickerDialog.OnDateSetListener{


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {


        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        android.app.DatePickerDialog dialog;
        dialog = new android.app.DatePickerDialog(getActivity(),this,year,month,day);

        dialog.setTitle("Pick your date");
        return dialog;


    }

    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        EditText retrunDate = (EditText)getActivity().findViewById(R.id.editReturnDate);
        retrunDate.setText(dayOfMonth+"/"+monthOfYear+"/"+year);

    }



}