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
    int x = 0;
    String palavra;
    @FXML
    protected void clicouBotao(ActionEvent event){
        x = x + 1;



        if(x==1) {
            palavra = PalavraTeste.listaPalavras[0];

            System.out.println("Palavra 1:" + palavra);

            lblPalavra.setText(palavra);

        } else if (x==2) {
            palavra = PalavraTeste.listaPalavras[1];

            System.out.println("Palavra 2:" + palavra);

            lblPalavra.setText(palavra);
        } else if (x==3) {
            palavra = PalavraTeste.listaPalavras[2];

            System.out.println("Palavra 3:" + palavra);

            lblPalavra.setText(palavra);
        }else if (x==4) {
            palavra = PalavraTeste.listaPalavras[3];

            System.out.println("Palavra 4:" + palavra);

            lblPalavra.setText(palavra);
        } else if (x==5) {
            palavra = PalavraTeste.listaPalavras[4];

            System.out.println("Palavra 5:" + palavra);

            lblPalavra.setText(palavra);
        }else if (x==6) {
            palavra = PalavraTeste.listaPalavras[5];

            System.out.println("Palavra 6:" + palavra);

            lblPalavra.setText(palavra);
        } else if (x==7) {
            palavra = PalavraTeste.listaPalavras[6];

            System.out.println("Palavra 7:" + palavra);

            lblPalavra.setText(palavra);
        }else if (x==8) {
            palavra = PalavraTeste.listaPalavras[7];

            System.out.println("Palavra 8:" + palavra);

            lblPalavra.setText(palavra);
        } else if (x==9) {
            palavra = PalavraTeste.listaPalavras[8];

            System.out.println("Palavra 9:" + palavra);

            lblPalavra.setText(palavra);
        }else if (x==10) {
            palavra = PalavraTeste.listaPalavras[9];

            System.out.println("Palavra 10:" + palavra);

            lblPalavra.setText(palavra);
        }


    }
}
