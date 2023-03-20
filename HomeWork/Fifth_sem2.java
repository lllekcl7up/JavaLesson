package JavaLesson.HomeWork;
// Пусть дан список сотрудников:

// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности имён.

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Fifth_sem2 {
    public static void main(String[] args) {
        Map<String, Integer> newMap = new HashMap<>();
        String people = "Иван Иванов " +
                "Светлана Петрова " +
                "Кристина Белова " +
                "Анна Мусина " +
                "Анна Крутова " +
                "Иван Юрин " +
                "Петр Лыков " +
                "Павел Чернов " +
                "Петр Чернышов " +
                "Мария Федорова " +
                "Марина Светлова " +
                "Мария Савина " +
                "Мария Рыкова " +
                "Марина Лугова " +
                "Анна Владимирова " +
                "Иван Мечников " +
                "Петр Петин " +
                "Иван Ежов ";
        String[] listPeople = people.split(" ");
        for (int i = 0; i < listPeople.length; i += 2) {
            if (newMap.containsKey(listPeople[i])) {
                newMap.replace(listPeople[i], newMap.get(listPeople[i]) + 1);
            } else {
                newMap.put(listPeople[i], 1);
            }
        }
        Map<String, Integer> sortedNameMap = new LinkedHashMap<>();
        int max = 1;
        for (int value : newMap.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : newMap.entrySet()) {
                String key = entry.getKey();
                if (newMap.get(key) == i) {
                    sortedNameMap.put(key, newMap.get(key));
                }
            }
        }
        System.out.println(sortedNameMap);
    }

}
