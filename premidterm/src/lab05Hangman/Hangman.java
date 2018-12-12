package lab05Hangman;

/**
 * Created by 708 on 9/12/2018.
 */
public class Hangman {
    private String target;
    private int life;
    private String correctChar;
    private String lastword;

    public Hangman(String target) {
        this.target = target;
        this.life = 6;
        this.correctChar = "";
    }
    public void guess(String guess){
        int cnt = 0;
        for (char c : target.toCharArray()) {
            if (guess.toCharArray()[0] == c){
                cnt++;
            }
        }
        if (cnt == 0){
            this.life--;
        }
        else{
            correctChar += guess.toCharArray()[0];
        }
    }

    public String getTarget() {
        return target;
    }

    public String getLastword() {
        return lastword;
    }

    public String outputting(){
        String output = "";
        for (int i = 0; i < target.toCharArray().length; i++) {
            int cnt = 0;
            for (char c : correctChar.toCharArray()) {
                if (target.toCharArray()[i] == c){
                    cnt++;
                }
            }
            if (cnt == 0){
                output += "-";
            }
            else{
                output += target.toCharArray()[i];
            }
        }
        lastword = output;

        if (output == target){
            output = "Congratulations, you win";
        }
        else if (life != 0 && output != target){
            output = life + " " + output;
        }
        else if (life == 0){
            output = "You lose, the answer is " + target;
        }
        return output;

    }

    public int getLife() {
        return life;
    }
}
