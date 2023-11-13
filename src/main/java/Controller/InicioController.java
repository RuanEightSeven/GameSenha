package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class InicioController {

    @FXML
    private Button btnClick;


    @FXML
    private Button btnOpcoes;
    @FXML
    private Button btnCreditos;


    @FXML
    protected void clicouBotao(ActionEvent event){

        GameApplication.changeScreen("duplas");
        System.out.println("de fato");

    }

    @FXML
    protected void clicouBotaoOpcoes(ActionEvent event){

        System.out.println("Opcoes");
    }

    @FXML
    protected void clicouBotaoCreditos(ActionEvent event){
        System.out.println("Creditos");
    }



}
