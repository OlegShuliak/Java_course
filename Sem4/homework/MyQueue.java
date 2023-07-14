// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
// Это задание повышенной сложности, для решения задачи потребуется создать класс-обертку над LinkedList, например:

// class MyQueue {
//     private LinkedList elements = new LinkedList();

//     public MyQueue() { }
//     public MyQueue(LinkedList linkedList) {
//         this.elements = linkedList;
//     }

//         .........

// }

package Sem4.homework;

import java.util.EmptyStackException;
import java.util.LinkedList;


public class MyQueue {

    public static LinkedList elements = new LinkedList();

    public MyQueue() {
    }

    public MyQueue(LinkedList linkedList) {
        this.elements = linkedList;
    }

    static void enqueue (Object e){
        elements.addFirst(e);
    }

    static Object dequeue (){
        if (elements.getFirst() == null){
            System.out.println("Первого элемента не существует, добавьте элементы в очередь.");
            throw new EmptyStackException();
        }
        Object temp = elements.getFirst();
        elements.removeFirst();
        return temp;
    }

    static Object first(){
        if (elements.getFirst() == null){
            System.out.println("Первого элемента не существует, добавьте элементы в очередь.");
            throw new EmptyStackException();
        }
        return elements.getFirst();
    }
}
