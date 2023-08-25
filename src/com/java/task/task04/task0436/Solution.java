package com.java.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.util.Scanner;


public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(8);
            }
            System.out.println();
        }
    }
}




