package Sem2.homework;

import java.util.Scanner;

public class Program {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean f = true;
        while (f) {
            System.out.println("Укажите номер домашней задачи для 2-го семинара:");
            System.out.println("1 - Задача 1: Вывод sql-запроса.");
            System.out.println("2 - Задача 2: Сортировка числового массива с лог-файлом.");
            System.out.println("4 - Задача 4: Простой калькулятор с лог-файлом.");
            System.out.println("0 - Завершение работы приложения");
            int no = Integer.parseInt(scanner.nextLine());

            switch (no) {

                case 1:
                    Task1.sqlQuerty(args);
                    break;
                case 2:
                    Task2.arrSort();
                    break;
                case 4:
                    Task4.calculator();
                    break;
                case 0:
                    System.out.println("Завершение работы приложения.");
                    f = false;
                    break;
                default:
                    System.out.println("Некорректный номер задачи,\nповторите попытку ввода.");
                    break;
            }
        }
    }
}
