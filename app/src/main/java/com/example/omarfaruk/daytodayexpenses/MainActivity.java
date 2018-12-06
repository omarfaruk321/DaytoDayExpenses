package com.example.omarfaruk.daytodayexpenses;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.omarfaruk.daytodayexpenses.fragment.DailyFragment;
import com.example.omarfaruk.daytodayexpenses.fragment.MonthlyFragment;
import com.example.omarfaruk.daytodayexpenses.fragment.YearlyFragment;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.tablayoutid);
        viewPager=findViewById(R.id.viewpageid);

        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new DailyFragment(),"DAILY");
        adapter.AddFragment(new MonthlyFragment(),"MONTHLY");
        adapter.AddFragment(new YearlyFragment(),"YEARLY");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
