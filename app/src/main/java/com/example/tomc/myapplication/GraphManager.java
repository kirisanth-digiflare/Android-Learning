package com.example.tomc.myapplication;

import android.content.Context;

import com.github.mikephil.charting.charts.LineChart;

/**
 * Created by TomC on 6/11/2015.
 */
public class GraphManager {

    LineChart mChart;

    public GraphManager(Context context) {
        mChart = new LineChart(context);
    }

}
