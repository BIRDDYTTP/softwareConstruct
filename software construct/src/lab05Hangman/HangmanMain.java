package lab05Hangman;


import java.util.Scanner;

public class HangmanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.nextLine();
        String guess;
        Hangman hangman = new Hangman(target);
        System.out.println(hangman.outputting());
        while (hangman.getLife() > 0){
            guess = sc.nextLine();
            hangman.guess(guess);
            if (hangman.getLastword() == hangman.getTarget()){
                System.out.println("Congratulations, you win");
                break;
            }
            System.out.println(hangman.outputting());
        }
    }
}
