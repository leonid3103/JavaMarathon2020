package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y;
        boolean t = -3 < x && x < 5;
        while (t) {
            y = (x + 3) * (x * x - 2);
            System.out.println(y);
            break;
        }
        if (x >= 5 && !t) {
            y = (x * x - 10) / (x + 7);
            System.out.println(y);
        } else if (!t) {
            System.out.println(y = 420);

        }

    }
}

