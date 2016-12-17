package Table;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Table  extends  Application{

        @Override
        public void start(Stage primaryStage) throws Exception{
            Parent root = FXMLLoader.load(getClass().getResource("FXML/User.fxml"));
            primaryStage.setTitle("Hello World");
            primaryStage.setMinHeight(600);
            primaryStage.setMinWidth(400);
            primaryStage.setScene(new Scene(root, 300, 275));
            primaryStage.show();
        }



        public static void main(String[] args) {
            launch(args);
        }

    }


