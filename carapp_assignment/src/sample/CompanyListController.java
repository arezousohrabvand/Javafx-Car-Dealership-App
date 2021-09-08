package sample;
import javafx.fxml.Initializable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CompanyListController implements Initializable {
    @FXML
    private TableView<Company> my_table;
    @FXML    private TableColumn<Company, String> name_Column;
    @FXML    private TableColumn<Company, String> street_Column;
    @FXML    private TableColumn<Company, String> city_Column;
    @FXML    private TableColumn<Company, String> province_Column;
    @FXML    private TableColumn<Company, String> postal_Column;
    @FXML    private TableColumn<Company, String> numbers_Column;
    @FXML    private TableColumn<Company, String> price_Column;



    @FXML    private TextField nameTextField;
    @FXML    private TextField streetTextField;
    @FXML    private TextField cityTextField;
    @FXML    private TextField provinceTextField;
    @FXML    private TextField postalTextField;
    @FXML    private TextField numbersTextField;
    @FXML    private TextField priceTextField;
    @FXML    private Button detailBtn;
    @FXML
    private  void  back(ActionEvent event) throws Exception{
        Stage primaryStage= new Stage();
        Parent root= FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("All Cars");
        primaryStage.setScene(new Scene(root, 950, 750));
        primaryStage.show();

    }
    public void goBtn(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("companydetaillist.fxml"));
        Parent tableViewParent = loader.load();

        Scene tableViewScene = new Scene(tableViewParent);


        DetailListCompanyController controller = loader.getController();
        controller.dataPopulate( my_table.getSelectionModel().getSelectedItem());


        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
        window.show();

    }
    public void initialize(URL url, ResourceBundle rb) {
        name_Column.setCellValueFactory(new PropertyValueFactory<Company, String>("name"));
        street_Column.setCellValueFactory(new PropertyValueFactory<Company, String>("streetName"));
        city_Column.setCellValueFactory(new PropertyValueFactory<Company, String>("city"));
        province_Column.setCellValueFactory(new PropertyValueFactory<Company, String>("province"));
        postal_Column.setCellValueFactory(new PropertyValueFactory<Company, String>("postalCode"));
        numbers_Column.setCellValueFactory(new PropertyValueFactory<Company, String>("soldNumber"));
        price_Column.setCellValueFactory(new PropertyValueFactory<Company, String>("price"));

        my_table.setItems(getCompany());
        my_table.setEditable(true);
        my_table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);


        name_Column.setCellFactory(TextFieldTableCell.forTableColumn());
        street_Column.setCellFactory(TextFieldTableCell.forTableColumn());
        city_Column.setCellFactory(TextFieldTableCell.forTableColumn());
        province_Column.setCellFactory(TextFieldTableCell.forTableColumn());
        postal_Column.setCellFactory(TextFieldTableCell.forTableColumn());
        numbers_Column.setCellFactory(TextFieldTableCell.forTableColumn());
        price_Column.setCellFactory(TextFieldTableCell.forTableColumn());

        //this.detailBtn.setDisable(true);



    }
    public  void deleteBtn(){
        ObservableList< Company> selectedRows,allCompany;
        allCompany=my_table.getItems();
        selectedRows=my_table.getSelectionModel().getSelectedItems();
        for ( Company company: selectedRows){
            allCompany.remove( company);
        }

    }
    public  void addNewCar() {
        Company company1=new Company(nameTextField.getText(),streetTextField.getText(),cityTextField.getText(),provinceTextField.getText(),
                postalTextField.getText(),numbersTextField.getText(),priceTextField.getText());

        my_table.getItems().add(company1);
    }


    public ObservableList<Company> getCompany(){
        ObservableList<Company> company= FXCollections.observableArrayList();
        company.add(new Company("Toyota","181 Mapleview Dr W","Barrie","Ontario","ON L4N 9E8","0","0"));
        company.add(new Company("Ford","55 Mapleview Dr W","Barrie","Ontario","L4N 9H7","3","200000"));
        company.add(new Company("Accura","55 Mapleview Dr W","Barrie","Ontario","L4N 9H7","0","0"));
        company.add(new Company("Honda","80 Mapleview Dr W","Barrie","Ontario","ON L4N 9H6","0","0"));
        return  company;
    }
}
