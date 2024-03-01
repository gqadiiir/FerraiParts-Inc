/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.ferrariadmin;

import com.mycompany.ferrariadmin.JavaData.Customer;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
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
public class AddCustomerbuttonController {
    
     private SharedCustomerModel sharedModel = SharedCustomerModel.getInstance();


    @FXML
    private TextField employee;
    @FXML
    private TextField customercar;
    @FXML
    private TextField customername;
    @FXML
    private TextField email;
    @FXML
    private TextArea notes;
    @FXML
    private Button partbutton;
    @FXML
    private Button Delete;
    @FXML
    private TableColumn<Customer, String> Code;
    @FXML
    private TableColumn<Customer, String> FistName;
    @FXML
    private TableColumn<Customer, String> LastName;
    @FXML
    private TableColumn<Customer, String> Email;
    @FXML
    private TableColumn<Customer, String> Employee;
    @FXML
    private TableColumn<Customer, String> Date;
    @FXML
    private TableColumn<Customer, String> Note;
    @FXML
    private TableView<Customer> CustomerList;
private ObservableList<Customer> customerData = FXCollections.observableArrayList();
    @FXML
    private TextField code;

    /**
     * Initializes the controller class.
     */
   @FXML
    public void initialize() {
        // TODO
        Code.setCellValueFactory(cellData -> cellData.getValue().customerIDProperty());
        FistName.setCellValueFactory(cellData -> cellData.getValue().cFistNameProperty());
        LastName.setCellValueFactory(cellData -> cellData.getValue().cLastNameProperty());
        Email.setCellValueFactory(cellData -> cellData.getValue().cEmailProperty());
        Employee.setCellValueFactory(cellData -> cellData.getValue().employeeIdProperty());
      
        Date.setCellValueFactory(cellData -> cellData.getValue().dateProperty());
        Note.setCellValueFactory(cellData -> cellData.getValue().noteProperty());
        
        CustomerList.setItems(customerData);
                CustomerList.setItems(sharedModel.getCustomerData());

    }    
    
    

    @FXML
    private void handleAddButton(ActionEvent event) {
        // Example data for a new customer
    String customerCode = "C123";
    String firstname = "John";
    String lastname = "Doe";
    String emailValue = "johndoe@example.com";
    String employeeValue = "E456";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String formattedDateTime = LocalDateTime.now().format(formatter);
    String noteValue = "Sample note";

    // Create a new customer with the example data
    Customer newCustomer = new Customer(customerCode, firstname, lastname, emailValue, employeeValue, noteValue);

    // Add the new customer to the shared model
    sharedModel.addCustomer(newCustomer); // Add the new customer to the ObservableList

    
        
    }
}
