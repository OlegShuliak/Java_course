package Sem5.homework;

import java.util.*;

public class Program {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] phoneNums = {
                "Ivanov 1546258",
                "Petrov 6518654",
                "Kovalev 6528495",
                "Ivanov 7585652",
                "Smirnov 9562586",
                "Ivanov 1526584",
                "Ivanov 6584584",
                "Kovalev 4859568"
        };

        for (String person : phoneNums) {
            String[] parts = person.split(" ");
            Phones.add(parts[0], parts[1]);
        }

        boolean f = true;

        while (f) {
            System.out.println("Введите номер операции для работы со справочником:");
            System.out.println("1) add - добавить контакт.");
            System.out.println("2) get - найти контакт по фамилии.");
            System.out.println("0) Завершение работы со справочником.");
            int operation = Integer.parseInt(scanner.nextLine());

            switch (operation) {
                case 1:
                    System.out.println("Введите фамилию:");
                    String name = scanner.nextLine();
                    System.out.println("Введите номер телефона:");
                    String number = scanner.nextLine();
                    Phones.add(name, number);
                    break;
                case 2:
                    System.out.println("Введите фамилию:");
                    String nameSrch = scanner.nextLine();
                    Phones.get(nameSrch);
                    break;
                case 0:
                    System.out.println("Работа завершена.");
                    f = false;
                    break;
                default:
                    System.out.println("Такой операции не существует. Повторите попытку ввода.");
                    break;
            }
        }
    }

}
