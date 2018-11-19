package pl.bartlomieja.projekt.warstwa.GUI;

import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class AverageChart {

   public final NumberAxis xAxis = new NumberAxis();
    final NumberAxis yAxis = new NumberAxis();
    final LineChart<Number, Number> lineChart =
            new LineChart<Number, Number>(xAxis, yAxis);

    public XYChart.Series series1 = new XYChart.Series();
    public XYChart.Series series2 = new XYChart.Series();
    public XYChart.Series series3 = new XYChart.Series();


    public LineChart<Number, Number> getAverageChart() {


        xAxis.setLabel("Measurement number");
        lineChart.setTitle("Average values");


        series1.setName("Ux2");
        series2.setName("Uy2");
        series3.setName("Uz2");


        xAxis.setAutoRanging(false);
        xAxis.setLowerBound(0);
        xAxis.setUpperBound(0);
        xAxis.setTickUnit(1);

        yAxis.setAutoRanging(false);
        yAxis.setLowerBound(0);
        yAxis.setUpperBound(4);
        yAxis.setTickUnit(0.5);


        return lineChart;
    }
}
