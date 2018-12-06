package com.example.omarfaruk.daytodayexpenses.fragment;

import android.app.DatePickerDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.omarfaruk.daytodayexpenses.R;

import java.text.DateFormat;
import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DailyFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link DailyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DailyFragment extends Fragment {
    View view;
    TextView dailydateTv,currentmonth,currentyear,dayofweek,ikdd;
    LinearLayout dailydateLout;
    ImageButton leftbutton,rightbutton;
    DatePickerDialog datePickerDialog;
    int i;

    public DailyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_daily, container, false);
        dailydateTv=view.findViewById(R.id.dailydate);
        currentmonth=view.findViewById(R.id.currentmonth);
        currentyear=view.findViewById(R.id.currentyear);
        dayofweek=view.findViewById(R.id.dayofweek);
        dailydateLout=view.findViewById(R.id.dailydateLout);
        leftbutton=view.findViewById(R.id.left_icon);
        rightbutton=view.findViewById(R.id.right_icon);
        ikdd=view.findViewById(R.id.ikdd);


        final Calendar calendar=Calendar.getInstance();
        String currentdate= DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        String[] arrOfStr = currentdate.split(",");
        String day=arrOfStr[0];
        String date=arrOfStr[1];
        String[] arrOfSt=date.split(" ");
        dailydateTv.setText(arrOfSt[1]);
        dayofweek.setText(day);
        currentmonth.setText(arrOfSt[2]);
        currentyear.setText(arrOfSt[3]);
        dailydateLout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int year=calendar.get(Calendar.YEAR);
                int month=calendar.get(Calendar.MONTH);
                int day=calendar.get(Calendar.DAY_OF_MONTH);
                datePickerDialog=new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        calendar.set(Calendar.YEAR,year);
                        calendar.set(Calendar.MONTH,month);
                        calendar.set(Calendar.DAY_OF_MONTH,dayOfMonth);
                        String currentdate= DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
                        String[] arrOfStr = currentdate.split(",");
                        String day=arrOfStr[0];
                        String date=arrOfStr[1];
                        String[] arrOfSt=date.split(" ");
                        dailydateTv.setText(arrOfSt[1]);
                        dayofweek.setText(day);
                        currentmonth.setText(arrOfSt[2]);
                        currentyear.setText(arrOfSt[3]);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });
        leftbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=0;
                i++;
                int year=calendar.get(Calendar.YEAR);
                int month=calendar.get(Calendar.MONTH);
                int day=calendar.get(Calendar.DAY_OF_MONTH);
                calendar.set(Calendar.YEAR,year);
                calendar.set(Calendar.MONTH,month);
                calendar.set(Calendar.DAY_OF_MONTH,day-i);
                String currentdate= DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
                String[] arrOfStr = currentdate.split(",");
                String dayy=arrOfStr[0];
                String date=arrOfStr[1];
                String[] arrOfSt=date.split(" ");
                dailydateTv.setText(arrOfSt[1]);
                dayofweek.setText(dayy);
                currentmonth.setText(arrOfSt[2]);
                currentyear.setText(arrOfSt[3]);
            }
        });
        rightbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=0;

                i++;
                int year=calendar.get(Calendar.YEAR);
                int month=calendar.get(Calendar.MONTH);
                int day=calendar.get(Calendar.DAY_OF_MONTH);
                calendar.set(Calendar.YEAR,year);
                calendar.set(Calendar.MONTH,month);
                calendar.set(Calendar.DAY_OF_MONTH,day+i);
                String currentdate= DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
                String[] arrOfStr = currentdate.split(",");
                String dayy=arrOfStr[0];
                String date=arrOfStr[1];
                String[] arrOfSt=date.split(" ");
                dailydateTv.setText(arrOfSt[1]);
                dayofweek.setText(dayy);

                currentmonth.setText(arrOfSt[2]);
                currentyear.setText(arrOfSt[3]);
            }
        });
        return view;
    }

}
