package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List <String> auto = new ArrayList(Arrays.asList("Audi", "BMW", "Lada", "Tesla"));
        List <String> auto1 = new ArrayList(Arrays.asList("Audi", "BMW", "Lada", "Tesla"));
           auto1.add(2,"bmw");
           auto1.remove(0);
        System.out.println(auto);
        System.out.println(auto1);

    }
}
