package com.example.sevenwonders;

public class ProgressToken {
    private String name;
    private int victoryPoints;

    public ProgressToken(String name, int victoryPoints) {
        this.name = name;
        this.victoryPoints = victoryPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVictoryPoints() {
        return victoryPoints;
    }

    public void setVictoryPoints(int victoryPoints) {
        this.victoryPoints = victoryPoints;
    }
}
