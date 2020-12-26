package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        switch (city) {
            case "Владивосток":
            case "Москва":
            case "Ростов":
                System.out.println("Россия");
                break;
            case "Ливерпуль":
            case "Манчестер":
            case "Лондон":
                System.out.println("Англия");
                break;
            case "Рим":
            case "Милан":
            case "Турин":
                System.out.println("Италия");
                break;
            case "Берлин":
            case "Мюнхен":
            case "Кельн":
                System.out.println("Германия");
                break;
            case "Stop":
                System.out.println("Программа завершила работу");
                break;
            default:
                System.out.println("Неизвестная страна");

        }
    }
}
