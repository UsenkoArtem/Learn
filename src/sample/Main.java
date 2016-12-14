package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello World");
        primaryStage.setWidth(300);
        primaryStage.setHeight(300);
        Pane pan = new Pane();
        Button but = new Button();
        Rectangle rect = new Rectangle(50,50);
        but.setText("okey");
        but.setTranslateX(100);
        but.setTranslateY(100);
        but.setPrefSize(50,50);
        but.setOnAction(event -> {
            System.out.println(123);
            if(rect.getFill()==Color.GREEN)  rect.setFill(Color.RED); else
                                            rect.setFill(Color.GREEN);
        });
        pan.getChildren().addAll(but,rect);
        Scene scane = new Scene(pan);
        primaryStage.setScene(scane);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
