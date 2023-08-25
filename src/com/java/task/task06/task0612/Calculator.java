package com.java.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        int c = a + b;
        return c;
    }

    public static int minus(int a, int b) {
        int c = a - b;
        return c;
    }

    public static int multiply(int a, int b) {
        int c  = a * b;
        return c;
    }

    public static double division(int a, int b) {

        return ((double)a)/(double)b;
    }

    public static double percent(int a, int b) {
        double c = (b*a)/100;
        return c;
    }

    public static void main(String[] args) {

    }
}