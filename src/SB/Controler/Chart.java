package SB.Controler;

import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import java.util.Random;

/**
 * Created by Artem on 16.12.2016.
 */
public class Chart {
    private NumberAxis xAxis;
    private NumberAxis yAxis;
    private LineChart<Number, Number> chart ;
    private  XYChart.Series<Number, Number> series ;
    public  Chart () {
        this.xAxis = new NumberAxis();
        this.yAxis = new NumberAxis();
        this.chart = new LineChart<Number, Number>(xAxis, yAxis);

    }
    public  void setxAxis (String name)  {xAxis.setLabel(name);}
    public  void setyAxis (String name ) {yAxis.setLabel(name);}
    public  void setNameSeries (String name) {series.setName(name);}
    public void setDate () {
        series = new XYChart.Series<Number, Number>();
        Random random = new Random();
        for (int i = 0; i < 10 + random.nextInt(20); i++) {
            series.getData().add(new XYChart.Data<Number, Number>(10 * i + 5, random.nextDouble() * 120));
        }
        chart.getData().add(series);
    }
    public  XYChart.Series<Number, Number>  getSeries() {
            return  series;
        }
    public void deleteseries() {
        chart.getData().remove(series);

    }
    public LineChart<Number, Number> getchart() {
        return  chart;
    }

}

