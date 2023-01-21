package com.example.sevenwonders;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
//controler
public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("menu-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Seven Wonders");
        stage.setScene(scene);
        stage.setMaxHeight(880);
        stage.setMaxWidth(775);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}