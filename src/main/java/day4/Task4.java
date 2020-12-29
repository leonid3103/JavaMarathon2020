package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[100];
        int sumMax = 0;
        int index = 0;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < 100; i++) {
            array[i] = rand.nextInt(10000);
        }
        while (count < 8) {
            for (int i = (array.length - 3) - count; i <= (array.length - 1) - count; i++) {
                sum = sum + array[i];
                if (sum > sumMax) {
                    sumMax = sum;
                    index = i;
                }
            }
            sum = 0;
            count++;
        }
        System.out.println(sumMax);
        System.out.println(index);
    }
}