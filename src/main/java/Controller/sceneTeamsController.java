package Controller;

import Model.Match;
import Model.Players;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class sceneTeamsController {


   @FXML
   private TextField txtNomeRed1;
   @FXML
   private TextField txtNomeRed2;
   @FXML
   private TextField txtNomeBlue1;
   @FXML
   private TextField txtNomeBlue2;

   @FXML
   protected void clicouBotao(ActionEvent event){



       String nomeRed1 = txtNomeRed1.getText();
       String nomeRed2 = txtNomeRed2.getText();
       String nomeBlue1 = txtNomeBlue1.getText();
       String nomeBlue2 = txtNomeBlue2.getText();

       Players playersRed = new Players(nomeRed1, nomeRed2);
       Players playersBlue = new Players(nomeBlue1, nomeBlue2);

       Match match = new Match(playersRed,playersBlue);
       System.out.println(playersRed);
       System.out.println(playersBlue);

       GameApplication.changeScreen("turno");

   }

}
