package com.java.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++)
            list.add(read.readLine());
            String min = list.get(0);
            String max = list.get(0);
            int maxm = 0;
            int minm = 0;
            for (int j = 1; j < list.size(); j++) {
                if ( min.length() > list.get(j).length()) {
                    min = list.get(j);
                    minm = j;
                }
                if (max.length() < list.get(j).length() ) {
                    max = list.get(j);
                    maxm = j;
                }
            }
            if(maxm < minm)
                System.out.println(max);
            else if(minm < maxm)
                System.out.println(min);



    }
}
