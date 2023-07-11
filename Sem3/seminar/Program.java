package Sem3.seminar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Program {

    static ArrayList<ArrayList<String>> catalog = new ArrayList<>();
    static Random random = new Random();


    /**
     * Задача:
     * Каталог товаров книжного магазина сохранен в виде двумерного
     * списка ArrayList<ArrayList<String>> так, что на 0й позиции каждого внутреннего списка
     * содержится название жанра, а на остальных позициях - названия книг.
     * Напишите метод для заполнения данной структуры.
     */
    static void task2(){
        addBook("Поэма", "Книга #1");
        addBook("Поэма", "Книга #2");
        addBook("Поэма", "Книга #3");
        addBook("Пьеса", "Книга #1");
        addBook("Пьеса", "Книга #15");

        printCatalog();
    }

    static void addBook(String genre, String bookName){
        for (ArrayList<String> books : catalog){
            if (books != null && books.size() > 0 && books.get(0).equals(genre)){
                books.add(bookName);
                return;
            }
        }
        ArrayList<String> books = new ArrayList<>();
        books.add(genre);
        books.add(bookName);
        catalog.add(books);
    }

    static void printCatalog(){
        int i = 0;
        boolean f = true;
        while (f){
            f = false;
            for (ArrayList<String> books : catalog){
                if (books != null && books.size() > i){
                    f = true;
                    System.out.printf("%s\t\t", books.get(i));
                }
            }
            System.out.println();
            i++;
        }
    }

    /**
     *  * Заполнить список десятью случайными числами.
     *  Отсортировать список методом sort() и вывести его на экран.
     */
    static void task1(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = random.nextInt(10, 21);
        for (int i = 0; i < size; i++){
            arrayList.add(random.nextInt(-9, 10));
        }
        System.out.println("До сортировки: " + arrayList);
        Collections.sort(arrayList);
        System.out.println("После сортировки: " + arrayList);
    }


    public static void main(String[] args) {

        task1();
        task2();

        Person person1 = new Person();
        person1.name = "User1";
        person1.age = 33;
        System.out.println(person1);

        Person person2 = new Person();
        person2.name = "User2";
        person2.age = 33;
        System.out.println(person2);

        String str1 = "Hello!";
        String str10 = "cd";
        char[] arr1 = new char[] {  'c', 'd' };
        String str2 = "Hello!";
        String str3 = "He" + "ll" + "o!";
        String str4 = new String("Hello!");
        StringBuilder stringBuilder = new StringBuilder("Hello!");
        String s1 = stringBuilder.toString();
        String s2 = stringBuilder.toString();
        int a = 12;
        System.out.println(a);

        String str = "abcd";
        System.out.println(str10.equals(new String(arr1)));
        System.out.println(str);
        System.out.println(s1 == s2);
        System.out.println(str1 == str4);
        System.out.println(str1.equals(str4));
        System.out.println(str1.equals(str3));
        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));

     //   String.valueOf()

        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("Hello!");
        arrayList1.add(person2);
        arrayList1.add(false);
        arrayList1.add(12);

        ArrayList<Person> arrayList2 = new ArrayList<>();
        arrayList2.add(person2);

        for (Person e: arrayList2) {

        }

        doProcess(arrayList1);

        MyArrayList<Person> myArrayList = new MyArrayList<>(new Person[5]);
        myArrayList.add(person1);
        myArrayList.add(person2);

    }

    static void doProcess(ArrayList list){
        for (Object o: list) {
            if (o instanceof Person){
                Person p = (Person)o;

                System.out.println("Возраст: " + p.age);

            }

        }
    }

}

class MyArrayList <E>{

    int index = -1;
    E[] array;

    public MyArrayList(E[] baseArray){
        array = baseArray;
    }

    public void add(E i){
        array[++index] = i;
    }

}

class Person {
    String name;
    int age;

    void sample1(short a){

    }

    void sample1(int a){

    }

    @Override
    public boolean equals(Object obj) {
       if (obj instanceof Person){
           Person p = (Person)obj;
           if (age == p.age){
               return true;
           }
           else{
               return  false;
           }
       }
       return false;
    }

    @Override
    public String toString() {
        return "[" + name + "; " + age + "]";
    }
}
