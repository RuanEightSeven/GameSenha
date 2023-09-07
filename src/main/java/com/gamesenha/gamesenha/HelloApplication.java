package com.gamesenha.gamesenha;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private static Stage stage;

    private static Scene inicioScene;
    private static Scene duplasScene;

    @Override
    public void start(Stage primaryStage) throws IOException {

        stage = primaryStage;


        stage.setTitle("inicio");

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Inicio.fxml"));

        Parent iniciofxml = fxmlLoader.load(getClass().getResource("Inicio.fxml"));
        inicioScene = new Scene(iniciofxml);

        FXMLLoader fxmlduplas = new FXMLLoader(HelloApplication.class.getResource("TelaDuplas.fxml"));
        Parent duplasfxml = fxmlduplas.load(getClass().getResource("TelaDuplas.fxml"));
        duplasScene = new Scene(duplasfxml);


        stage.setScene(inicioScene);
        stage.show();
    }

    public static void changeScreen(String scr){

        switch (scr){
            case "inicio":
                stage.setScene(inicioScene);
                stage.setTitle("inicio");
                break;
            case "duplas":
                stage.setScene(duplasScene);
                stage.setTitle("duplas");
        }

    }

    public static void main(String[] args) {
        launch();
    }
}