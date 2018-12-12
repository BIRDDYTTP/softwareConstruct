package lab01Fraction;

import java.util.Scanner;

public class FractionMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        Fraction f1 = new Fraction(a, b);
        Fraction f2 = new Fraction(c, d);
        f1.add(f2);
        System.out.println(f1);
    }
}
