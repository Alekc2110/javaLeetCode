package com.java.task.task04.task0411;

/* 
Времена года на Терре
*/



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private static List<Object> objects = new ArrayList<>();
    final static byte[] bytes = new byte[10];

    public static void main(String[] args) {

        new Some(1L);
        addValue(111,"dsd", 225L, bytes);
//        new Some().run();  *** run() -> protected in base class !not working
//        System.out.println(new BaseModel(1L, "sd", "s"));
//        checkSeason(12);
//        checkSeason(4);
//        checkSeason(7);
//        checkSeason(10);
        objects.remove(0);
        objects.remove(bytes);
        objects.remove("dsd");
        System.out.println(objects.size());

    }

   static void addValue(Object... obj){
       objects.addAll(Arrays.asList(obj));
    }

    public static void checkSeason(int month) {
        //::CODE:
    }
}