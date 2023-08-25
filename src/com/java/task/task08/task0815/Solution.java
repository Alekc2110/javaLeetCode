package com.java.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        String l = "Фамилия";
        String f = "Имя";
        for (int i = 0; i < 10; i++) map.put(l+i,f+i);
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        Iterator<HashMap.Entry<String, String>> iterator = map.entrySet().iterator();
        int i = 0;
        while (iterator.hasNext()){
            HashMap.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            if(value.equals(name))
                i++;
            }
        return i;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        Iterator<HashMap.Entry<String, String>> iterator = map.entrySet().iterator();
        int i = 0;
        while (iterator.hasNext()){
            HashMap.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            if(key.equals(lastName))
                i++;
        }
        return i;

    }

    public static void main(String[] args) {

    }
}
