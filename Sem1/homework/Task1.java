
// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package Sem1.homework;

public class Task1 {
    
    static void trianNumSrch(){
        System.out.println("Введите номер N треугольного числа: ");
        int numN = Integer.parseInt(Program.scanner.nextLine());
        int result = (numN*(numN+1))/2;
        System.out.printf("Треугольное %d-е число равно %d. \n", numN, result);
    }
    
}
