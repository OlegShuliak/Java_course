// Найти минимальное значение
// Найти максимальное значение 

package Sem3.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task2and3 {
    static Random random = new Random();

    public static void main() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = random.nextInt(10, 21);
        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt(-20, 21));
        }
        System.out.println("Случайный список: " + arrayList);
        Collections.sort(arrayList);
        System.out.println("Минимальное значение массива: " + arrayList.get(0));
        System.out.println("Максимальное значение массива: " + arrayList.get(arrayList.size() - 1));
    }
}
