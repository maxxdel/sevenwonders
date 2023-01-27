package com.example.sevenwonders;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class OptionsView {

    @FXML
    private Button boutonMenu;

    @FXML
    protected void mainMenu() throws IOException {
        Stage stage = (Stage) boutonMenu.getScene().getWindow();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("menu-view.fxml")));
        stage.setScene(scene);
        stage.setFullScreen(true);
    }
}
