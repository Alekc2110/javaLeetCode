package com.java.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int x, c=0;
        String word;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            word = in.readLine();
            if(word.equals("сумма"))
                break;
            x = Integer.parseInt(word);
            c+= x;

                    }
        System.out.println(c);
    }
}
