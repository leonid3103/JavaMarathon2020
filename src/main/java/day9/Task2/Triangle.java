package day9.Task2;

public class Triangle extends Figure {

    private double len1;
    private double len2;
    private double len3;

    public Triangle( double len1, double len2, double len3, String color) {
        super(color);
        this.len1 = len1;
        this.len2 = len2;
        this.len3 = len3;
    }

    @Override
    public double area() {
        double pp = (len1 + len2 + len3) / 2;
        double s = Math.sqrt(pp * (pp - len1) * (pp - len2) * (pp - len3));
        return s;
    }

    @Override
    public double perimeter() {
        double p = len1 + len2 + len3;
        return p;
    }
}
