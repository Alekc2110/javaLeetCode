package com.java.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner inn = new Scanner(System.in);
       ArrayList<Integer> sum = new ArrayList<>();
        int num =0;
        while (true){
            if(num!=-1){
                num = inn.nextInt();
            sum.add(num);}
            else
                break;}
         double sum1 = 0;
        for (double i : sum)
              { sum1 += i;}

        System.out.println((sum1 +1)/(sum.size()-1));

    }
 }


