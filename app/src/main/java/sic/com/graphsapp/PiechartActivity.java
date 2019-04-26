package sic.com.graphsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class PiechartActivity extends AppCompatActivity {

    PieChart chart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piechart);
        chart=findViewById(R.id.chartphones);
        Description desc=new Description();
        desc.setText("phone marketshare in kenya");
       chart.setDescription(desc);

        chart.setRotationEnabled(true);
        chart.setHoleRadius(25f);
        chart.setCenterText("phones");

        ArrayList<PieEntry> yEntries=new ArrayList<>();

        yEntries.add(new PieEntry(0f,20f));
        yEntries.add(new PieEntry(1f,30f));
        yEntries.add(new PieEntry(2f,10f));
        yEntries.add(new PieEntry(3f,40f));
        yEntries.add(new PieEntry(4f,60f));
        yEntries.add(new PieEntry(5f,50f));


        ArrayList<String> xEntries=new ArrayList<>();

        xEntries.add("iphone");
        xEntries.add("huawei");
        xEntries.add("nokia");
        xEntries.add("sumsung");
        xEntries.add("backberry");
        xEntries.add("htc");

        PieDataSet dataSet=new PieDataSet(yEntries,"share by phones");
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        dataSet.setSliceSpace(2);
        dataSet.setValueTextSize(12);

        PieData data=new PieData(dataSet);

        chart.setData(data);
        chart.animateXY(3000,6000);
        chart.invalidate()
        ;
    }
}
