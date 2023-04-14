module com.example.padroes_java {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.padroes_java to javafx.fxml;
    exports com.example.padroes_java;
}