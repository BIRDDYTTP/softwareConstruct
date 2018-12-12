package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ThaiSystemController implements Observer{

    @FXML Label sl;
    @FXML Label baht;
    @FXML Label tl;
    @FXML Label chung;
    @FXML Label harb;
    private ThaiSystem thaiSystem;
    public void initialize(){
        thaiSystem = new ThaiSystem();
    }


    @Override
    public void update(String unit, double value) {
        if (unit.equals("kg")){
            thaiSystem.setFromMetricSystem(value);
        }
        else if (unit.equals("lb")){
            thaiSystem.setFromEnglishSystem(value);
        }
        else{
            thaiSystem.setFromTl(value);
        }
        sl.setText(""+thaiSystem.getSl());
        baht.setText(""+thaiSystem.toBaht());
        tl.setText(""+thaiSystem.toTl());
        chung.setText(""+thaiSystem.toChung());
        harb.setText(""+thaiSystem.toHarb());
    }
}
