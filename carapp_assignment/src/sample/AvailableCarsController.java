package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AvailableCarsController {
    @FXML
    private  void  back(ActionEvent event) throws Exception{
        Stage primaryStage= new Stage();
        Parent root= FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("All Cars");
        primaryStage.setScene(new Scene(root, 950, 750));
        primaryStage.show();

    }
}
