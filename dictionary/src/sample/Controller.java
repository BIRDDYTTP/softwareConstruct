package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class Controller {

    public TextField word;
    public ListView<String> words = new ListView<>();
    public TextArea showInfo;
    public TextField edit;
    public Button pos;
    public Button ex;
    public Button mean;
    public Button nw;
    private Dictionary dictionary = new Dictionary();
    private Vocabulary vocabulary;
    private ObservableList<String> data;
    @FXML public void handleNewWordOnClick(ActionEvent e){
        vocabulary = new Vocabulary(word.getText());
        boolean flag = true;
        for (String s : dictionary.getWordInDic()) {
//            System.out.println(s);
//            System.out.println(word.getText());
            if (s.equals(vocabulary.getWord())){
                flag = false;
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Error");
                alert.setHeaderText("Can't add same word");
                alert.setContentText("Please add new word");

                alert.showAndWait();
            }
        }
        if (flag){
            dictionary.addWord(vocabulary);
//            System.out.println(dictionary.getWordInDic());
        }
        data = FXCollections.observableArrayList(dictionary.getWordInDic());
        words.setItems(data);
        word.setText("");

    }

    @FXML public void handleClickOnListview(MouseEvent event){
        String word = words.getSelectionModel().getSelectedItem();
//        System.out.println(word);
        if (word==null || word.isEmpty() || word.equals("")){
            showInfo.setText("Nothing Selected");
        }
        else{
            showInfo.setText(dictionary.wordDefine(word));
//            System.out.println(dictionary.wordDefine(word));
        }

    }

    @FXML public void handleClickOnMeaning(ActionEvent event){
        String w = this.word.getText();
        String mean = edit.getText();
        boolean flag = true;
        for (Vocabulary vocabulary : dictionary.getArrayList()) {
            if (vocabulary.getWord().equals(w)){
                vocabulary.setMeaning(mean);
                flag = false;
            }
        }
        if (flag){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText("don't have this word in this dictionary");
            alert.setContentText("Please add new word and set again");

            alert.showAndWait();
        }
        this.word.setText("");
        this.edit.setText("");
    }

    @FXML public void handleClickOnExample (ActionEvent event){
        String w = word.getText();
        String ex = edit.getText();
        boolean flag = true;
        for (Vocabulary vocabulary : dictionary.getArrayList()) {
            if (vocabulary.getWord().equals(w)){
                vocabulary.setExample(ex);
                flag = false;
            }
        }
        if (flag){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText("don't have this word in this dictionary");
            alert.setContentText("Please add new word and set again");

            alert.showAndWait();
        }
        this.word.setText("");
        this.edit.setText("");

    }
    @FXML public void handleClickOnPos(ActionEvent event){
        String w = word.getText();
        String pos = edit.getText();
        boolean flag = true;
        for (Vocabulary vocabulary : dictionary.getArrayList()) {
            if (vocabulary.getWord().equals(w)){
                vocabulary.setPartOfSpeech(pos);
                flag = false;
            }
        }
        if (flag){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText("don't have this word in this dictionary");
            alert.setContentText("Please add new word and set again");

            alert.showAndWait();
        }
        this.word.setText("");
        this.edit.setText("");
    }

//    public String format(MyFormatter format){
//
//    }
}
