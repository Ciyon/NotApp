package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculationsSummaryController {

    /**
     * @author Michelle
     * For getting back to front page..
     */
    @FXML
    public void doneButtonClicked(ActionEvent event) throws IOException {
        Parent compareAppParent = FXMLLoader.load(getClass().getResource("../fxml/FirstPage.fxml"));
        Scene compareAppScene = new Scene(compareAppParent);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(compareAppScene);

        window.show();
    }
}
