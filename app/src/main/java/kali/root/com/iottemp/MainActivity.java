package kali.root.com.iottemp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    BarChart barChart;
    int temp;
    int extremecold =0;
    int extremehot =0;
    int cold=0;
    int moderate=0;
    int hot=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int i=1;i<=1;i++) {
            if (temp < 16)
                extremecold++;

            if (temp >= 16 && temp < 20)
                cold++;

            if (temp >= 20 && temp < 22)
                moderate++;

            if (temp >= 20 && temp < 22)
                hot++;

            if (temp >= 20 && temp < 22)
                extremehot++;
        }
        barChart = (BarChart) findViewById(R.id.bargraph);
        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(50,0));
        barEntries.add(new BarEntry(60,1));
        barEntries.add(new BarEntry(40,2));
        barEntries.add(new BarEntry(50,3));
        barEntries.add(new BarEntry(30,4));
        BarDataSet barDataSet = new BarDataSet(barEntries,"No. of systems");
        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);

        ArrayList<String> categories = new ArrayList<>();
        categories.add("<16");
        categories.add("16-20");
        categories.add("20-22");
        categories.add("22-24");
        categories.add("24-26");
        categories.add(">26");


        BarData theData = new BarData(categories,barDataSet);
        barChart.setData(theData);


        barChart.setTouchEnabled(false);
        barChart.setDragEnabled(false);
        barChart.setScaleEnabled(false);
    }
}
