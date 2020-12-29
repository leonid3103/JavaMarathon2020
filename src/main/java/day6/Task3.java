package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teach = new Teacher("Andris","biology");
        Student stud = new Student("Jim");
        teach.evaluate(stud);
    }
}
