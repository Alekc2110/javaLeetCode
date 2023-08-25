package com.java.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();
    }

    public static int getStackTraceDeep() {
        StackTraceElement[] elem = Thread.currentThread().getStackTrace();
        int x = elem.length;
        System.out.println(x);
        return  x;
    }
}

