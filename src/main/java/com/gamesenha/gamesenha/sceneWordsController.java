package com.gamesenha.gamesenha;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class sceneWordsController {

    @FXML
    private TextField word1;
    @FXML
    private TextField word2;
    @FXML
    private TextField word3;
    @FXML
    private TextField word4;
    @FXML
    private TextField word5;
    @FXML
    private TextField word6;
    @FXML
    private TextField word7;
    @FXML
    private TextField word8;
    @FXML
    private TextField word9;
    @FXML
    private TextField word10;
    @FXML
    private Button btnClick;

    @FXML
    protected void clicouBotao(ActionEvent event){

        System.out.println("x");
        GameApplication.changeScreen("rodada");
        Palavras palavras = new Palavras();
        palavras.setPalavra1(word1.getText());
        PalavraTeste.palavrao1 = word1.getText();
        System.out.println(PalavraTeste.palavrao1);
    }




}
