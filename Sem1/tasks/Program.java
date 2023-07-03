package Sem1.tasks;

import java.util.Scanner;

public class Program {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean f = true;
        while (f) {
            System.out.println("Укажите номер задачи:");
            System.out.println("1 - Задача 1");
            System.out.println("2 - Задача 2");
            System.out.println("3 - Задача 3");
            System.out.println("0 - Завершение работы приложения");
            int no = Integer.parseInt(scanner.nextLine());

            switch (no) {

                case 2:
                    task2();
                    break;
                case 1:
                    printName();
                    break;
                case 3:
                    task3("Добро пожаловать на курс по Java");
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

    /*
     * Написать программу, которая запросит пользователя ввести <Имя> в консоли.
     * ПОлучит введенную строку и выведет в консоль сообщение "Привет, <Имя>!"
     */

    static void printName() {
        int i = 12;
        double j = 12.4;
        System.out.print("Введите свое имя: ");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!"); // Склейка
        System.out.printf("Привет, %s! %d %.2f", name, i, j); // Форматированный вывод: s - строки, d - целые числа, .2f
                                                              // - вещественные числа(2 знака после запятой)
    }

    /*
     * Дан массив двоичных чисел [1,1,0,1,1,1,0,1], вывести
     * максимальное количество подряд идущих 1.
     */
    static void task2() {

        int counter = 0;
        int max = 0;

        int[] array = { 1, 1, 0, 1, 1, 1, 0, 1 };
        for (int e : array) {
            if (e == 1)
                counter++;
            else {
                if (counter > max)
                    max = counter;
                counter = 0;
            }

        }

        System.out.printf("Максимальное количество подряд идущих 1 = %d.", counter);
        System.out.println();
    }

    /*
     * Во фразе "Добро пожаловать на курс по Java" перестроить слова в обратном
     * порядке
     */

    static void task3(String str) {
        String[] words = str.split("");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.printf("%s ", words[i]);
        }
        System.out.println();
    }

}