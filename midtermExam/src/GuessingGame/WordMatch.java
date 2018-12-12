package GuessingGame;

public class WordMatch implements GuessingGame{
    private String target;
    private String guess;
    private int count;

    @Override
    public void setAnswer(String ans) {
        target = ans.toLowerCase();
    }

    @Override
    public void guess(String s) {
        this.guess = s.toLowerCase();
    }

    @Override
    public String getOutput() {
        if (guess.length() != target.length()){
            return "Length not match";
        }
        else{
            this.count = 0;
            for (int i = 0; i < target.length(); i++) {
                if (target.toCharArray()[i] == guess.toCharArray()[i]){
                    count++;
                }
            }
            if (this.count == this.target.length()){
                return "";
            }
            return "Match " + count;
        }
    }

    @Override
    public boolean isLost() {
        return false;
    }

    @Override
    public boolean isWon() {
        if (this.count == this.target.length()){
            return true;
        }
        return false;

    }
}
