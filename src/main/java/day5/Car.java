package day5;

public class Car {
    private int releaseYear;
    private String color;
    private String model;

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
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
                "releaseYear = " + releaseYear +
                ", color = '" + color + '\'' +
                ", model = '" + model + '\'' +
                '}';
    }
}
