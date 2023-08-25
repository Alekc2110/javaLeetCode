package com.java.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date(1983, 1, 2));
        map.put("Gibson", new Date(1984, 2,23));
        map.put("Medvedev", new Date(1985, 3,2));
        map.put("Chapaev", new Date(1986, 4,10));
        map.put("Noris", new Date(1987, 5,11));
        map.put("Chan", new Date(1988, 6,12));
        map.put("Uilis", new Date(1989, 2,13));
        map.put("Shvarsneger", new Date(1984, 6,15));
        map.put("Lungren", new Date(1985, 7,17));
        map.put("Rodriges", new Date(1986, 9,28));
        return map;

        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8) iterator.remove();


        }
    }

    public static void main(String[] args) {

    }
}
