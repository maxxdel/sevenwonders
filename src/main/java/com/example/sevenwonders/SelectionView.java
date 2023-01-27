package com.example.sevenwonders;

import java.io.IOException;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;

public class SelectionView {

    @FXML
    private Button startButton;

    @FXML
    protected ComboBox age1;

    @FXML
    protected ComboBox age2;

    @FXML
    protected ComboBox age3;

    @FXML
    protected ComboBox age4;

    @FXML
    protected ComboBox age5;

    @FXML
    protected ComboBox age6;

    @FXML
    protected ComboBox age7;

    @FXML
    protected TextField name1;

    @FXML
    protected TextField name2;

    @FXML
    protected TextField name3;

    @FXML
    protected TextField name4;

    @FXML
    protected TextField name5;

    @FXML
    protected TextField name6;

    @FXML
    protected TextField name7;

    @FXML
    private ComboBox comboBox;

    @FXML
    private Button boutonMenu;

    public int players = 0;

    boolean next = false;

    @FXML
    protected void mainMenu() throws IOException {
        Stage stage = (Stage) boutonMenu.getScene().getWindow();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("menu-view.fxml")));
        stage.setScene(scene);
        stage.setFullScreen(true);
    }

    public void nextScene() throws IOException {
        Stage stage = (Stage) startButton.getScene().getWindow();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("wonderselection.fxml")));
        stage.setScene(scene);
        stage.setFullScreen(true);
    }

    @FXML
    protected void choiceBoxClick() {
        comboBox.getItems().clear();
        comboBox.getItems().addAll("1", "2", "3", "4", "5", "6", "7");
    }

    @FXML
    protected void setType1() {
        age1.getItems().clear();
        for (int i = 7; i <= 77; i++) {
            age1.getItems().add(i);
        }
    }

    @FXML
    protected void setType2() {
        age2.getItems().clear();
        for (int i = 7; i <= 77; i++) {
            age2.getItems().add(i);
        }
    }

    @FXML
    protected void setType3() {
        age3.getItems().clear();
        for (int i = 7; i <= 77; i++) {
            age3.getItems().add(i);
        }
    }

    @FXML
    protected void setType4() {
        age4.getItems().clear();
        for (int i = 7; i <= 77; i++) {
            age4.getItems().add(i);
        }
    }

    @FXML
    protected void setType5() {
        age5.getItems().clear();
        for (int i = 7; i <= 77; i++) {
            age5.getItems().add(i);
        }
    }

    @FXML
    protected void setType6() {
        age6.getItems().clear();
        for (int i = 7; i <= 77; i++) {
            age6.getItems().add(i);
        }
    }

    @FXML
    protected void setType7() {
        age7.getItems().clear();
        for (int i = 7; i <= 77; i++) {
            age7.getItems().add(i);
        }
    }

    public void startButtonClicked() throws IOException {
        nextScene();
    }
    @FXML
    protected void choiceBoxChoosed() {
        players = comboBox.getSelectionModel().getSelectedIndex();

        switch (players) {

            case 0:
                age1.setVisible(true);
                age2.setVisible(false);
                age3.setVisible(false);
                age4.setVisible(false);
                age5.setVisible(false);
                age6.setVisible(false);
                age7.setVisible(false);

                name1.setVisible(true);
                name2.setVisible(false);
                name3.setVisible(false);
                name4.setVisible(false);
                name5.setVisible(false);
                name6.setVisible(false);
                name7.setVisible(false);

                startButton.setVisible(true);

                break;
            case 1:
                age1.setVisible(true);
                age2.setVisible(true);
                age3.setVisible(false);
                age4.setVisible(false);
                age5.setVisible(false);
                age6.setVisible(false);
                age7.setVisible(false);

                name1.setVisible(true);
                name2.setVisible(true);
                name3.setVisible(false);
                name4.setVisible(false);
                name5.setVisible(false);
                name6.setVisible(false);
                name7.setVisible(false);

                startButton.setVisible(true);

                break;
            case 2:
                age1.setVisible(true);
                age2.setVisible(true);
                age3.setVisible(true);
                age4.setVisible(false);
                age5.setVisible(false);
                age6.setVisible(false);
                age7.setVisible(false);

                name1.setVisible(true);
                name2.setVisible(true);
                name3.setVisible(true);
                name4.setVisible(false);
                name5.setVisible(false);
                name6.setVisible(false);
                name7.setVisible(false);

                startButton.setVisible(true);

                break;
            case 3:
                age1.setVisible(true);
                age2.setVisible(true);
                age3.setVisible(true);
                age4.setVisible(true);
                age5.setVisible(false);
                age6.setVisible(false);
                age7.setVisible(false);

                name1.setVisible(true);
                name2.setVisible(true);
                name3.setVisible(true);
                name4.setVisible(true);
                name5.setVisible(false);
                name6.setVisible(false);
                name7.setVisible(false);

                startButton.setVisible(true);

                break;
            case 4:
                age1.setVisible(true);
                age2.setVisible(true);
                age3.setVisible(true);
                age4.setVisible(true);
                age5.setVisible(true);
                age6.setVisible(false);
                age7.setVisible(false);

                name1.setVisible(true);
                name2.setVisible(true);
                name3.setVisible(true);
                name4.setVisible(true);
                name5.setVisible(true);
                name6.setVisible(false);
                name7.setVisible(false);

                startButton.setVisible(true);

                break;

            case 5:
                age1.setVisible(true);
                age2.setVisible(true);
                age3.setVisible(true);
                age4.setVisible(true);
                age5.setVisible(true);
                age6.setVisible(true);
                age7.setVisible(false);

                name1.setVisible(true);
                name2.setVisible(true);
                name3.setVisible(true);
                name4.setVisible(true);
                name5.setVisible(true);
                name6.setVisible(true);
                name7.setVisible(false);

            case 6:
                age1.setVisible(true);
                age2.setVisible(true);
                age3.setVisible(true);
                age4.setVisible(true);
                age5.setVisible(true);
                age6.setVisible(true);
                age7.setVisible(true);

                name1.setVisible(true);
                name2.setVisible(true);
                name3.setVisible(true);
                name4.setVisible(true);
                name5.setVisible(true);
                name6.setVisible(true);
                name7.setVisible(true);

                startButton.setVisible(true);

                break;
        }
    }
}
