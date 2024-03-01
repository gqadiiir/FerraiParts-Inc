/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.ferrariadmin;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author qadirnazir
 */
public class OrderButtonController  {

    @FXML
    private Button CreateOrder;
    @FXML
    private Button ViewOrder;
    @FXML
    private Button AllOrder;

    /**
     * Initializes the controller class.
     */
    
    public void initialize() {
        // TODO
    }    
    
    @FXML
    public void CreateOrder(ActionEvent event) throws IOException
    {
  try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CreateOrder.fxml"));
        Parent popupParent = fxmlLoader.load();

        Stage popupStage = new Stage();
        popupStage.initModality(Modality.NONE);

        Scene popupScene = new Scene(popupParent);
        popupStage.setScene(popupScene);

        popupStage.show();
    } catch (IOException e) {
        e.printStackTrace();
        // Optionally, show an error message to the user
    }
    }
}
