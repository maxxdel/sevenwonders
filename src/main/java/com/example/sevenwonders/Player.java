package com.example.sevenwonders;

import javafx.scene.control.ComboBox;

import java.util.ArrayList;
import java.util.List;

public class Player {

    public String name;
    public int age;
    public String wonder;
    private int score;
    private int shieldCount;
    private int militaryVictoryPoints;
    private List<ProgressToken> progressTokens;

    public Player() {
        this.score = 0;
        this.shieldCount = 0;
        this.militaryVictoryPoints = 0;
        progressTokens = new ArrayList<>();
    }


    public void setup(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Player " + this + " is named "+ this.name + " and is " + this.age + " years old");
    }

    public void setWonder(String wonder){
        this.wonder = wonder;
    }
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public void getWonderStagesBuilt() {
    }
}