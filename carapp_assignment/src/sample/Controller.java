package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller {
    @FXML
    private  void  acar(ActionEvent event) throws Exception{
        Stage primaryStage= new Stage();
       Parent root=FXMLLoader.load(getClass().getResource("availablecars.fxml"));
        primaryStage.setTitle("Available Cars");
        primaryStage.setScene(new Scene(root, 950, 750));
        primaryStage.show();

    }
    @FXML
    private  void  sold(ActionEvent event) throws Exception{
        Stage primaryStage= new Stage();
        Parent root=FXMLLoader.load(getClass().getResource("soldcars.fxml"));
        primaryStage.setTitle("sold Cars");
        primaryStage.setScene(new Scene(root, 950, 750));
        primaryStage.show();

    }

@FXML
private  void  carList(ActionEvent event) throws Exception{
    Stage primaryStage= new Stage();
    Parent root=FXMLLoader.load(getClass().getResource("carlist.fxml"));
    primaryStage.setTitle("sold Cars");
    primaryStage.setScene(new Scene(root, 950, 750));
    primaryStage.show();

}
    @FXML
    private  void  companyList(ActionEvent event) throws Exception{
        Stage primaryStage= new Stage();
        Parent root=FXMLLoader.load(getClass().getResource("companyList.fxml"));
        primaryStage.setTitle("sold Cars");
        primaryStage.setScene(new Scene(root, 950, 750));
        primaryStage.show();

    }

}
