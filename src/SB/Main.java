package SB;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    private static Pane root ;
    private Scene scene;

    public static Pane getRoot() {
        return root;
    }

    public static void setRoot(Pane root) {
        Main.root = root;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

         setRoot(FXMLLoader.load(getClass().getResource("FXML/sample.fxml")));
        primaryStage.setTitle("Hello World");
         setScene(new Scene(getRoot()));
        primaryStage.setScene(getScene());
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
}
