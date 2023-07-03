// Реализовать простой калькулятор

package Sem1.homework;

public class Task3 {

    static void calculator() {

        boolean f = true;
        while (f) {
            System.out.println("Выберите арифметическое действие: ");
            System.out.println("<+> - Сложение.");
            System.out.println("<-> - Вычитание.");
            System.out.println("<*> - Умножение.");
            System.out.println("</> - Деление.");
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
                    break;
                case "-":
                    System.out.println("Введите уменьшаемое:");
                    int diff1 = Integer.parseInt(Program.scanner.nextLine());
                    System.out.println("Введите вычитаемое:");
                    int diff2 = Integer.parseInt(Program.scanner.nextLine());
                    int diffResult = diff1 - diff2;
                    System.out.printf("Результат вычитания: %d - %d = %d.\n", diff1, diff2, diffResult);
                    break;
                case "*":
                    System.out.println("Введите 1-й множитель:");
                    int mult1 = Integer.parseInt(Program.scanner.nextLine());
                    System.out.println("Введите 2-й множитель:");
                    int mult2 = Integer.parseInt(Program.scanner.nextLine());
                    int multResult = mult1 * mult2;
                    System.out.printf("Результат умножения: %d * %d = %d.\n", mult1, mult2, multResult);
                    break;
                case "/":
                    System.out.println("Введите делимое:");
                    double div1 = Integer.parseInt(Program.scanner.nextLine());
                    System.out.println("Введите делитель:");
                    double div2 = Integer.parseInt(Program.scanner.nextLine());
                    double divResult = div1 / div2;
                    System.out.printf("Результат деления: %.0f / %.0f = %.3f.\n", div1, div2, divResult);
                    break;
                case "#":
                    System.out.println("Завершение работы калькулятора.");
                    f = false;
                    break;
                default:
                    System.out.println("Некорректный знак операции, повторите попытку ввода.");
                    break;
            }
        }
    }

}
