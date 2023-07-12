
// Пусть дан произвольный список целых чисел.
// Нужно удалить из него чётные числа

package Sem3.homework;

import java.util.ArrayList;
import java.util.Random;

public class Task1 {

    static Random random = new Random();

    public static void main() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = random.nextInt(10, 21);
        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt(-20, 21));
        }
        System.out.println("Случайный список: " + arrayList);
        delEven(arrayList);
        System.out.println("Список нечетных чисел: " + arrayList);
    }

    static void delEven(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0 && arr.get(i) !=0) {
                arr.remove(i);
                i--;
            }
        }
    }

}
