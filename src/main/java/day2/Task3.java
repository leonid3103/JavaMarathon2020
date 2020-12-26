package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean t = a >= b;
        int i = a;
        while (!t && i < b) {
            i++;
            if (i < b && i % 5 == 0 && i % 10 != 0) {
                System.out.print(i + " ");
            }
        }
        if (t) {
            System.out.println("Некорректный ввод");
        }
    }
}
