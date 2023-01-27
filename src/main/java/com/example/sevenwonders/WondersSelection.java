package com.example.sevenwonders;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class WondersSelection extends SelectionView {

    public Player player1 = new Player();
    public Player player2 = new Player();
    public Player player3 = new Player();
    public Player player4 = new Player();
    public Player player5 = new Player();
    public Player player6 = new Player();
    public Player player7 = new Player();
    int nombre = super.players + 1;

    @FXML
    protected CheckBox Alexandrie;
    @FXML
    protected CheckBox Babylone;
    @FXML
    protected CheckBox Gizeh;
    @FXML
    protected CheckBox Ephese;
    @FXML
    protected CheckBox Halicarnasse;
    @FXML
    protected CheckBox Olympie;
    @FXML
    protected CheckBox Rhodes;
    @FXML
    protected Label indiceJoueur;

    int playable = super.players;

    String wonderChosen;

    public void playerConception() throws IOException {

        if (super.players <= 1) {
            System.out.println("EH REGARDEZ IL A PAS D'AMIS");
            next = false;
        } else if (this.nombre >= 2) {
            player1.setup(super.name1.getText(), (Integer) super.age1.getValue());
            player2.setup(super.name2.getText(), (Integer) super.age2.getValue());
            next = true;

            if (this.nombre >= 3) {
                player3.setup(super.name3.getText(), (Integer) super.age3.getValue());
                next = true;
                System.out.println("Ça marche");

                if (this.nombre >= 4) {
                    player4.setup(super.name4.getText(), (Integer) super.age4.getValue());
                    next = true;

                    if (this.nombre >= 5) {
                        player5.setup(super.name5.getText(), (Integer) super.age5.getValue());
                        next = true;

                        if (this.nombre >= 6) {
                            player6.setup(super.name6.getText(), (Integer) super.age6.getValue());
                            next = true;

                            if (this.nombre >= 7) {
                                player7.setup(super.name7.getText(), (Integer) super.age7.getValue());
                                next = true;
                            }

                        }

                    }

                }

            }

        }

        if (next = true) {
            chooseWonder(this.nombre);
            //super.nextScene();
        }
    }

    public void selctionne() {

        boolean Alexandria = Alexandrie.isSelected();
        boolean Babylona = Babylone.isSelected();
        boolean Giseh = Gizeh.isSelected();
        boolean Halicarnassus = Halicarnasse.isSelected();
        boolean Olympe = Olympie.isSelected();
        boolean Rhode = Rhodes.isSelected();
        boolean Ephesus = Ephese.isSelected();

        if (Alexandria == true) {
            Alexandrie.setSelected(false);
            Alexandrie.setVisible(false);
            wonderChosen = "Alexandrie";
        } else if (Babylona == true) {
            Babylone.setSelected(false);
            Babylone.setVisible(false);
            wonderChosen = "Babylone";
        } else if (Giseh == true) {
            Gizeh.setSelected(false);
            Gizeh.setVisible(false);
            wonderChosen = "Gizeh";
        } else if (Halicarnassus == true) {
            Halicarnasse.setSelected(false);
            Halicarnasse.setVisible(false);
            wonderChosen = "Halicarnasse";
        } else if (Olympe == true) {
            Olympie.setSelected(false);
            Olympie.setVisible(false);
            wonderChosen = "Olympie";
        } else if (Rhode == true) {
            Rhodes.setSelected(false);
            Rhodes.setVisible(false);
            wonderChosen = "Rhodes";
        } else if (Ephesus == true) {
            Ephese.setSelected(false);
            Ephese.setVisible(false);
            wonderChosen = "Ephese";
        }
    }


    public void chooseWonder(int nombre) throws IOException {

        if (this.nombre >= 2) {
            indiceJoueur.setText(player1.getName() + " choose a Wonder");
            selctionne();
            player1.setWonder(wonderChosen);

            indiceJoueur.setText(player2.getName() + " choose a Wonder");
            selctionne();
            player2.setWonder(wonderChosen);

            if (this.nombre >= 3) {
                indiceJoueur.setText(player3.getName() + " choose a Wonder");
                selctionne();
                player3.setWonder(wonderChosen);

                if (this.nombre >= 4) {
                    indiceJoueur.setText(player4.getName() + " choose a Wonder");
                    selctionne();
                    player4.setWonder(wonderChosen);

                    if (this.nombre >= 5) {
                        indiceJoueur.setText(player5.getName() + " choose a Wonder");
                        selctionne();
                        player5.setWonder(wonderChosen);

                        if (this.nombre >= 6) {
                            indiceJoueur.setText(player6.getName() + " choose a Wonder");
                            selctionne();
                            player6.setWonder(wonderChosen);

                            if (this.nombre >= 7) {
                                indiceJoueur.setText(player7.getName() + " choose a Wonder");
                                selctionne();
                                player7.setWonder(wonderChosen);
                            }

                        }

                    }

                }

            }

        }
    }
}
