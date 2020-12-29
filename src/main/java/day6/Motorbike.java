package day6;

public class Motorbike {
    int year;
    private String color;
    private String model;

    public Motorbike(String model, String color, int year) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Motorbike {" +
                "releaseYear = " + year +
                ", color = '" + color + '\'' +
                ", model = '" + model + '\'' +
                '}';
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - year);
    }
}
