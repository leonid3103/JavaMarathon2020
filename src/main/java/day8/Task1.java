package day8;

import java.sql.SQLOutput;

public class Task1 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        int[] arInt = new int[20000];
        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }

        System.out.println(sb.toString());
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("программа выполнялась " + timeSpent + " миллисекунд");
    }


}
