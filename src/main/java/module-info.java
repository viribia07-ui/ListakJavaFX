module com.example.listakjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.listakjavafx to javafx.fxml;
    exports com.example.listakjavafx;
}