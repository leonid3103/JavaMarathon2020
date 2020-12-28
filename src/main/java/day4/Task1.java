package day4;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int size = scanner.nextInt();
        int sum = 0;
        int count1, count2, count3, count4;
        count1 = count2 = count3 = count4 = 0;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(10);
            sum = sum + array[i];
            if (array[i] > 8) {
                count1++;
            } else if (array[i] == 1) {
                count2++;
            }
            if (array[i] % 2 == 0) {
                count3++;
            } else {
                count4++;
            }

        }
        System.out.print(Arrays.toString(array));
        System.out.println();
        System.out.println(size);
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count4);
        System.out.println(sum);
    }
}
