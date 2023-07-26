package Sem6.homework;

import java.util.Arrays;
import java.util.HashSet;

public class Program {

    public static void main(String[] args) {
       
        Cat cat1 = new Cat();
        cat1.name = "Barsik";
        cat1.color = "Black";
        cat1.age = 5;
        cat1.weight = 7;

        Cat cat2 = new Cat();
        cat2.name = "Wiskas";
        cat2.color = "White";
        cat2.age = 2;
        cat2.weight = 4;
       
        Cat cat3 = new Cat();
        cat3.name = "Barsik";
        cat3.color = "Black";
        cat3.age = 5;
        cat3.weight = 7;

        Cat cat4 = new Cat();
        cat4.name = "Floki";
        cat4.color = "Brown";
        cat4.age = 7;
        cat4.weight = 9;

        HashSet<Cat> cats = new HashSet<Cat> (Arrays.asList(cat1, cat2, cat3, cat4));
        System.out.println(cats);


    }

}
