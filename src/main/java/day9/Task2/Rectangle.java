package day9.Task2;

public class Rectangle extends Figure {
    private double weight;
    private double length;

    public Rectangle(double weight, double length, String color) {
        super(color);
        this.weight = weight;
        this.length = length;
    }

    @Override
    public double area() {
        double s = weight * length;
        return s;
    }

    @Override
    public double perimeter() {
        double p = (weight + length) * 2;
        return p;
    }
}
