package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {


    @FXML TextArea output;
    @FXML Button clickBtn;
    @FXML TextField inputTarget;
    @FXML Label status;
    @FXML TextField inputGuess;
    private Hangman hangman;
    @FXML
    public void handleClickOnAction(ActionEvent action){
        String temp = inputTarget.getText();
        hangman = new Hangman(temp);

        output.setText("+-------+   \n"+
                "|           \n"+
                "|           \n"+
                "|           \n"+
                "|__________ \n"+ hangman.correctWord());
        inputTarget.setText("");
        status.setText("Playing");
    }

    @FXML void handleClickGuessOnAction (ActionEvent action){
        String guess;
        guess = inputGuess.getText();
        output.setText(hangman.guessing(guess)+hangman.correctWord());
        inputGuess.setText("");
        if (hangman.getLife() == 0){
            status.setText("You Die!");
        }
        if (hangman.isWin() == 1){
            status.setText("You Win!\nCongratulation");
            hangman.setHindenWord("");
        }

    }




}
