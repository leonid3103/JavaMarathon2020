package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse ware = new Warehouse();
        Courier cour = new Courier(ware);
        Picker pick = new Picker(ware);
        businessProcess(cour);
        businessProcess(pick);
        System.out.println(ware.getCountDeliveredOrders());
        System.out.println(cour.getSalary());
        System.out.println(pick.getSalary());
        cour.bonus();
        pick.bonus();
        System.out.println(cour.getSalary());
        System.out.println(pick.getSalary());
        cour.bonus();
        pick.bonus();
        System.out.println(cour.getSalary());
        System.out.println(pick.getSalary());
        Warehouse ware2 = new Warehouse();
        Courier cour2 = new Courier(ware2);
        Picker pick2= new Picker((ware2));
        cour2.doWork();
        cour2.doWork();
        pick2.doWork();
        pick2.doWork();
        System.out.println(cour.getSalary());
        System.out.println(pick.getSalary());

    }

    public static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();

        }
    }
}