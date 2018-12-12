package lab02Stamp;

import java.util.Scanner;

public class StampMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double cost = 0;
        for (int i = 0; i < num; i++) {
            cost += sc.nextDouble();
        }
        Stamp calculate = new Stamp(cost);

        int output = (int) calculate.calculateStamp();
        System.out.println(output);

    }
}
