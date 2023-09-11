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

        String listaCampos[] = new String[10];



            listaCampos[0] = word1.getText()
            listaCampos[1] = word2.getText();
            listaCampos[2] = word3.getText();
            listaCampos[3] = word4.getText();
            listaCampos[4] = word5.getText();
            listaCampos[5] = word6.getText();
            listaCampos[6] = word7.getText();
            listaCampos[7] = word8.getText();
            listaCampos[8] = word9.getText();
            listaCampos[9] = word10.getText();

            System.out.println("x");
            GameApplication.changeScreen("rodada");
            Palavras palavras = new Palavras();
            palavras.setPalavra1(word1.getText());
            PalavraTeste.palavrao1 = word1.getText();
            PalavraTeste.palavrao2 = word2.getText();
            PalavraTeste.palavrao3 = word3.getText();
            PalavraTeste.palavrao4 = word4.getText();
            PalavraTeste.palavrao5 = word5.getText();
            PalavraTeste.palavrao6 = word6.getText();
            PalavraTeste.palavrao7 = word7.getText();
            PalavraTeste.palavrao8 = word8.getText();
            PalavraTeste.palavrao9 = word9.getText();
            PalavraTeste.palavrao10 = word10.getText();
            System.out.println(PalavraTeste.palavrao1);

    }




}
