package com.example.rockpaperscissors;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    @FXML private Label result_label;
    @FXML private Label comp_move;
    @FXML private Label score_label;
    @FXML private Label winrate_label;

    Game game = new Game();


    @FXML
    protected void onPaperButtonClick() {
        handleUserMove(Game.Move.PAPER);
    }

    @FXML
    protected void onRockButtonClick() {
        handleUserMove(Game.Move.ROCK);
    }

    @FXML
    protected void onScissorsButtonClick() {
        handleUserMove(Game.Move.SCISSORS);
    }

    private void handleUserMove(Game.Move playerMove) {
        Game.Move computerMove = game.getComputerMove();
        String result = game.play(playerMove, computerMove);
        comp_move.setText(computerMove.toString());
        result_label.setText(result);
        ResultLabelVisible();

        int playerScore = game.getPlayerScore();
        score_label.setText(String.valueOf(playerScore));

        int allScore = game.getAllScore();

        float winrate = (float) playerScore / allScore * 100;
        winrate_label.setText(String.format("%.1f%%", winrate));
    }

    @FXML
    protected void ResultLabelVisible() {
        result_label.setVisible(true);
    }
}