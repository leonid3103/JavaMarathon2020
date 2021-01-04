package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] array = new int [12][8];
        int sumMax = 0;
        int sumStr = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(50);
                sumStr = sumStr + array[i][j];
                if (sumStr > sumMax) {
                    sumMax = sumStr;
                    index = i;
                } else if (sumStr == sumMax) {
                    index = i;
                }
            }
            sumStr = 0;

        }
        System.out.println("Максимальная сумма " + sumMax + " в строке с индексом " + index);
    }
}
