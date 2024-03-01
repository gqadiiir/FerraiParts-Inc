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
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author qadirnazir
 */
public class AdminHomeController  {

    @FXML
    private Button Home;
    @FXML
    private Button Customer;
    @FXML
    private Button Order;
    @FXML
    private Button Inventory;
    @FXML
    private Button AllOrder;
    @FXML
    private StackPane AdminStackPane;
    

    /**
     * Initializes the controller class.
     */
    
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    
    @FXML
   public void HomeButton(javafx.event.ActionEvent actionEvent) throws IOException
   {
   
       if(AdminStackPane.getChildren().isEmpty())
       { 
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HomeButton.fxml"));
   Parent popupParent = fxmlLoader.load();
   AdminStackPane.getChildren().setAll(popupParent);
       }else
       {
       AdminStackPane.getChildren().clear();
       }
  
   }
    
           
    @FXML
    public void CustomerButton(ActionEvent event){
    try{
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddCustomerbutton.fxml"));
    Parent popupParent = fxmlLoader.load();
    
    Stage popupStage = new Stage();
popupStage.initModality(Modality.NONE);

    Scene popupScene = new Scene(popupParent);
    popupStage.setScene(popupScene);
    
    popupStage.show();
    }catch(IOException e){
        e.printStackTrace();
    }
    }
    
    
    @FXML
    public void OrderButton(javafx.event.ActionEvent actionevent) throws IOException{
    if(AdminStackPane.getChildren().isEmpty())
    {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("OrderButton.fxml"));
    Parent popupParent = fxmlLoader.load();
    
    AdminStackPane.getChildren().setAll(popupParent);
    }else
    {
    AdminStackPane.getChildren().clear();
    }
    
    }
    
    @FXML
    public void InventoryButton(javafx.event.ActionEvent actionevent) throws IOException{
    if(AdminStackPane.getChildren().isEmpty())
    {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(""));
    Parent popupParent = fxmlLoader.load();
    
    AdminStackPane.getChildren().setAll(popupParent);
    }else
    {
    AdminStackPane.getChildren().clear();
    }
    
    }
    
    @FXML
    public void AllOrderButton(javafx.event.ActionEvent actionevent) throws IOException{
    if(AdminStackPane.getChildren().isEmpty())
    {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(""));
    Parent popupParent = fxmlLoader.load();
    
    AdminStackPane.getChildren().setAll(popupParent);
    }else
    {
    AdminStackPane.getChildren().clear();
    }
    
    }
   
    
}
