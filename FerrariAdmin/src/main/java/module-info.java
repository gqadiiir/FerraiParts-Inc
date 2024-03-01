module com.mycompany.ferrariadmin {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.ferrariadmin to javafx.fxml;
    exports com.mycompany.ferrariadmin;
}
