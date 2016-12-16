package SB.Controler;

import SB.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.Random;


public class Controller {
    @FXML
    public Button addButton;
    @FXML
    public  CheckBox addButton1;
    @FXML
    public TextField text;
    static  int i = 0 ;
    Chart chart = new Chart();
    static   Rectangle rectangle = new Rectangle(20,20, Color.RED);
        public void button1(ActionEvent actionEvent) {

               if (i>0) {
                   chart.deleteseries();
               }
                 chart.setDate();



 if (i==0)Main.getRoot().getChildren().add(chart.getchart());
    ++i;


    }

    public void button2(ActionEvent actionEvent) {

        if (addButton1.isSelected()) Main.getRoot().getChildren().add(rectangle); else
                                     Main.getRoot().getChildren().remove(rectangle);


    }

    public void WriteText(ActionEvent actionEvent) {
        String s = text.getText();
        if (s.equals("art"))
        Main.getRoot().getChildren().add(new Rectangle(100,100,Color.DARKBLUE));
    }
}
