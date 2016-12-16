package ChekBox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Shadow;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Created by Artem on 12.12.2016.
 */
public class Main extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane pane = new BorderPane();

        DropShadow shadow = new DropShadow();
        shadow.setColor(Color.RED);
        shadow.setRadius(10);
        VBox vbox = new VBox(10);
        HBox hbox = new HBox(10);

        CheckBox[] checkBox = new CheckBox[] {
               new CheckBox("RED"), new CheckBox("Blue"), new CheckBox("Green")   };
        Rectangle[] rectangles = new Rectangle[] {
                new Rectangle(40,40, Color.RED), new Rectangle(40,40, Color.GREEN), new Rectangle(40,40, Color.BLUE) };
        for (int i = 0; i<3; ++i)
        {
            CheckBox ch = checkBox[i];

            Rectangle rect = rectangles[i];
            vbox.getChildren().add(ch);
            ch.setOnAction(event -> {
                if (ch.isSelected()) {
                    hbox.getChildren().add(rect);
                    ch.setEffect(shadow);
                } else
                {
                    hbox.getChildren().remove(rect);
                    ch.setEffect(null);
                }
            });
        }







        pane.setCenter(hbox);
        pane.setLeft(vbox);
        Scene scene = new Scene(pane,500,500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
