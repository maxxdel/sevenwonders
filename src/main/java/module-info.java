module com.example.sevenwonders {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires jdk.management.agent;


    opens com.example.sevenwonders to javafx.fxml;
    exports com.example.sevenwonders;
}