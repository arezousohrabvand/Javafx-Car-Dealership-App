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

public class CarDetailListController implements Initializable {
    private  Car carSelected;

@FXML private Label makeLabel;
@FXML private Label modelLabel;
@FXML private Label engineLabel;
@FXML private Label conditionLabel;
@FXML private Label colorLabel;
@FXML private Label priceLabel;
@FXML private Label numberLabel;
    @FXML
    private  void  back(ActionEvent event) throws Exception{
        Stage primaryStage= new Stage();
        Parent root= FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("All Cars");
        primaryStage.setScene(new Scene(root, 950, 750));
        primaryStage.show();

    }

public void populateDate (Car car){
    carSelected=car;
    makeLabel.setText(carSelected.getMake());
    modelLabel.setText(carSelected.getModel());
    engineLabel.setText(carSelected.getEngine());
    conditionLabel.setText(carSelected.getCondition());
    priceLabel.setText(carSelected.getPrice());
    numberLabel.setText(carSelected.getNumber());

}
    public void initialize(URL url, ResourceBundle rb){

    }

}
