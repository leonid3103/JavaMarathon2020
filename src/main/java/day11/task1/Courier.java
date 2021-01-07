package day11.task1;

public class Courier implements Worker {
    private Warehouse warehouse;
    private int salary;
    private boolean isPayed = false;
    private static int count = 0;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        this.salary = salary + 100;
        Warehouse.countDeliveredOrders++;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Courier{" +
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
            this.salary = salary + 50000;
            isPayed = true;
        } else if (isPayed == true) {
            System.out.println("Бонус уже был выплачен");

        }

    }
}


