package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Task 14-1");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        int counter = 0;
        int sum = 0;

        String[] values = line.split(" ");

          if (values.length != 10) {
            throw new AssertionError("Некорректный входной файл");
        }
        for (String val : values) {
            sum = sum + Integer.parseInt(val);

        }
        System.out.println(sum);
    }
}
