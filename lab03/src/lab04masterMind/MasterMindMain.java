package lab04masterMind;

import java.util.Scanner;


public class MasterMindMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.nextLine();
        MasterMind mm = new MasterMind(target);
        String guess = sc.nextLine();
        System.out.println(mm.guess(guess));
    }
}
