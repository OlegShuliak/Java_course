// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package Sem2.homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Task2 {

    public static void arrSort() {
        System.out.println("Введите длину сортируемого массива: ");
        int len = Integer.parseInt(Program.scanner.nextLine());
        System.out.println("Введите максимальное числовое значение в массиве: ");
        int numMax = Integer.parseInt(Program.scanner.nextLine());
        int[] array = gen1DArr(len, numMax);
        System.out.printf("Сгенерированный массив: ");
        print1DArr(array);
        bubbleSort(array);
        System.out.printf("Отсортированный массив: ");
        print1DArr(array);
    }

    // Метод заполнения одномерного массива числами в случайном порядке
    static int[] gen1DArr(int len, int maxValue) {
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = new Random().nextInt(maxValue);
        }
        return res;
    }

    // Метод печати одномерного массива
    static void print1DArr(int[] arr) {
        System.out.printf("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.printf(arr[i] + ", ");
        }
        System.out.printf(arr[arr.length - 1] + "] \n");
    }

    // Метод преобразования одномерного массива в строку
    static String arrToString(int[] arr) {
        StringBuilder arrStr = new StringBuilder();
        arrStr.append("[");
        for (int i = 0; i < arr.length - 1; i++) {
            arrStr.append(arr[i] + ", ");
        }
        arrStr.append(arr[arr.length - 1] + "] \n");
        return arrStr.toString();
    }

    // Метод сортировки пузырьком с логированием
    static void bubbleSort(int[] array) {
        try {
            File logFile = new File("D:\\GeekBrains\\Java_course\\Sem2\\homework\\logBubbleSort.txt");
            FileWriter fileWriter = new FileWriter(logFile);

            for (int i = 0; i < array.length - 1; i++) {
                for (int j = array.length - 1; j > i; j--) {
                    if (array[j - 1] > array[j]) {
                        int tmp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = tmp;
                    }
                    String arrStr = arrToString(array);
                    fileWriter.write(arrStr);
                }
            }
            fileWriter.flush();
            fileWriter.close();
        }

        catch (IOException ex) {

        }
    }

}
