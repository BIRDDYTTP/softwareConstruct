package lab05Hangman;

public class Hangman {
    private String target;
    private int life;
    private String correctChar;
    private String output;

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

    public String getOutput() {
        return output;
    }

    public String getTarget() {
        return target;
    }

    public void outputting(){
        this.output = "";
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

        if (output.equals(target) == true){
            System.out.println(life + " " + output+"\n"+"Congratulations, you win");
        }
        else if (life != 0 && output.equals(target) == false){
            System.out.println(life + " " + output);
        }
        else if (life == 0){

            System.out.println(life + " " + output+"\n"+"You lose, the answer is " + target);
        }


    }

    public int getLife() {
        return life;
    }

}
