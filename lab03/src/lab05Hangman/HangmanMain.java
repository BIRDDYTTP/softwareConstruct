package lab05Hangman;


import java.util.Scanner;

public class HangmanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.nextLine();
        String guess;
        Hangman hangman = new Hangman(target);
        hangman.outputting();
        while (hangman.getLife() > 0){
            guess = sc.nextLine();
            hangman.guess(guess);
            hangman.outputting();
            if (hangman.getOutput().equals(hangman.getTarget()) == true){
                break;
            }
        }
    }
}
