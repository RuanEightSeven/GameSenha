module com.gamesenha.gamesenha {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.gamesenha.gamesenha to javafx.fxml;
    exports com.gamesenha.gamesenha;
}