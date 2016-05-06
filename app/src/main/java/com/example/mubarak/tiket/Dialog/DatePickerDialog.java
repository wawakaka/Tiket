package com.example.mubarak.tiket.Dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;
import android.widget.EditText;
import com.example.mubarak.tiket.R;
import java.util.Calendar;

//import for date picker dialog for api 23 above
/*import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;

import android.widget.DatePicker;

import android.app.DialogFragment;
import android.widget.EditText;

import com.example.mubarak.tiket.R;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;*/

/**
 * Created by MUBARAK on 5/6/2016.
 */
public class DatePickerDialog extends DialogFragment implements android.app.DatePickerDialog.OnDateSetListener{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {


        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        android.app.DatePickerDialog dialog;
        dialog = new android.app.DatePickerDialog(getActivity(),this,year,month,day);
        return dialog;


    }

    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        EditText editDate = (EditText)getActivity().findViewById(R.id.editDate);

        editDate.setText(dayOfMonth+"/"+monthOfYear+"/"+year);
    }
}
//date picker dialog for api 23 or above
/*class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

            *//*
                Initialize a new DatePickerDialog

                DatePickerDialog(Context context, DatePickerDialog.OnDateSetListener callBack,
                    int year, int monthOfYear, int dayOfMonth)
             *//*
        DatePickerDialog dpd = new DatePickerDialog(getActivity(),this,year,month,day);
        return  dpd;
    }

    public void onDateSet(DatePicker view, int year, int month, int day){
        // Do something with the chosen date


        // Create a Date variable/object with user chosen date
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(0);
        cal.set(year, month, day, 0, 0, 0);
        Date chosenDate = cal.getTime();

        // Format the date using style and locale
        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.US);
        String formattedDate = df.format(chosenDate);

        // Display the chosen date to app interface
        EditText editDate = (EditText)getActivity().findViewById(R.id.editDate);

        editDate.setText(day+"/"+month+"/"+year);

    }
}*/
