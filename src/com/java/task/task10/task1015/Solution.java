package com.java.task.task10.task1015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
       ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {

        ArrayList<String>[] str = new ArrayList[2];
       str[0]= new ArrayList<>();
       str[1]= new ArrayList<>();
        Collections.addAll(str[0], "Mia");
        Collections.addAll(str[1], "more");


       
        return str;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}