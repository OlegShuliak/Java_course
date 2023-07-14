package Sem4.homework;

import java.util.Scanner;

public class Program {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean f = true;
        while (f) {
            System.out.println("Укажите номер домашней задачи для 4-го семинара:");
            System.out.println("1 - Задача 1: Возврещение 'перевернутого' списка LinkedList.");
            System.out.println("2 - Задача 2: Реализация очереди в LinkedList с внедренными методами.");
            System.out.println("3 - Задача 3: Калькулятор с выводом истории и удалением последней операции.");
            System.out.println("0 - Завершение работы приложения");
            int no = Integer.parseInt(scanner.nextLine());

            switch (no) {

                case 1:
                    Task1.main();
                    break;
                case 2:
                    Task2.main();
                    break;
                case 3:
                    Task3.calculator();
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
