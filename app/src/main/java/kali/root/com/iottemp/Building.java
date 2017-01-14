package kali.root.com.iottemp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class Building extends AppCompatActivity {

    BarChart barChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building);
        barChart = (BarChart) findViewById(R.id.bargraph);
        ArrayList<BarEntry> barEntries = new ArrayList<>();

        //put avg temp of each floor
        barEntries.add(new BarEntry(20,0));
        barEntries.add(new BarEntry(20,1));
        barEntries.add(new BarEntry(20,2));
        barEntries.add(new BarEntry(20,3));
        barEntries.add(new BarEntry(20,4));
        barEntries.add(new BarEntry(20,5));
        barEntries.add(new BarEntry(21,6));
        barEntries.add(new BarEntry(22,7));
        barEntries.add(new BarEntry(22,8));
        barEntries.add(new BarEntry(22,9));

        BarDataSet barDataSet = new BarDataSet(barEntries,"Temperature");
       // barDataSet.setColors(new int[]{R.color.colorPrimaryDark, R.color.blue, R.color.mod,R.color.orange, R.color.red});

        ArrayList<String> categories = new ArrayList<>();
        categories.add("1");
        categories.add("2");
        categories.add("3");
        categories.add("4");
        categories.add("5");
        categories.add("6");
        categories.add("7");
        categories.add("8");
        categories.add("9");
        categories.add("10");




        BarData theData = new BarData(categories,barDataSet);
        barChart.setData(theData);


        barChart.setTouchEnabled(false);
        barChart.setDragEnabled(false);
        barChart.setScaleEnabled(false);

    }
}
