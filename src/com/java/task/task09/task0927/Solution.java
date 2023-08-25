package com.java.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat > cats = new HashMap<>();
        cats.put("vasia", new Cat("1"));
        cats.put("petia", new Cat("2"));
        cats.put("gosha", new Cat("3"));
        cats.put("kis", new Cat("4"));
        cats.put("lis", new Cat("5"));
        cats.put("yes", new Cat("6"));
        cats.put("gav", new Cat("7"));
        cats.put("gad", new Cat("8"));
        cats.put("bad", new Cat("9"));
        cats.put("tom", new Cat("10"));
        return cats;

    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        HashSet<Cat> set = new HashSet<Cat>(map.values());
            return  set;


            }

       public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
