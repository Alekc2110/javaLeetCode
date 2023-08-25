package com.java.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        int m = 0, n = 0;

         n = Integer.parseInt(reader.readLine());
         m = Integer.parseInt(reader.readLine());

        for(int i =0; i<n; i++)
            list.add(reader.readLine());
        for(int i =0; i<m; i++) {
            list.add(list.get(0));
            list.remove(0);
        }
        for(String i : list)
            System.out.println(i);





            }
}
