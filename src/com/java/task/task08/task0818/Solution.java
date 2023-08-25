package com.java.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> sall = new HashMap<>();
        sall.put("Иванов", 1000);
        sall.put("Петров", 500);
        sall.put("Сидоров", 1500);
        sall.put("Потап", 400);
        sall.put("Настя", 200);
        sall.put("Ястребович", 2000);
        sall.put("Якубович", 2000);
        sall.put("Миров", 150);
        sall.put("Вицин", 1500);
        sall.put("Ицин", 1800);
        return sall;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Integer> pair = iter.next();
            Integer value = pair.getValue();
            if (value < 500)
                iter.remove();
        }
    }

    public static void main(String[] args) {

    }
}