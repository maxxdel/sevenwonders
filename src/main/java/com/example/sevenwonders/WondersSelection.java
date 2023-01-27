package com.example.sevenwonders;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

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

    boolean next = false;

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

    public WondersSelection() throws IOException {
        this.playerConception();
    }

    public void playerConception() throws IOException {

        switch (playable) {

            case 1:
                next = false;
                break;

            case 2:
                player1.setup(super.pseudo1, vieux1);
                player2.setup(pseudo2, vieux2);
                chooseWonder(this.nombre);
                break;
            case 3:
                player1.setup(super.pseudo1, vieux1);
                player2.setup(pseudo2, vieux2);
                player3.setup(pseudo3, vieux3);
                System.out.println("Ça marche");
                chooseWonder(this.nombre);
                break;

            case 4:
                player1.setup(super.pseudo1, vieux1);
                player2.setup(pseudo2, vieux2);
                player3.setup(pseudo3, vieux3);
                player4.setup(pseudo4, vieux4);
                System.out.println("Ça marche");
                chooseWonder(this.nombre);
                break;

            case 5:
                player1.setup(super.pseudo1, vieux1);
                player2.setup(pseudo2, vieux2);
                player3.setup(pseudo3, vieux3);
                player4.setup(pseudo4, vieux4);
                player5.setup(pseudo5, vieux5);
                System.out.println("Ça marche");
                chooseWonder(this.nombre);
                break;

        }
    }

        public void selctionne(){

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


        public void chooseWonder (int nombre) throws IOException {



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
