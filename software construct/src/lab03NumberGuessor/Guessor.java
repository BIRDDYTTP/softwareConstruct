package lab03NumberGuessor;

/**
 * Created by 708 on 9/12/2018.
 */
public class Guessor {
    private int target;
    public Guessor(int target) {
        this.target = target;
    }

    public String guessing(int guess){
        String result;
        if (this.target == guess){
            result = "correct";
            return result;
        }
        else if (this.target < guess){
            result = "too high";
            return result;
        }
        else {
            result = "too low";
            return result;
        }
    }
}
