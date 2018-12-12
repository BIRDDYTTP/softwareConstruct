package lab02Stamp;

/**
 * Created by 708 on 9/12/2018.
 */
public class Stamp {
    private double cost;
    private int stamp;

    public Stamp(double cost){
        this.cost = cost;
        this.stamp = 0;
    }

    public double calculateStamp(){
        double check;
        check = (cost-(cost%50))/50;
        return check;
    }
}
