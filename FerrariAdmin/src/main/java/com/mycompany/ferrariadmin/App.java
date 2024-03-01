package com.mycompany.ferrariadmin;

import com.mycompany.ferrariadmin.JavaData.Customer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * JavaFX App
 */
public class App extends Application {
private static Scene AdminHome;
    private static Scene scene;
    
    private ObservableList<Customer> customerData = FXCollections.observableArrayList();

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("admin"), 350, 360);
        AdminHome = new Scene(loadFXML("AdminHome"),1100 , 900);
        stage.setScene(scene);
        stage.show();
    }
public static void switchtoAdminhome()
{
Stage stage = (Stage) scene.getWindow();
stage.setScene(AdminHome);
scene = AdminHome;

}

public void openCreateOrder() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CreateOrder.fxml"));
        Parent root = loader.load();

        CreateOrderController controller = loader.getController();
        controller.initData(customerData); // Passing the list to the controller

        // Show the scene...
    }


    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}