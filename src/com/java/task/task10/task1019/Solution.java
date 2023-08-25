package com.java.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> xxx = new HashMap<>();


        while (true) {
            try {
                int id = Integer.parseInt(reader.readLine());
               String name = reader.readLine();
                xxx.put(name, id);
            } catch (NumberFormatException e) {
                break;
            }
        }

        for (Map.Entry<String, Integer> pair : xxx.entrySet())
            System.out.println(pair.getValue() + " " + pair.getKey());
    }
}

