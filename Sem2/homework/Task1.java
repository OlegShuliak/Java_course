// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

package Sem2.homework;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static void sqlQuerty(String[] args) {
        Map<String, String> params1 = new HashMap<String, String>(); // создаем структуру данных Map с интерфейсом HashMap, далее заполняем даными вида "ключ - значение"
        params1.put("name", "Ivanov");
        params1.put("country", "Russia");
        params1.put("city", "Moscow");
        params1.put("age", null);
        System.out.println(getQuery(params1)); // вызываем метод getQuerty для вывода запроса
    }

    static String getQuery(Map<String, String> params) {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String, String> pair : params.entrySet()) {   // цикл для проверки структуры данных Map, исключающий значения null (пустые значения)
            if (pair.getValue() != null) {
                s.append(pair.getKey() + " - '" + pair.getValue() + "' and "); // формируем пару "ключ - значение"
            }
        }
        s.delete(s.toString().length() - 5, s.toString().length()); // удаляем лишние данные из строки запроса
        return s.toString(); // возвращаем результат
    }

}
