package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class DetailListCompanyController implements Initializable {
    private Company companySelected;
    @FXML
    private Label name_Label;
    @FXML private Label street_Label;
    @FXML private Label city_Label;
    @FXML private Label province_Label;
    @FXML private Label postal_Label;
    @FXML private Label number_Label;
    @FXML private Label price_Label;
    @FXML
    private  void  back(ActionEvent event) throws Exception{
        Stage primaryStage= new Stage();
        Parent root= FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("All Cars");
        primaryStage.setScene(new Scene(root, 950, 750));
        primaryStage.show();

    }
    public  void dataPopulate(Company company){
        companySelected=company;
        name_Label.setText(companySelected.getName());
        street_Label.setText(companySelected.getStreetName());
        city_Label.setText(companySelected.getCity());
        province_Label.setText(companySelected.getProvince());
        postal_Label.setText(companySelected.getPostalCode());
        number_Label.setText(companySelected.getSoldNumber());
        price_Label.setText(companySelected.getPrice());

    }

    public void  initialize (URL url , ResourceBundle rb){

    }

}
