/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.ferrariadmin;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SortEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author qadirnazir
 */
public class HomeButtonController  {

    @FXML
    private TableView<?> Order;
    @FXML
    private TableColumn<?, ?> Invoice;
    @FXML
    private TableColumn<?, ?> Customerfirstname;
    @FXML
    private TableColumn<?, ?> Customerlastname;
    @FXML
    private TableColumn<?, ?> Amount;
    @FXML
    private TableColumn<?, ?> date;
    @FXML
    private TableColumn<?, ?> Employee;
    @FXML
    private TableColumn<?, ?> Notes;

    /**
     * Initializes the controller class.
     */
    

    @FXML
    private void initialize() {
    }
    
}
