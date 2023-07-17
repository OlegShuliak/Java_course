package Sem5.homework;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class Phones {

    public static HashMap<String, List<String>> hashMap = new HashMap<>();

    public void Phones(HashMap<String, List<String>> hashMap) {
        this.hashMap = hashMap;
    }

    static void add(String name, String nummber) {
        if (hashMap.containsKey(name)) {
            hashMap.get(name).add(nummber);
        } else {
            List<String> lst = new ArrayList<String>();
            lst.add(nummber);
            hashMap.put(name, lst);
        }
    }

    static void get(String name) {
        int count = 0;
        for (Map.Entry<String, List<String>> item : hashMap.entrySet()) {
            if (item.getKey().equals(name)) {
                System.out.println(item.getKey() + ":");
                for (String number : item.getValue()) {
                    System.out.println("\t" + number + ";");
                }
                count++;
            }

        }

        if (count == 0) {
            System.out.println("Контакт не найден.");
        }
    }
}
