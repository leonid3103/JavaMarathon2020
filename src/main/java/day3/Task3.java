package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 5) {
            count++;
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            switch ((int) b) {
                case 0:
                    System.out.println("Деление на 0");
                    continue;
                default:
                    System.out.println(a / b);
            }
        }
    }
}
