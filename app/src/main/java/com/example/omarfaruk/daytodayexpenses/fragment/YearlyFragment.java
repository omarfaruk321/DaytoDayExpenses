package com.example.omarfaruk.daytodayexpenses.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.omarfaruk.daytodayexpenses.R;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link YearlyFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link YearlyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class YearlyFragment extends Fragment {
    TextView year;
    ImageButton leftbutton,reghtbutton;
    int i;
    View view;
     Calendar calendar=Calendar.getInstance();
    public YearlyFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view= inflater.inflate(R.layout.fragment_yearly, container, false);
        year=view.findViewById(R.id.year);
        leftbutton=view.findViewById(R.id.left_icon);
        reghtbutton=view.findViewById(R.id.right_icon);
        // Calendar calendar=Calendar.getInstance();
        year.setText(""+calendar.get(Calendar.YEAR));
        leftbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i--;
                //Calendar calendar=Calendar.getInstance();
                year.setText(""+(calendar.get(Calendar.YEAR)+i));
            }
        });
        reghtbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                year.setText(""+(calendar.get(Calendar.YEAR)+i));
            }
        });
        return view;
    }

}
