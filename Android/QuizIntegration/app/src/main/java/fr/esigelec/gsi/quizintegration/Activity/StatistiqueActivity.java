package fr.esigelec.gsi.quizintegration.Activity;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

import fr.esigelec.gsi.quizintegration.R;

public class StatistiqueActivity extends AppCompatActivity implements OnChartValueSelectedListener{


    private PieChart mChart;

	protected String[] mParties = new String[] {
			"Réponse A", "Réponse B", "Réponse C", "Réponse D"
	};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistique);
        mChart = (PieChart) findViewById (R.id.chart1);
        mChart.setUsePercentValues(true);
        mChart.setDescription("");
        mChart.setExtraOffsets(5, 10, 5, 5);


        mChart.setDragDecelerationFrictionCoef(0.95f);
        mChart.setDrawHoleEnabled(true);
        mChart.setHoleColorTransparent(true);


        mChart.setTransparentCircleColor(Color.WHITE);
        mChart.setTransparentCircleAlpha(110);


        mChart.setHoleRadius(58f);
        mChart.setTransparentCircleRadius(61f);


        mChart.setDrawCenterText(true);


        mChart.setRotationAngle(0);
        // enable rotation of the chart by touch
        mChart.setRotationEnabled(true);
        mChart.setHighlightPerTapEnabled(true);


        // mChart.setUnit(" €");
        // mChart.setDrawUnitsInChart(true);


        // add a selection listener
        mChart.setOnChartValueSelectedListener(this);


        setData(3, 100);


        mChart.animateY(1400, Easing.EasingOption.EaseInOutQuad);


		Legend l = mChart.getLegend();
		l.setPosition(Legend.LegendPosition.RIGHT_OF_CHART);
		l.setXEntrySpace(7f);
		l.setYEntrySpace(0f);
		l.setYOffset(0f);

    }

    private void setData(int count, float range) {

        ArrayList<Entry> yVals1 = new ArrayList<>();


        // IMPORTANT: In a PieChart, no values (Entry) should have the same
        // xIndex (even if from different DataSets), since no values can be
        // drawn above each other.
        for (int i = 0; i < count + 1; i++) {
            yVals1.add(new Entry((float) (Math.random() * range) + range / 5, i));
        }


        ArrayList<String> xVals = new ArrayList<>();


        for (int i = 0; i < count + 1; i++)
            xVals.add(mParties[i % mParties.length]);


        PieDataSet dataSet = new PieDataSet(yVals1, "Election Results");
        dataSet.setSliceSpace(2f);
        dataSet.setSelectionShift(5f);


        // add a lot of colors


        ArrayList<Integer> colors = new ArrayList<>();


        for (int c : ColorTemplate.VORDIPLOM_COLORS)
            colors.add(c);


        for (int c : ColorTemplate.JOYFUL_COLORS)
            colors.add(c);


        for (int c : ColorTemplate.COLORFUL_COLORS)
            colors.add(c);


        for (int c : ColorTemplate.LIBERTY_COLORS)
            colors.add(c);


        for (int c : ColorTemplate.PASTEL_COLORS)
            colors.add(c);


        colors.add(ColorTemplate.getHoloBlue());


        dataSet.setColors(colors);
        //dataSet.setSelectionShift(0f);


        PieData data = new PieData(xVals, dataSet);
        data.setValueFormatter(new PercentFormatter ());
        data.setValueTextSize(11f);
        data.setValueTextColor(Color.WHITE);
        mChart.setData(data);


        // undo all highlights
        mChart.highlightValues(null);


        mChart.invalidate();


    }

	@Override
	public void onValueSelected (Entry e, int dataSetIndex, Highlight h)
	{
		if (e == null)
			return;
		Log.i("VAL SELECTED",
				"Value: " + e.getVal() + ", xIndex: " + e.getXIndex()
						+ ", DataSet index: " + dataSetIndex);
	}

	@Override
	public void onNothingSelected ()
	{

	}
}