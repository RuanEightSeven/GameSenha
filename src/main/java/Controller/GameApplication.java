package Controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GameApplication extends Application {

    private static Stage stage;

    private static Scene inicioScene;
    private static Scene duplasScene;
    private static Scene wordsScene;
    private static Scene rodadaScene;

    private static Scene turnoScene;

    @Override
    public void start(Stage primaryStage) throws IOException {

        stage = primaryStage;


        stage.setTitle("inicio");

        FXMLLoader fxmlLoader = new FXMLLoader(GameApplication.class.getResource("Inicio.fxml"));

        Parent iniciofxml = fxmlLoader.load(getClass().getResource("Inicio.fxml"));
        inicioScene = new Scene(iniciofxml);

        FXMLLoader fxmlduplas = new FXMLLoader(GameApplication.class.getResource("telaTeams.fxml"));
        Parent duplasfxml = fxmlduplas.load(getClass().getResource("telaTeams.fxml"));
        duplasScene = new Scene(duplasfxml);

        FXMLLoader fxmlwords = new FXMLLoader(GameApplication.class.getResource("telaPalavra.fxml"));
        Parent wordsfxml = fxmlwords.load(getClass().getResource("telaPalavra.fxml"));
        wordsScene = new Scene(wordsfxml);

        FXMLLoader fxmlrodada = new FXMLLoader(GameApplication.class.getResource("telaRodada.fxml"));
        Parent rodadafxml = fxmlrodada.load(getClass().getResource("telaRodada.fxml"));
        rodadaScene = new Scene(rodadafxml);


        FXMLLoader fxmlturno = new FXMLLoader(GameApplication.class.getResource("telaTurno.fxml"));
        Parent turnofxml = fxmlturno.load(getClass().getResource("telaTurno.fxml"));
        turnoScene = new Scene(turnofxml);

        stage.setScene(inicioScene);
        stage.show();
    }

    public static void changeScreen(String scr) {

        switch (scr) {
            case "inicio":
                stage.setScene(inicioScene);
                stage.setTitle("inicio");
                break;
            case "duplas":
                stage.setScene(duplasScene);
                stage.setTitle("duplas");
                break;
            case "words":
                stage.setScene(wordsScene);
                stage.setTitle("Inserir palavras");
                break;
            case "rodada":
                stage.setScene(rodadaScene);
                stage.setTitle("Rodada");
                break;
            case "turno":
                stage.setScene(turnoScene);
                stage.setTitle("Turno");

        }

    }

    public static void main(String[] args) {
        launch();
    }
}