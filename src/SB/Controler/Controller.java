package SB.Controler;

import SB.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Controller {
    @FXML
    public Button addButton;
    @FXML
    public  CheckBox addButton1;
    static  int i = 0 ;
    static   Rectangle rectangle = new Rectangle(20,20, Color.RED);
    public void button1(ActionEvent actionEvent) {
        Button but = new Button(Integer.toString(i));
        but.setTranslateX(Math.random()*200);
        but.setTranslateY(Math.random()*600);
        but.setOpacity(Math.random());
        System.out.println(12);
        ++i;
        Main.getRoot().getChildren().add(but);

    }

    public void button2(ActionEvent actionEvent) {

        if (addButton1.isSelected()) Main.getRoot().getChildren().add(rectangle); else
                                     Main.getRoot().getChildren().remove(rectangle);


    }
}
