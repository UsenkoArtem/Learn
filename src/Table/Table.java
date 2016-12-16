package Table;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by Artem on 16.12.2016.
 */
public class Table  extends  Application{

        private static Pane root ;
        private Scene scene;

        public static Pane getRoot() {
            return root;
        }

        public static void setRoot(Pane root) {
            Table.root = root;
        }

        @Override
        public void start(Stage primaryStage) throws Exception{

            setRoot(FXMLLoader.load(getClass().getResource("Table.fxml")));
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


