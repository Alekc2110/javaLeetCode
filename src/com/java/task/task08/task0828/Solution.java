package com.java.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String m = reader.readLine();
       LinkedList<String> year = new LinkedList<>();
       year.add(0, "January");
       year.add(1, "Fabuary");
       year.add(2, "Marth");
       year.add(3, "April");
       year.add(4, "May");
       year.add(5, "June");
       year.add(6, "July");
       year.add(7, "August");
       year.add(8, "Ceptember");
       year.add(9, "October");
       year.add(10, "November");
       year.add(11, "December");
       int index = year.indexOf(m);
          System.out.println(m + " is " + (index+1) + " month");

        }

    }

