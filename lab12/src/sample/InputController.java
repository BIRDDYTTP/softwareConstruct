package sample;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class InputController implements Subject{
    @FXML
    TextField inputText;
    @FXML
    ChoiceBox unitSelector;
    @FXML
    Button submitBtn;
    private List<Observer> observers ;

    public void initialize(){
        observers = new ArrayList<Observer>();
        createThaiStage();
        createEnglishStage();
        createMetricStage();
        unitSelector.getItems().addAll("kg", "lb", "tamlung");
        unitSelector.setValue("kg");
        submitBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                notifyObservers();
            }
        });

    }

    public void createEnglishStage(){
        Stage engStage = new Stage();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("englishSystem.fxml"));
            engStage.setTitle("EnglishSystem");
            engStage.setScene(new Scene(loader.load(), 300, 275));
            engStage.setX(0);
            engStage.setY(0);
            engStage.show();
            registerObserver(loader.getController());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void createMetricStage(){
        Stage metricStage = new Stage();

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("metricSystem.fxml"));
            metricStage.setTitle("MetricSystem");
            metricStage.setScene(new Scene(loader.load(), 300, 275));
            metricStage.setX(0);
            metricStage.setY(310);
            metricStage.show();
            registerObserver(loader.getController());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void createThaiStage(){
        Stage thaistage = new Stage();

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("thaiSystem.fxml"));
            thaistage.setTitle("ThaiSystem");
            thaistage.setScene(new Scene(loader.load(),300,275));
            thaistage.setX(400);
            thaistage.setY(0);
            thaistage.show();
            registerObserver(loader.getController());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(String.valueOf(unitSelector.getValue()), Double.parseDouble(inputText.getText()));
        }
    }
}
