package day8;

public class Task1_2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        int[] arInt = new int[20000];
        String s = "0";
        for (int i = 1; i <= 20000; i++) {
            s = s + " " + Integer.toString(i);
        }

        System.out.println(s);
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("программа выполнялась " + timeSpent + " миллисекунд");
    }
}
