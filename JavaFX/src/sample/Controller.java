package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML Label textLabel;
    @FXML Button clickBtn;
    @FXML public void handleClickBtnOnAction(ActionEvent action){
        textLabel.setText("How Dare You!!!");
    }
}
