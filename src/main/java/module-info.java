module com.example.enigmaapplication {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.enigmaapplication to javafx.fxml;
    exports com.example.enigmaapplication;
}
