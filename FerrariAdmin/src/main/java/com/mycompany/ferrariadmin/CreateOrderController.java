/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.ferrariadmin;

import com.mycompany.ferrariadmin.JavaData.Customer;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author qadirnazir
 */
public class CreateOrderController {
      @FXML
     private ObservableList<Customer> customerData;

    @FXML
    private TextField Oinvoice;
    @FXML
    private TextField employee;
    @FXML
    private TextField firstname;
    @FXML
    private TextField amount;
    @FXML
    private TextField lastname;
    @FXML
    private TextField date;
    @FXML
    private TextField email;
    @FXML
    private TextArea notes;
    @FXML
    private Button partbutton;
    /*
    @FXML
    private TableColumn<?, ?> Invoice;
    @FXML
    private TableColumn<?, ?> FirstName;
    @FXML
    private TableColumn<?, ?> LastName;
    @FXML
    private TableColumn<?, ?> Email;
    @FXML
    private TableColumn<?, ?> Employee;
    @FXML
    private TableColumn<?, ?> Amount;
    @FXML
    private TableColumn<?, ?> Date;
    @FXML
    private TableColumn<?, ?> Note;
    @FXML
    private TableView<?> OrderList;
    @FXML
    private TableColumn<?, ?> Code;
    */
    @FXML
    private TableColumn<Customer, String> CustomerIDList;
    @FXML
    private TableView<Customer> CustomerId;
   
    
   

    /**
     * Initializes the controller class.
     */
  
    
    @FXML
    public void initialize() {
        // TODO
        
        // Set up the CustomerIDList column to display the customer code
        CustomerIDList.setCellValueFactory(cellData -> cellData.getValue().customerIDProperty());

        // Listen for changes in the customer code and update the table
     if(customerData != null){ 
        CustomerId.setItems(customerData); 
     }
     }    
    
      private void updateCustomerTable(String newCode) {
        // Update your CustomerId TableView with the new code
        // This might involve querying your data source for the customer with the new code
        // and then updating the items in the TableView
    }

    @FXML
    private void handleAddButton(ActionEvent event) {
    }
  
    public void initData(ObservableList<Customer> customerData) {
        this.customerData = customerData;
        if (CustomerId != null) {
            CustomerId.setItems(this.customerData);
        }
    }

}
