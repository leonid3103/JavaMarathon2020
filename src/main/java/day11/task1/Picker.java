package day11.task1;

public class Picker implements Worker {
    private Warehouse warehouse;
    private int salary;
    private boolean isPayed =false;
    private static int count = 0;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        this.salary = salary + 80;
        Warehouse.countPickedOrders++;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }


    @Override
    public void bonus() {
        count++;
        if (Warehouse.countDeliveredOrders < 10000) {
            System.out.println("Бонус пока не доступен");
        } else if (Warehouse.countDeliveredOrders >= 10000 && count==1) {
            this.salary = salary + 70000;
            isPayed = true;
        } else if (isPayed == true) {
            System.out.println("Бонус уже был выплачен");

        }
    }}
