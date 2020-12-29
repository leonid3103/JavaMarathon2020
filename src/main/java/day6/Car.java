package day6;

public class Car {
    private int year;
    private String color;
    private String model;

    public int getYear() {
        return year;
    }

    public void setYear(int releaseYear) {

        this.year = releaseYear;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    @Override
    public String toString() {
        return "Car {" +
                "releaseYear = " + year +
                ", color = '" + color + '\'' +
                ", model = '" + model + '\'' +
                '}';
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - year);
    }
}
