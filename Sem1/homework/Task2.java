// Вывести все простые числа от 1 до 1000

package Sem1.homework;

public class Task2 {

    static void primeNums() {
        System.out.printf("2");
        for (int i = 3; i <= 1000; i++) {
            if (isPrime(i) == true)
            System.out.printf(", %d", i);
        }
        System.out.println("");
    }

    public static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        if (n == 2 || n == 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }
}
