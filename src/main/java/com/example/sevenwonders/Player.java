package com.example.sevenwonders;

import javafx.scene.control.ComboBox;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int age;
    private Wonder wonder;
    private int score;
    private int shieldCount;
    private int militaryVictoryPoints;
    private List<ProgressToken> progressTokens;

    public Player(String name, ComboBox age) {
        this.name = String.valueOf(name);
        this.age = age.getVisibleRowCount();
        this.wonder = wonder;
        this.score = 0;
        this.shieldCount = 0;
        this.militaryVictoryPoints = 0;
        progressTokens = new ArrayList<>();

        System.out.println("Player " + this + " is named "+ this.name + " and is " + this.age + " years old");
    }

    public void getName() {
        System.out.println(this.name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Wonder getWonder() {
        return wonder;
    }

    public void setWonder(Wonder wonder) {
        this.wonder = wonder;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getShieldCount() {
        return shieldCount;
    }

    public void setShieldCount(int shieldCount) {
        this.shieldCount = shieldCount;
    }

    public int getMilitaryVictoryPoints() {
        return militaryVictoryPoints;
    }public void setMilitaryVictoryPoints(int militaryVictoryPoints) {
        this.militaryVictoryPoints = militaryVictoryPoints;
    }

    public List<ProgressToken> getProgressTokens() {
        return progressTokens;
    }

    public void setProgressTokens(List<ProgressToken> progressTokens) {
        this.progressTokens = progressTokens;
    }

    public void addProgressToken(ProgressToken progressToken) {
        this.progressTokens.add(progressToken);
    }

}