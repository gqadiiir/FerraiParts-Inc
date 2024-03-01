  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.ferrariadmin;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author qadirnazir
 */
public class AdminController implements Initializable {

    @FXML
    private TextField userTF;
    @FXML
    private TextField passwordTF;
    @FXML
    private Button loginbtn;
    @FXML
    private Button registerbtn;
    @FXML
    private Button guestbtn;
    @FXML
    private Label text;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void loginhandle(ActionEvent event)
    {
    String username = userTF.getText();
    String Password = passwordTF.getText();
    
    String user = "qadir";
    String Pass = "1";
    
    if(username.equals(user) && Password.equals(Pass) )
    {
    App.switchtoAdminhome();
    text.setText("VALID USER");
      }else{
    text.setText("INCORRECT, PLEASE TRY AGAIN");
    }
    }
}



