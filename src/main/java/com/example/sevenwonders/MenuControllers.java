package com.example.sevenwonders;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class MenuControllers {
    @FXML
    private Label testText;
    @FXML
    private Button gameButton;
    @FXML
    private Button optionsButton;
    @FXML
    private Button quitButton;
    @FXML
    protected void onOptionsButtonClick() throws IOException {
        Stage stage = (Stage) optionsButton.getScene().getWindow();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("options-view.fxml")));
        stage.setScene(scene);
        stage.setFullScreen(true);
    }

    @FXML
    protected void onGameButtonClick() throws IOException {
        Stage stage = (Stage) gameButton.getScene().getWindow();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("selection-view.fxml")));
        stage.setScene(scene);
        stage.setFullScreen(true);
    }

    @FXML
    protected void onQuitButtonClick() {
        System.exit(0);
    }
}