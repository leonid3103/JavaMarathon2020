package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[100];
        int sum =0;
        int count =0;
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < 100; i++) {
            array[i] = rand.nextInt(10000);
                if (array[i] < min){
                    min =array[i];
                } else if (array[i]>max){
                    max = array[i];
                }
                if ((array[i]%10)==0){
                    count++;
                    sum = sum + array[i];

                }
            }
        System.out.println(Arrays.toString(array));
        System.out.println(min);
        System.out.println(max);
        System.out.println(count);
        System.out.println(sum);
        }

    }
