package com.gamesenha.gamesenha;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import com.gamesenha.gamesenha.Palavras;
import com.gamesenha.gamesenha.sceneWordsController;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import com.gamesenha.gamesenha.PalavraTeste;
public class sceneRoundsController {

    @FXML
    private Label lblPalavra;
    @FXML
    private Button btnClick;
    @FXML
    protected void clicouBotao(ActionEvent event){


        lblPalavra.setText(PalavraTeste.palavrao1);

        GameApplication.changeScreen("rodada");


    }
}
