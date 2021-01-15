package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Task 14-2");
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) throws FileNotFoundException, AssertionError {
        List<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] values = line.split(" ");
            for (String val : values) {
                val = values[1];
                if (Integer.parseInt(val) < 0) {
                    names = null;
                    throw new AssertionError("Некорректный входной файл");
                }
            }
            names.add(line);
        }
        scanner.close();
        return names;
    }
}
