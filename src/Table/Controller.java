package Table;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * Created by Artem on 16.12.2016.
 */
public class Controller {

    private ObservableList<Person> usersData = FXCollections.observableArrayList();

    @FXML
    public TableView<Person> Table;

    @FXML
    public TableColumn<Person , String> Name;

    @FXML
    public  TableColumn<Person , String> LastName;

    @FXML
    public  TableColumn<Person , String> Phone;

    @FXML
    public TableColumn<Person , String> email;

    @FXML
    public TableColumn<Person , String> Country;
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
        usersData.add(new Person("Artem", "Usenko" ,"1416", "gmail.com", "Ukrain"));
    }

    public void AddTable(ActionEvent actionEvent) {

        Table.setEditable(true);
        ObservableList<Person> data = Table.getItems();
        data.add(new Person("Artem", "Usenko" ,"1416", "gmail.com", "Ukrain"));
        Table.setItems(data);
        System.out.println("af");
    }
}
