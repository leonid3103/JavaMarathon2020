package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) throws FileNotFoundException, AssertionError {
        File file = new File("Task 14-3");
        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) throws FileNotFoundException, AssertionError {
        List<Person> persons = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] values = line.split(" ");
            if (Integer.parseInt(values[1]) < 0) {
                persons = null;
                throw new AssertionError("Некорректный входной файл");
            }
            persons.add(new Person(values[0], Integer.parseInt(values[1])));
        }
        scanner.close();
        return persons;
    }
}
