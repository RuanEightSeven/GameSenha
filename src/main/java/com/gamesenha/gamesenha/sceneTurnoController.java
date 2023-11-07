package com.gamesenha.gamesenha;

import javafx.fxml.FXML;
import javafx.scene.layout.Region;

public class sceneTurnoController {

    @FXML
    private Region areaVermelho;
    @FXML
    private Region areaAzul;

    @FXML
    private void clicouAreaVermelho(){

        System.out.println("Escolheu vermelho");
        GameApplication.changeScreen("words");

    }

    @FXML
    private void clicouAreaAzul(){

        System.out.println("Escolheu azul");
        GameApplication.changeScreen("words");
    }


    @FXML
    private void entrouAreaVermelho(){

    }

    @FXML
    private void entrouAreaAzul(){

    }
}
