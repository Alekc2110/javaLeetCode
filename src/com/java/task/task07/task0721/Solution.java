package com.java.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;


        int[] mass = new int[20];
        for(int i = 0; i<20;i++) {
            mass[i] = Integer.parseInt(reader.readLine());
        }
        int max = mass[0];
        for(int i = 1; i<mass.length;i++){
            if(mass[i] > max)
                 max = mass[i] ;}
                 maximum = max;
        minimum = mass[0];
        for(int i = 1; i<mass.length;i++){
            if(mass[i] < minimum)
                minimum = mass[i] ;}







        System.out.println(maximum);
        System.out.println(minimum);


    }
}
