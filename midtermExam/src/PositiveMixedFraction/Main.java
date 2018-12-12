package PositiveMixedFraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long wholeNumber = sc.nextLong();
        long nominator = sc.nextLong();
        long denominator = sc.nextLong();
        PositiveMixedFraction p1 = new PositiveMixedFraction(wholeNumber,nominator,denominator);
        System.out.println(p1.getWholeNumber());
        System.out.println(p1.getNominator());
        System.out.println(p1.getDenominator());
    }

}
