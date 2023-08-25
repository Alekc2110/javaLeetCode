package com.java.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Совершенствуем функциональность
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

       int min = min(a,b,c,d,e);
        System.out.println("Minimum = " + min);
    }


    public static int min(int a,int b ,int c ,int d ,int e) {
        ArrayList<Integer> y = new ArrayList<>();
        Collections.addAll(y, a,b,c,d,e);
        Collections.sort(y);
        return y.get(0);
    }
}
