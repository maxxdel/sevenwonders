package com.example.sevenwonders;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.io.IOException;

public class MenuControllers {
    @FXML
    private ImageView cartewonder1, cartewonder2;
    @FXML
    private Label testText;
    @FXML
    private Button gameButton;
    @FXML
    private Button optionsButton;
    @FXML
    private Button quitButton;
    @FXML
    private Button rulesButton;
    @FXML
    protected void onOptionsButtonClick() throws IOException {
        Stage stage = (Stage) optionsButton.getScene().getWindow();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("options-view.fxml")));
        stage.setScene(scene);
        stage.setFullScreen(true);

    }
    public void deplacementCarte1() {
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), cartewonder1);
        transition.setToX(297);
        transition.setToY(345);
        Rotate rotate = new Rotate(270);
        cartewonder1.getTransforms().add(rotate);
        transition.play();
    }
    @FXML
    protected void onGameButtonClick() throws IOException {
        Stage stage = (Stage) gameButton.getScene().getWindow();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("selection-view.fxml")));
        stage.setScene(scene);
        stage.setFullScreen(true);
    }
    @FXML
    protected void onRulesButtonClick() throws IOException {
        Stage stage = (Stage) rulesButton.getScene().getWindow();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("rules-view.fxml")));
        stage.setScene(scene);
        stage.setFullScreen(true);
    }

    @FXML
    protected void onQuitButtonClick() {
        System.exit(0);
    }
}