package day9.Task1;

public class Task1 {
    public static void main(String[] args) {

       Student stud = new Student("Alex","11A");
       stud.printInfo();
       System.out.println(stud.getGroupName());
       Teacher teach = new Teacher("Sam", "biology");
       teach.printInfo();
       System.out.println(teach.getSubjectName());
    }
}
