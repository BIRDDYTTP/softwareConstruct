package CorrectingTest;

import java.util.Scanner;

public class MainProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        CheckingMatchine c1 = new CheckingMatchine(target);
        int people = sc.nextInt();

        for (int i = 0; i < people; i++) {
            int guess = sc.nextInt();
            c1.guess(guess);
        }
        System.out.println(c1.toString());
    }
}
