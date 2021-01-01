package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane air = new Airplane("boeing", 1963, 70600, 162400);
        Airplane air2 = new Airplane("airbus", 19970, 53620, 78200);
        Airplane.compareAirplanes(air,air2);
    }
}