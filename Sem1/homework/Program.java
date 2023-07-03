package Sem1.homework;

import java.util.Scanner;

public class Program {
    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean f = true;
        while (f) {
            System.out.println("Укажите номер домашней задачи для 1-го семинара:");
            System.out.println("1 - Задача 1: Определение N-го треугольного числа.");
            System.out.println("2 - Задача 2: Вывести все простые числа от 1 до 1000.");
            System.out.println("3 - Задача 3: Простой калькулятор.");
            System.out.println("0 - Завершение работы приложения");
            int no = Integer.parseInt(scanner.nextLine());

            switch (no) {

                case 1:
                    Task1.trianNumSrch();
                    break;
                case 2:
                    Task2.primeNums();
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
