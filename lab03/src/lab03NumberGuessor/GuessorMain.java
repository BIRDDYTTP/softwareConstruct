package lab03NumberGuessor;

import java.util.Scanner;

public class GuessorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        Guessor guessor = new Guessor(target);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int guess = sc.nextInt();
            System.out.println(guessor.guessing(guess));

        }
    }
}
