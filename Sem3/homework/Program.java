package Sem3.homework;

import java.util.Scanner;

public class Program {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean f = true;
        while (f) {
            System.out.println("Укажите номер домашней задачи для 3-го семинара:");
            System.out.println("1 - Удаление четных чисел из списка.");
            System.out.println("2 - Задача 2 и 3: Вывод максимального и минимального значений списка.");
            System.out.println("3 - Задача 4: Вывод среднего значения списка.");
            System.out.println("0 - Завершение работы приложения");
            int no = Integer.parseInt(scanner.nextLine());

            switch (no) {

                case 1:
                    Task1.main();;
                    break;
                case 2:
                    Task2and3.main();
                    break;
                case 3:
                    Task4.main();
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
