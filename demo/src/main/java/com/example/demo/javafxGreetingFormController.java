package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class javafxGreetingFormController {
    @FXML
    private TextField nameField;

    @FXML
    private void greetButtonClicked() {
        // Get the text from the name field
        String name = nameField.getText();

        // Show a dialog with the greeting message
        showGreetingDialog("Hello, " + name + "!");
    }

    private void showGreetingDialog(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Greeting");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}