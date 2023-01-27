package com.example.sevenwonders;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GameView {
    private List<Player> players;
    private int currentPlayerIndex;
    private Wonder[] availableWonders;
    private int cornCount;
    private int cornCountMax;
    private ProgressToken[] availableProgressTokens;
    private ProgressToken[] visibleProgressTokens;

    public GameView(int numberOfPlayers) {
        players = new ArrayList<>();
        availableWonders = Wonder.values();
        cornCount = 0;
        cornCountMax = numberOfPlayers * 3;
        availableProgressTokens = ProgressToken.initialize();
        visibleProgressTokens = new ProgressToken[3];
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void setCurrentPlayerIndex(int currentPlayerIndex) {
        this.currentPlayerIndex = currentPlayerIndex;
    }

    public Player getCurrentPlayer() {
        return players.get(currentPlayerIndex);
    }

    public void nextPlayer() {
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
    }

    public void updateCornCount(int amount) {
        cornCount += amount;
    }

    public boolean isCornCountMax() {
        return cornCount >= cornCountMax;
    }

    public void updateVisibleProgressTokens() {
        // code to update the visible progress tokens
    }

    public void war(Player player1, Player player2) {
        int shields1 = player1.getShieldCount();
        int shields2 = player2.getShieldCount();
        if (shields1 > shields2) {
            player1.addMilitaryVictoryPoints(1);
        } else if (shields2 > shields1) {
            player2.addMilitaryVictoryPoints(1);
        }
    }

    public void calculateScores() {
        for (Player player : players) {
            int score = player.getWonderPoints() + player.getMilitaryVictoryPoints();
            for (ProgressToken token : player.getProgressTokens()) {
                score += token.getVictoryPoints();
            }
            player.setScore(score);
        }
    }

    public Player getWinner() {
        Player winner = players.get(0);
        for (int i = 1; i < players.size(); i++) {
            Player currentPlayer = players.get(i);
            if (currentPlayer.getScore() > winner.getScore()) {
                winner = currentPlayer;
            } else if (currentPlayer.getScore() == winner.getScore() && currentPlayer.getWonderStagesBuilt() > winner.getWonderStagesBuilt()) {
                winner = currentPlayer;
            }
        }
        return winner;
    }
}

