package com.example.rockpaperscissors;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1080, 720);
        stage.setTitle("RockPaperScissors");
        stage.getIcons().add(new Image(HelloApplication.class.getResourceAsStream("/com/example/rockpaperscissors/gameIcon.png")));
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

        String css = this.getClass().getResource("style.css").toExternalForm();
        scene.getStylesheets().add(css);


    }

    public static void main(String[] args) {
        launch();
    }
}