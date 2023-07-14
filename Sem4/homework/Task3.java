// Реализовать простой калькулятор

package Sem4.homework;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Task3 {

    static void calculator() {

        boolean f = true;

        try {

            File logFile = new File("D:\\GeekBrains\\Java_course\\Sem4\\homework\\logCalculator.txt");
            FileWriter fileWriter = new FileWriter(logFile, true);

            Deque<String> storyDeque = new ArrayDeque<String>();

            while (f) {
                System.out.println("Выберите арифметическое действие: ");
                System.out.println("<+> - Сложение.");
                System.out.println("<-> - Вычитание.");
                System.out.println("<*> - Умножение.");
                System.out.println("</> - Деление.");
                System.out.println("<?> - Показать историю операций.");
                System.out.println("<!> - Удаление последней операции из истории.");
                System.out.println("<#> - Выйти из калькулятора.");
                String operation = Program.scanner.nextLine();

                switch (operation) {
                    case "+":
                        System.out.println("Введите 1-е слагаемое:");
                        int sum1 = Integer.parseInt(Program.scanner.nextLine());
                        System.out.println("Введите 2-е слагаемое:");
                        int sum2 = Integer.parseInt(Program.scanner.nextLine());
                        int sumResult = sum1 + sum2;
                        System.out.printf("Результат сложения: %d + %d = %d.\n", sum1, sum2, sumResult);
                        fileWriter.write("Результат сложения: " + sum1 + " + " + sum2 + " = " + sumResult + "\n");
                        fileWriter.flush();
                        storyDeque.push(sum1 + " + " + sum2 + " = " + sumResult);
                        break;
                    case "-":
                        System.out.println("Введите уменьшаемое:");
                        int diff1 = Integer.parseInt(Program.scanner.nextLine());
                        System.out.println("Введите вычитаемое:");
                        int diff2 = Integer.parseInt(Program.scanner.nextLine());
                        int diffResult = diff1 - diff2;
                        System.out.printf("Результат вычитания: %d - %d = %d.\n", diff1, diff2, diffResult);
                        fileWriter.write("Результат вычитания: " + diff1 + " - " + diff2 + " = " + diffResult + "\n");
                        fileWriter.flush();
                        storyDeque.push(diff1 + " - " + diff2 + " = " + diffResult);
                        break;
                    case "*":
                        System.out.println("Введите 1-й множитель:");
                        int mult1 = Integer.parseInt(Program.scanner.nextLine());
                        System.out.println("Введите 2-й множитель:");
                        int mult2 = Integer.parseInt(Program.scanner.nextLine());
                        int multResult = mult1 * mult2;
                        System.out.printf("Результат умножения: %d * %d = %d.\n", mult1, mult2, multResult);
                        fileWriter.write("Результат умножения: " + mult1 + " * " + mult2 + " = " + multResult + "\n");
                        fileWriter.flush();
                        storyDeque.push(mult1 + " * " + mult2 + " = " + multResult);
                        break;
                    case "/":
                        System.out.println("Введите делимое:");
                        double div1 = Integer.parseInt(Program.scanner.nextLine());
                        System.out.println("Введите делитель:");
                        double div2 = Integer.parseInt(Program.scanner.nextLine());
                        double divResult = div1 / div2;
                        System.out.printf("Результат деления: %.0f / %.0f = %.3f.\n", div1, div2, divResult);
                        fileWriter.write("Результат деления: " + div1 + " / " + div2 + " = " + divResult + "\n");
                        fileWriter.flush();
                        storyDeque.push(div1 + " / " + div2 + " = " + divResult);
                        break;
                    case "?":
                        for (String e : storyDeque) {
                            System.out.println(e);
                        }
                        break;
                    case "!":
                        fileWriter.write("Удаление последней операции: " + storyDeque.getFirst() + "\n");
                        fileWriter.flush();
                        System.out.println("Удаление последней операции: " + storyDeque.getFirst());
                        storyDeque.removeFirst();
                        break;
                    case "#":
                        System.out.println("Завершение работы калькулятора.");
                        fileWriter.write("Завершение работы калькулятора.\n");
                        f = false;
                        fileWriter.flush();
                        fileWriter.close();
                        break;
                    default:
                        System.out.println("Некорректный знак операции, повторите попытку ввода.");
                        fileWriter.write("Некорректный знак операции, повторите попытку ввода.\n");
                        fileWriter.flush();
                        break;
                }
            }
        }

        catch (Exception e) {

        }

    }

}
