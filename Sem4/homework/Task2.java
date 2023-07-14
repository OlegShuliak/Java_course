package Sem4.homework;

import java.util.Scanner;

public class Task2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main() {
        boolean f = true;
        while (f) {
            System.out.println("Введите номер операции, для работы со списком LinkedList: ");
            System.out.println("1) enqueue - поместить элемент в конец очереди;");
            System.out.println("2) dequeue - вернуть первый элемент из очереди и удалить его;");
            System.out.println("3) first - вернуть первый элемент из очереди не удаляя его;");
            System.out.println("4) end - завершение работы программы.");
            int operation = Integer.parseInt(scanner.nextLine());

            switch (operation) {
                case 1:
                    System.out.println("Введите данные для добавления в очередь:");
                    Object e = scanner.nextLine();
                    MyQueue.enqueue(e);
                    break;
                case 2:
                    Object delObject = MyQueue.dequeue();
                    System.out.println("Первый элемент очереди удален: " + delObject);
                    break;
                case 3:
                    Object firsObject = MyQueue.first();
                    System.out.println("Первый элемент очереди: " + firsObject);
                    break;
                case 4:
                    System.out.println("Завершение работы со списком.");
                    f = false;
                    break;
                default:
                    System.out.println("Введена некорректная операция. Повторите попытку.");
                    break;

            }

        }

    }
}
