package lab04masterMind;


public class MasterMind {
    private String target;
    private int correctIndex;
    private int correctNumber;

    public MasterMind(String target) {
        this.target = target;
        correctIndex = 0;
        correctNumber = 0;
    }
    public String guess(String guess){
        String output;
        for (int i = 0; i < target.toCharArray().length; i++) {
            for (int i1 = 0; i1 < guess.toCharArray().length; i1++) {
                if (i == i1){
                    if (target.toCharArray()[i] == guess.toCharArray()[i]){
                        correctIndex++;
                        correctNumber++;
                    }
                }
                else{
                    if (target.toCharArray()[i] == guess.toCharArray()[i1]){
                        correctNumber++;
                    }
                }
            }
        }
        if (correctIndex == 4 && correctNumber == 4){
            output = "Congratulations, you just mastered my mind!!";
            return output;
        }
        else{
            output = correctNumber+ " " + correctIndex;
            return output;
        }
    }
}
