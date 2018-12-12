package CorrectingTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        CheckingMatchine c1 = new CheckingMatchine(target);
        int len = c1.checkLen(target);
        int people = sc.nextInt();
        int i;
        double sum=0;
        for (i = 0; i < people; i++) {
            int guess = sc.nextInt();
            sum += c1.guessing(guess);
            int point = c1.guessing(guess);
            System.out.println((i+1)+": "+point+"/"+len);
        }
        System.out.println("Average: " + sum/i);
    }
}
