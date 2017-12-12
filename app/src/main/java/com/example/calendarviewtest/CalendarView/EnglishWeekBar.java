package com.example.calendarviewtest.CalendarView;

import android.content.Context;
import android.view.LayoutInflater;

import com.example.calendarviewtest.R;
import com.haibin.calendarview.WeekBar;

/**
 * Created by 易辰 on 2017/12/11.
 */

public class EnglishWeekBar extends WeekBar {
    public EnglishWeekBar(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.english_week_bar, this, true);
    }
}
