package com.java.task.task08.task0821;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String, String> map = new HashMap<String, String>();
            map.put("Сидоров", "Иван");
            map.put("Сидоров", "Дима");
            map.put("Петров", "Вася");
            map.put("Ломач", "Вася");
            map.put("Лова", "Петя");
            map.put("Коба", "Таня");
            map.put("Коба", "Катя");
            map.put("Мотя", "Тетя");
            map.put("Митя", "Ваня");
            map.put("Рита", "Гита");


        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
