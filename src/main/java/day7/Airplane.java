package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    public static int maxWeight;

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
        this.weight = maxWeight;
    }

    public static void compareAirplanes(Airplane air1, Airplane air2) {
        if (air1.length > air2.length) {
            air1.maxWeight = air1.length;
            System.out.println("Первый самолет длиннее");
        } else if (air2.length > air1.length) {
            air2.maxWeight = air2.length;
            System.out.println("Второй самолет длиннее");
        } else {
            System.out.println("Длины самолетов равны");
        }
    }
}


