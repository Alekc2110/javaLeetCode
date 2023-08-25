package com.java.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        int st = 0;
        int end = 47;
        int i = 0;
        while (i<40){
            char[] buf = new char[end-st];
            s.getChars(st,end,buf,0);
            System.out.println(buf);
            st++;
            i++;

        }
               }



    }


