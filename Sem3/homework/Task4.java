package Sem3.homework;

import java.util.ArrayList;
import java.util.Random;
import java.util.IntSummaryStatistics;

public class Task4 {
    static Random random = new Random();

    public static void main() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = random.nextInt(10, 21);
        for (int i = 0; i < size; i++) {
            arrayList.add(random.nextInt(-20, 21));
        }
        System.out.println("Случайный список: " + arrayList);
        double avg = getAverage(arrayList);
        System.out.println("Среднее значение списка: " + avg);
    }

    private static double getAverage(ArrayList<Integer> arr) {
        IntSummaryStatistics stats = arr.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        return stats.getAverage();
    }


}
