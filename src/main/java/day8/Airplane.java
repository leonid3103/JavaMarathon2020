package day8;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int fillUp(int n) {
        return (this.fuel = this.fuel + n);
    }

    public void info() {
        System.out.println("Изготовитель: " + getProducer() + ", " +
                "год выпуска: " + getYear() + ", " + "длина: " +
                getLength() + ", " + "вес: " + getWeight() +
                ", " + "количество топлива в баке: " + getFuel());
    }

    @Override
    public String toString() {
        return "Изготовитель: " +
                producer +
                ", год выпуска: " + year +
                ", длина: " + length +
                ", вес: " + weight +
                ", количество топлива в баке: " + fuel;
    }
}
