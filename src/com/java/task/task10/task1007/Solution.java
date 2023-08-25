package com.java.task.task10.task1007;

/* 
Задача №7 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        long l =  111_1111_111_110L;
        int x =  0b100011001010;
        double m =  1109876546299.12334;
        float f =  l++ + 10 + ++x - (float) m;
        l = (long) f / 1000;
        System.out.println(x);
    }
}