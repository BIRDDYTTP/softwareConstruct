package GuessingGame;

public class Hangman implements GuessingGame {
    private String target;
    private String guess;
    private int die;
    private String lastword;
    private String correctChar;

    @Override
    public void guess(String s) {
        this.guess = s.toLowerCase();
        int cnt = 0;
        if (guess.length() == 1){
            for (char c : target.toCharArray()) {
                if (guess.toCharArray()[0] == c){
                    cnt++;
                }
            }
            if (cnt == 0){
                this.die++;
                correctChar ="";
            }
            else{
                correctChar += guess.toCharArray()[0];
            }
        }
    }

    @Override
    public void setAnswer(String ans) {
        this.target = ans.toLowerCase();
        this.die = 0;
        this.lastword = "";
    }

    @Override
    public boolean isLost() {
        if (die > 5){
            return true;
        }
        return false;
    }

    @Override
    public boolean isWon() {
        if (lastword.equals(target)){
            return true;
        }
        return false;
    }

    @Override
    public String getOutput() {
        if (this.guess.length() != 1){
            return "One charactor only";
        }
        String output = "";
        this.lastword = "";
        for (int i = 0; i < target.toCharArray().length; i++) {
            int cnt = 0;
            for (char c : correctChar.toCharArray()) {
                if (target.toCharArray()[i] == c){
                    cnt++;
                }
            }
            if (cnt == 0){
                output += "_ ";
                lastword += "_";
            }
            else{
                output += target.toCharArray()[i]+" ";
                lastword += target.toCharArray()[i];
            }
        }
        return output;
    }
}
