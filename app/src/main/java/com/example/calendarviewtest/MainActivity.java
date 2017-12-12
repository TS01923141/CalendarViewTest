package com.example.calendarviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.haibin.calendarview.CalendarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    CalendarView calendarView;
}
