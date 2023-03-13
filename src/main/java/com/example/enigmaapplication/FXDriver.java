package com.example.enigmaapplication;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FXDriver extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // call the main scene which is a BorderPane
        FXMainPane root = new FXMainPane();
        stage.setScene(new Scene(root, 600, 350));
        // Set stage title and show the stage.
        stage.setTitle("Cybersecurity Encryption and Decryption");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}