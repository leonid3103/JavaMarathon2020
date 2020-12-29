package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane air = new Airplane("boeing",1980,22000,60000);
        air.setLength(10000);
        air.setYear(1900);
        air.fillUp(100);
        air.fillUp(200);
        air.info();

    }
}
