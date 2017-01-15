package kali.root.com.iottemp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    BarChart barChart;
    int temp;
    int extremecold =0;
    int extremehot =0;
    int cold=0;
    int hot =0;
    int moderate=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //temp of each room
        for(int i=1;i<=1;i++) {
            if (temp < 16)
                extremecold++;

            if (temp >= 16 && temp < 20)
                cold++;

            if (temp >= 20 && temp < 22)
                moderate++;

            if (temp >= 22 && temp < 26)
                hot++;

            if (temp >= 26)
                extremehot++;
        }
        barChart = (BarChart) findViewById(R.id.bargraph);
        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(extremecold,0));
        barEntries.add(new BarEntry(cold,1));
        barEntries.add(new BarEntry(moderate,2));
        barEntries.add(new BarEntry(extremehot,3));
        BarDataSet barDataSet = new BarDataSet(barEntries,"No. of systems");
        barDataSet.setColors(new int[]{R.color.colorPrimaryDark, R.color.blue, R.color.mod,R.color.orange, R.color.red});

        ArrayList<String> categories = new ArrayList<>();
        categories.add("<16");
        categories.add("16-20");
        categories.add("20-22");
        categories.add("22-26");
        categories.add(">26");


        BarData theData = new BarData(categories,barDataSet);
        barChart.setData(theData);


        barChart.setTouchEnabled(false);
        barChart.setDragEnabled(false);
        barChart.setScaleEnabled(false);
    }
}
