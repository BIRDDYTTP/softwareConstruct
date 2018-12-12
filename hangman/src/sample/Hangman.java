package sample;

public class Hangman {
    private String hindenWord;
    private String guess;
    private int life;
    private int count;
    private String guessWord;

    public Hangman(String hindenWord) {
        this.hindenWord = hindenWord;
        this.life = 6;
        this.count = 0;
        for (char c : hindenWord.toCharArray()) {
            count++;
        }
        this.guessWord = "";
    }

    public int getLife() {
        return life;
    }

    public void setHindenWord(String hindenWord) {
        this.hindenWord = hindenWord;
    }

    public int isWin(){
        String op = "";
        for (char c : hindenWord.toCharArray()) {
            int cnt = 0;
            for (char c1 : guessWord.toCharArray()) {
                if (c1 == c){
                    cnt++;
                }
            }
            if (cnt != 0){
                op+=c;
            }
        }
        if (op.length() != hindenWord.length()){
            return 0;
        }
        else{
            return 1;

        }
    }

    public String correctWord(){
        String op = "";
        for (char c : hindenWord.toCharArray()) {
            int cnt = 0;
            for (char c1 : guessWord.toCharArray()) {
                if (c1 == c){
                    cnt++;
                }
            }
            if (cnt != 0){
                op+=c+" ";
            }
            else{
                op+="_ ";
            }
        }
        return op;
    }
    public String guessing(String guess){
        this.guess = guess;
        int check = this.count;
        int checkIn = 0;
        for (char c : guessWord.toCharArray()) {
            if (guess.toCharArray()[0] == c){
                checkIn ++;
            }
        }
        for (char c : hindenWord.toCharArray()) {
            if (guess.toCharArray()[0] == c && checkIn == 0) {
                this.count--;
                int cnt = 0;
                for (char c1 : this.guessWord.toCharArray()) {
                    if (guess.toCharArray()[0] == c1){
                        cnt++;
                    }
                }
                if (cnt == 0){
                    this.guessWord += guess.toCharArray()[0];
                }
            }
        }
        if (check == this.count){
            life--;
        }
        if (life < 0){
            life = 0;
        }
        String output = "+-------+   \n"+
                "|           \n"+
                "|           \n"+
                "|           \n"+
                "|__________ \n";
        if (life == 0){
            output = "+-------+   \n"+
                    "|            o   \n"+
                    "|           /|\\ \n"+
                    "|           / \\ \n"+
                    "|__________ \n";
        }
        else if (life == 1){
            output = "+-------+   \n"+
                    "|            o   \n"+
                    "|           /|\\ \n"+
                    "|           /    \n"+
                    "|__________ \n";
        }
        else if (life == 2){
            output = "+-------+   \n"+
                    "|            o   \n"+
                    "|           /|\\ \n"+
                    "|           \n"+
                    "|__________ \n";
        }
        else if (life == 3){
            output = "+-------+   \n"+
                    "|            o   \n"+
                    "|           /|   \n"+
                    "|           \n"+
                    "|__________ \n";
        }
        else if (life == 4){
            output = "+-------+   \n"+
                    "|            o   \n"+
                    "|           /    \n"+
                    "|           \n"+
                    "|__________ \n";
        }
        else if (life == 5){
            output = "+-------+   \n"+
                    "|            o   \n"+
                    "|           \n"+
                    "|           \n"+
                    "|__________ \n";
        }
        else if (life == 6){
            output = "+-------+   \n"+
                    "|           \n"+
                    "|           \n"+
                    "|           \n"+
                    "|__________ \n";
        }
        return output;
    }
}
