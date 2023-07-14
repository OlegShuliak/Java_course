// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package Sem4.homework;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main() {
        Deque linkedDeque = new LinkedList();

        while (true) {
            System.out.print("Введите строку: ");
            String inputString = scanner.nextLine();
            if (inputString.isEmpty()) {
                System.out.println("Завершение ввода строк.");
                break;
            }

            linkedDeque.push(inputString);
        }

        for (Object e : linkedDeque) {
            System.out.println(e);
        }

    }
}
