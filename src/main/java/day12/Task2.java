package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> value = new ArrayList<>();
        for (int i = 0; i <= 30; i++) {
            if (i % 2 == 0) {
                value.add(i);
            }
        }
        for (int j = 300; j <= 350; j++) {
            if (j % 2 == 0) {
                value.add(j);
            }
        }
        System.out.println(value);
    }
}
