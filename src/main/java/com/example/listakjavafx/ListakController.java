package com.example.listakjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ListakController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}