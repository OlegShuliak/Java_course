package Sem2.seminar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

import Sem2.seminar.utils.Calculator;

public class Program{

    public static void main(String[] args) /*throws IOException*/ {
        
        String  str = "a-b-c-d-e";
        String[] arr = str.split("-");
        
        //task1();
        System.out.println(task2());
        Calculator.run();
        //stroka();
    }


     /**
     * Задача:
     * На вход программы подаются произвольные алфавитно-цифровые символы.
     * Требуется написать программу, которая будет печатать последовательность строчных английских букв ('a' 'b'... 'z')
     * из входной последовательности и частот их повторения.
     * Печать должна происходить в алфавитном порядке. Например, пусть на вход подаются следующие символы:
     * fhb5234SSDSFsfsdfskbfsh.fmsdfsdf.
     * '.' - завершение последовательности
     * В этом случае программа должна вывести:
     * b2
     * f3
     * h2
     * k1
     * m1
     * s1
     */
    static String task2(){

        String inputStr = "fhb5234SSDSFsfsdfskbfsh.fmsdfsdf.";
        int[] statistic = new int[26];
        int cA = 'a';
        int code;
        char c;
        for (int i = 0; i < inputStr.length(); i++){
            c = inputStr.charAt(i);
            code = c;
            if (c >= 'a' && c <= 'z'){
                statistic[code - cA]++;
            }
            if (c == '.')
                break;
        }
        System.out.println("Результат рабоыт приложения:");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < statistic.length; i++){
            if (statistic[i] > 0){
            char cc = (char)(i + cA);
            stringBuilder
                .append(cc)
                .append(statistic[i])
                .append('\n');
            }
        }
        return stringBuilder.toString();
    }

    static void task1(){
        int a = 12;
        double b = 14.5;
        String str = "AAA" + "BBB" + a + "CCC" + b + "DDD";
        System.out.println(UUID.randomUUID());
        System.out.println(UUID.randomUUID());
        System.out.println(UUID.randomUUID());

        String buf = "";

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 30000; i++){
            buf += UUID.randomUUID();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Операция выполнена за " + (endTime - startTime) + "мс.");

        buf = "";
        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder(1000);
        for (int i = 0; i < 30000; i++){
            stringBuilder.append(UUID.randomUUID());
        }
        endTime = System.currentTimeMillis();
        System.out.println("Операция выполнена за " + (endTime - startTime) + "мс.");
    }

   /*static void stroka(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите число");
            boolean f = scan.hasNextInt();
            if (f){
               int a = scan.nextInt();
               System.out.println("Вы ввели число: " + a);
               scan.nextLine();
            }
            else{
               System.out.println("Вы ввели некорректное число, повторите попытку ввода.");
               scan.nextLine(); 
            }

            System.out.println("Введите строку 1");
            String str1 = scan.nextLine();
            System.out.println("Введите строку 2");
            String str2 = scan.nextLine();
            System.out.println("Введите число");
            int i = scan.nextInt();
        
            System.out.println(str1);
            System.out.println(str2);
            System.out.println(i);
    }*/
    
}
