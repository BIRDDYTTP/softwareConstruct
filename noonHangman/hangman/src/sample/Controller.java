
package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    @FXML private Button setTargetButton;
    @FXML private Label showWordLabel;
    @FXML private Button checkWordButton;
    @FXML private TextField enterAlphabetText;
    @FXML private TextField enterTargetText;
    @FXML private ImageView showHangman;
    private HangManCode hangManCode;
    @FXML public void initialize() {
        showWordLabel.setStyle("-fx-font-size: 42px");
        showWordLabel.setText("");
    }

    @FXML
    public void handleSetTargetButtonOnClick (ActionEvent actionEvent){
        String sentence = enterTargetText.getText();
        hangManCode = new HangManCode(sentence);
        showWordLabel.setText(hangManCode.getResult());
        enterTargetText.setText("");
        showHangman.setImage(new Image("pic/" + hangManCode.getLife() + ".png"));



    }
    @FXML public void handleCheckWordButtonOnClick (ActionEvent actionEvent) {
        String guess = enterAlphabetText.getText() ;
        try {
            hangManCode.check(guess.charAt(0)) ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        showWordLabel.setText(hangManCode.getResult());
        enterAlphabetText.setText("");
        showHangman.setImage(new Image("pic/" + hangManCode.getLife() + ".png"));




    }
}