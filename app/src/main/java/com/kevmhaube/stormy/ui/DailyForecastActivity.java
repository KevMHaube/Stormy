package com.kevmhaube.stormy.ui;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

import com.kevmhaube.stormy.R;
import com.kevmhaube.stormy.adapters.DayAdapter;
import com.kevmhaube.stormy.weather.Day;

import java.util.Arrays;

public class DailyForecastActivity extends ListActivity {

    private Day[] mDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forcast);

        Intent intent = getIntent();
        Parcelable[] parcels = intent.getParcelableArrayExtra(MainActivity.DAILY_FORECAST);
        mDays = Arrays.copyOf(parcels, parcels.length, Day[].class);

        DayAdapter adapter = new DayAdapter(this, mDays);

        setListAdapter(adapter);
    }

}
