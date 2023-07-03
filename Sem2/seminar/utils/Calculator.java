package Sem2.seminar.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Calculator{

    static Scanner scanner = new Scanner(System.in);

    public static void run () /*throws IOException*/{

        System.out.println("Введите имя");
        String str = scanner.nextLine();
        System.out.println(str);
        File logFile = new File("log.txt");
        try (FileWriter fileWriter = new FileWriter(logFile, true))
        {
        

            for (int i = 0; i < 5; i++){
                fileWriter.write("hello " + i + '\n');
            }
            fileWriter.flush();
           // fileWriter.close();
            System.out.print("Введите первое число: ");
            double x = Double.parseDouble(scanner.nextLine());

            System.out.print("Введите операцию (+ - / *): ");
            char operation = scanner.nextLine().charAt(0);

            System.out.print("Введите второе число: ");
            double y = Double.parseDouble(scanner.nextLine());

            if (operation == '+'){
                System.out.printf("%.2f + %.2f = %.2f\n", x, y, plus(x, y));
            }
            if (operation == '-'){
                System.out.printf("%.2f - %.2f = %.2f\n", x, y, minus(x, y));
            }

        }
        catch(IOException ex){

        }




        
    }

    static double plus(double a, double b){
        return a + b;
    }

    static double minus(double a, double b){
        return a - b;
    }
    
}