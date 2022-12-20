package com.example.sevenwonders;

import java.io.IOException;
import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SelectionView {

    @FXML
    private Button startButton;

    @FXML
    private ComboBox age1;

    @FXML
    private ComboBox age2;

    @FXML
    private ComboBox age3;

    @FXML
    private ComboBox age4;

    @FXML
    private ComboBox age5;

    @FXML
    private TextField name1;

    @FXML
    private TextField name2;

    @FXML
    private TextField name3;

    @FXML
    private TextField name4;

    @FXML
    private TextField name5;

    @FXML
    private ComboBox comboBox;

    int players = 0;

    public SelectionView() throws IOException {
    }

    public void create(String playerName, int playerAge, int playerNumber) throws IOException{
        Player joueur = new Player(playerName, playerAge, playerNumber);
    }

    public void nextScene() throws IOException {
        Stage stage = (Stage) startButton.getScene().getWindow();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("game-view.fxml")));
        stage.setScene(scene);
        stage.setFullScreen(true);
    }

    @FXML
    protected void choiceBoxClick(){
        comboBox.getItems().clear();
        comboBox.getItems().addAll("1", "2", "3", "4", "5");

    }

    @FXML
    protected void setType1(){
        age1.getItems().clear();
        for (int i = 7; i <= 77; i++) {
            age1.getItems().add(i);
        }
    }

    @FXML
    protected void setType2(){
        age2.getItems().clear();
        for (int i = 7; i <= 77; i++) {
            age2.getItems().add(i);
        }
    }

    @FXML
    protected void setType3(){
        age3.getItems().clear();
        for (int i = 7; i <= 77; i++) {
            age3.getItems().add(i);
        }
    }

    @FXML
    protected void setType4(){
        age4.getItems().clear();
        for (int i = 7; i <= 77; i++) {
            age4.getItems().add(i);
        }
    }

    @FXML
    protected void setType5(){
        age5.getItems().clear();
        for (int i = 7; i <= 77; i++) {
            age5.getItems().add(i);
        }
    }

    @FXML
    protected void choiceBoxChoosed(){
        players = comboBox.getSelectionModel().getSelectedIndex();

        switch (players){

            case 0:
                age1.setVisible(true);
                age2.setVisible(false);
                age3.setVisible(false);
                age4.setVisible(false);
                age5.setVisible(false);

                name1.setVisible(true);
                name2.setVisible(false);
                name3.setVisible(false);
                name4.setVisible(false);
                name5.setVisible(false);

                startButton.setVisible(true);

                break;
            case 1:
                age1.setVisible(true);
                age2.setVisible(true);
                age3.setVisible(false);
                age4.setVisible(false);
                age5.setVisible(false);

                name1.setVisible(true);
                name2.setVisible(true);
                name3.setVisible(false);
                name4.setVisible(false);
                name5.setVisible(false);

                startButton.setVisible(true);

                break;
            case 2:
                age1.setVisible(true);
                age2.setVisible(true);
                age3.setVisible(true);
                age4.setVisible(false);
                age5.setVisible(false);

                name1.setVisible(true);
                name2.setVisible(true);
                name3.setVisible(true);
                name4.setVisible(false);
                name5.setVisible(false);

                startButton.setVisible(true);

                break;
            case 3:
                age1.setVisible(true);
                age2.setVisible(true);
                age3.setVisible(true);
                age4.setVisible(true);
                age5.setVisible(false);

                name1.setVisible(true);
                name2.setVisible(true);
                name3.setVisible(true);
                name4.setVisible(true);
                name5.setVisible(false);

                startButton.setVisible(true);

                break;
            case 4:
                age1.setVisible(true);
                age2.setVisible(true);
                age3.setVisible(true);
                age4.setVisible(true);
                age5.setVisible(true);

                name1.setVisible(true);
                name2.setVisible(true);
                name3.setVisible(true);
                name4.setVisible(true);
                name5.setVisible(true);

                startButton.setVisible(true);

                break;
        }
    }

    @FXML
    protected void startButtonClicked() throws Exception {

        int i = 1;

        players = comboBox.getSelectionModel().getSelectedIndex();

        if (players == 0) {
            System.out.println("You must have a friend to play this game!");
        }

        else if (players == 1) {
            int playerAge = (int) age1.getValue();
            String playerName = name1.getText();
            int playerNumber = i;
            create(playerName, playerAge, playerNumber);
            i++;

            playerAge = (int) age2.getValue();
            playerName = name2.getText();
            playerNumber = i;
            create(playerName, playerAge, playerNumber);

            nextScene();
        }

        else if (players == 2) {
            int playerAge = (int) age1.getValue();
            String playerName = name1.getText();
            int playerNumber = i;
            create(playerName, playerAge, playerNumber);
            i++;

            playerAge = (int) age2.getValue();
            playerName = name2.getText();
            playerNumber = i;
            create(playerName, playerAge, playerNumber);
            i++;

            playerAge = (int) age3.getValue();
            playerName = name3.getText();
            playerNumber = i;
            create(playerName, playerAge, playerNumber);

            nextScene();
        }

        else if (players == 3) {
            int playerAge = (int) age1.getValue();
            String playerName = name1.getText();
            int playerNumber = i;
            create(playerName, playerAge, playerNumber);
            i++;

            playerAge = (int) age2.getValue();
            playerName = name2.getText();
            playerNumber = i;
            create(playerName, playerAge, playerNumber);
            i++;

            playerAge = (int) age3.getValue();
            playerName = name3.getText();
            playerNumber = i;
            create(playerName, playerAge, playerNumber);
            i++;

            playerAge = (int) age4.getValue();
            playerName = name4.getText();
            playerNumber = i;
            create(playerName, playerAge, playerNumber);

            nextScene();
        }

        else if (players == 4) {
            int playerAge = (int) age1.getValue();
            String playerName = name1.getText();
            int playerNumber = i;
            create(playerName, playerAge, playerNumber);
            i++;

            playerAge = (int) age2.getValue();
            playerName = name2.getText();
            playerNumber = i;
            create(playerName, playerAge, playerNumber);
            i++;

            playerAge = (int) age3.getValue();
            playerName = name3.getText();
            playerNumber = i;
            create(playerName, playerAge, playerNumber);
            i++;

            playerAge = (int) age4.getValue();
            playerName = name4.getText();
            playerNumber = i;
            create(playerName, playerAge, playerNumber);
            i++;

            playerAge = (int) age5.getValue();
            playerName = name5.getText();
            playerNumber = i;
            create(playerName, playerAge, playerNumber);

            nextScene();
        }

        else {
            System.out.println("Veuillez sélectionner le nombre de héros à créer");
        }
    }
}