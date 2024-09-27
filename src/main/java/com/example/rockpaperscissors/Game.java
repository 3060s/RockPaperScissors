package com.example.rockpaperscissors;

public class Game {

    private int playerScore = 0;
    private int allScore = 0;

    private HelloController controller;
    public enum Move { ROCK, PAPER, SCISSORS }


    public String play(Move playerMove, Move computerMove) {
        allScore++;
        if (playerMove == computerMove) {
            return "Draw!";
        } else if ((playerMove == Move.ROCK && computerMove == Move.SCISSORS) ||
                (playerMove == Move.PAPER && computerMove == Move.ROCK) ||
                (playerMove == Move.SCISSORS && computerMove == Move.PAPER)) {
            playerScore++;
            return "You win!";
        } else {
            return "You lose!";
        }
    }

    public Move getComputerMove() {
        Move[] moves = Move.values();
        return moves[(int)(Math.random() * moves.length)];
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getAllScore() {
        return allScore;
    }

    public boolean ShowLabel() {
        return true;
    }

    public boolean HideLabel() {
        return false;
    }
}
