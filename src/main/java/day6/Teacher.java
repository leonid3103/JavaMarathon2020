package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String discipline;
    final int min = 2;
    final int max = 5;

    public Teacher(String name, String discipline) {
        this.name = name;
        this.discipline = discipline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public void evaluate(Student student) {
        Random rand = new Random();
        int value = min + rand.nextInt(max - min + 1);
        String mark;
        switch (value) {
            case 4:
                mark = "Хорошо";
                break;
            case 5:
                mark = "Отлично";
                break;
            case 3:
                mark = "Удовлетворительно";
                break;
            default:
                mark = "Неудволетворительно";
                break;
        }
        System.out.println("Преподаватель " + getName() +
                " оценил студента с именем " + student.getName() +
                " по предмету " + getDiscipline() +
                " на оценку " + mark);
    }
}
