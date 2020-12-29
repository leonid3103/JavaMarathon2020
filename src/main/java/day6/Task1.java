package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.info();
        car.setYear(2020);
        int inputYear = 1980;
        int difference = car.yearDifference(inputYear);
        System.out.println("Год выпуска автомобиля " + car.getYear() + " год для сравнения " + inputYear);
        Motorbike moto = new Motorbike("bmv","yellow",2020);
        moto.info();
        int difference2 = moto.yearDifference(inputYear);
        System.out.println("Год выпуска мотоцикла " + moto.year + " год для сравнения " + inputYear);
    }
}
