package com.gamesenha.gamesenha;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class InicioController {

    @FXML
    private Button btnClick;

    @FXML
    protected void clicouBotao(ActionEvent event){

        GameApplication.changeScreen("duplas");
        System.out.println("de fato");

    }

}
