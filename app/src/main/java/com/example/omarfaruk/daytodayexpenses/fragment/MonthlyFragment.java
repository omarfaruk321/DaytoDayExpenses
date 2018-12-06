package com.example.omarfaruk.daytodayexpenses.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.omarfaruk.daytodayexpenses.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MonthlyFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link MonthlyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MonthlyFragment extends Fragment {
   View view;
    public MonthlyFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_monthly, container, false);
        return view;
    }


}
