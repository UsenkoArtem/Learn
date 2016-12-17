package Table;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Artem on 16.12.2016.
 */
public class Controller extends Application {
    @FXML
    public TextField Text_name;
    @FXML
    public TextField Text_name2;
    @FXML
    public TextField Text_phone;
    @FXML
    public TextField Text_email;
    @FXML
    public TextField Text_country;

    private ObservableList<Person> usersData = FXCollections.observableArrayList();

    @FXML
    public TableView<Person> Table;

    @FXML
    public TableColumn<Person, String> Name;

    @FXML
    public TableColumn<Person, String> LastName;

    @FXML
    public TableColumn<Person, String> Phone;

    @FXML
    public TableColumn<Person, String> email;

    @FXML
    public TableColumn<Person, String> Country;
    @FXML
    public Button Button_ok;
    @FXML
    public Button Button_reset;

    @FXML
    private void initialize() {
        intitData();
        // устанавливаем тип и значение которое должно хранится в колонке
        Name.setCellValueFactory(new PropertyValueFactory<Person, String>("Name"));
        LastName.setCellValueFactory(new PropertyValueFactory<Person, String>("LastName"));
        Phone.setCellValueFactory(new PropertyValueFactory<Person, String>("Phone"));
        Country.setCellValueFactory(new PropertyValueFactory<Person, String>("Country"));
        email.setCellValueFactory(new PropertyValueFactory<Person, String>("email"));

        Table.setItems(usersData);
    }

    private void intitData() {
        usersData.add(new Person("Artem", "Usenko", "1416", "gmail.com", "Ukrain"));
    }

    public void AddTable(ActionEvent actionEvent) {
        try {
        Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXML/User.fxml"));
            System.out.println("fa");
            Pane load = (AnchorPane) loader.load();

            stage.setTitle("Редактирование записи");

        stage.setResizable(false);
        stage.setScene(new Scene(load));
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(((Node)actionEvent.getSource()).getScene().getWindow());
        stage.show();

    } catch (IOException e) {
            System.out.println("faf");
    }

    }

    public void Bitton_reset(ActionEvent actionEvent) {
    }

    public void Bitton_ok(ActionEvent actionEvent) {
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }


    public void button2(ActionEvent actionEvent) {
    }

    public void WriteText(ActionEvent actionEvent) {
    }

    public void button1(ActionEvent actionEvent) {
    }
}
