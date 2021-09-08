package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CarListController implements Initializable {
    @FXML
    private TableView<Car> tableView;
    @FXML    private TableColumn<Car, String> columnMake;
    @FXML    private TableColumn<Car, String> modelColumn;
    @FXML    private TableColumn<Car, String> conditionColumn;
    @FXML    private TableColumn<Car, String> engineColumn;
    @FXML    private TableColumn<Car, String> yearColumn;
    @FXML    private TableColumn<Car, String> numberColumn;
    @FXML    private TableColumn<Car, String> priceColumn;
    @FXML    private TableColumn<Car, String> colorColumn;
    @FXML    private TableColumn<Car, String> dateColumn;
    @FXML    private TextField makeTextField;
    @FXML    private TextField model_TextField;
    @FXML    private TextField conditionTextField;
    @FXML    private TextField engineTextField;
    @FXML    private TextField yearTextField;
    @FXML    private TextField number_TextField;
    @FXML    private TextField priceTextField;
    @FXML    private TextField colorTextField;
    @FXML    private TextField dateTextField;

    @FXML
    private  void  back(ActionEvent event) throws Exception{
        Stage primaryStage= new Stage();
        Parent root= FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("All Cars");
        primaryStage.setScene(new Scene(root, 950, 750));
        primaryStage.show();

    }
    public  void make_change(TableColumn.CellEditEvent cellEditEvent){
        Car carSelected=tableView.getSelectionModel().getSelectedItem();
        carSelected.setMake(cellEditEvent.getNewValue().toString());
    }
    public void initialize(URL url, ResourceBundle rb) {
        columnMake.setCellValueFactory(new PropertyValueFactory<Car, String>("make"));
        modelColumn.setCellValueFactory(new PropertyValueFactory<Car, String>("model"));
        conditionColumn.setCellValueFactory(new PropertyValueFactory<Car, String>("condition"));
        engineColumn.setCellValueFactory(new PropertyValueFactory<Car, String>("engine"));
        yearColumn.setCellValueFactory(new PropertyValueFactory<Car, String>("year"));
        numberColumn.setCellValueFactory(new PropertyValueFactory<Car, String>("number"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<Car, String>("price"));
        colorColumn.setCellValueFactory(new PropertyValueFactory<Car, String>("color"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<Car, String>("date"));

        tableView.setItems(getCar());



        tableView.setEditable(true);
        columnMake.setCellFactory(TextFieldTableCell.forTableColumn());
        modelColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        conditionColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        engineColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        yearColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        numberColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        priceColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        colorColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        dateColumn.setCellFactory(TextFieldTableCell.forTableColumn());

        tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);


    }
    public void goBtn(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("cardetaillist.fxml"));
        Parent tableViewParent = loader.load();

        Scene tableViewScene = new Scene(tableViewParent);


        CarDetailListController controller = loader.getController();
        controller.populateDate( tableView.getSelectionModel().getSelectedItem());


        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();

    }
    public  void deleteButtonPushes(){
        ObservableList<Car> selectedRows,allCar;
        allCar=tableView.getItems();
        selectedRows=tableView.getSelectionModel().getSelectedItems();
        for (Car car: selectedRows){
            allCar.remove(car);
        }

    }
    public  void addNewCar() {
        Car car1=new Car(makeTextField.getText(),model_TextField.getText(),conditionTextField.getText(),engineTextField.getText(),
                yearTextField.getText(),number_TextField.getText(),priceTextField.getText(),colorTextField.getText(),dateTextField.getText());

        tableView.getItems().add(car1);
    }


    public ObservableList<Car> getCar(){
        ObservableList<Car> car= FXCollections.observableArrayList();
        car.add(new Car("Honda","Mugen","new","2lit","2021","4","65000","white","available"));
        car.add(new Car("Honda","HRV","new","2lit","2021","4","29770","black","available"));
        car.add(new Car("Honda","CRV","new","4lit","2021","4","46839","silver","available"));
        car.add(new Car("Toyota","Landcruiser","new","6lit","2021","4","29770","white","available"));
        car.add(new Car("Toyota","Venza","new","4lit","2021","4","65000","white","available"));
        car.add(new Car("Toyota","GR Supra","new","2lit","2021","4","29770","white","available"));
        car.add(new Car("Accura","RDX","new","4lit","2021","4","65000","white","available"));
        car.add(new Car("Accura","TLX","new","2lit","2021","4","29770","white","available"));
        car.add(new Car("Accura","NSX","new","4lit","2021","4","65000","white","available"));
        car.add(new Car("Ford","Bronco","new","6lit","2021","4","29770","yellow","sold(april12th)"));
        car.add(new Car("Ford","Explorer","new","4lit","2021","4","29770","white","sold(oct17th)"));
        car.add(new Car("Ford","Edge","new","2lit","2021","4","29770","white","sold(may22th)"));
        return car;
    }
}
