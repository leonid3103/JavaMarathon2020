package day5;

public class Motorbike {
    int releaseYear;
    private String color;
    private String model;

    public Motorbike(int releaseYear, String color, String model) {
        this.releaseYear = releaseYear;
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Motorbike {" +
                "releaseYear = " + releaseYear +
                ", color = '" + color + '\'' +
                ", model = '" + model + '\'' +
                '}';
    }

}
