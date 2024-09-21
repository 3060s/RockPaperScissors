package com.example.rockpaperscissors;

public class Game {

    private HelloController controller;
    public enum Move { ROCK, PAPER, SCISSORS }


    public String play(Move playerMove, Move computerMove) {
        if (playerMove == computerMove) {
            return "Draw!";
        } else if ((playerMove == Move.ROCK && computerMove == Move.SCISSORS) ||
                (playerMove == Move.PAPER && computerMove == Move.ROCK) ||
                (playerMove == Move.SCISSORS && computerMove == Move.PAPER)) {
            return "You win!";
        } else {
            return "You lose!"; //do zrobienia te returny
        }
    }

    public Move getComputerMove() {
        Move[] moves = Move.values();
        return moves[(int)(Math.random() * moves.length)];
    }

    public boolean ShowLabel() {
        return true;
    }

    public boolean HideLabel() {
        return false;
    }
}
