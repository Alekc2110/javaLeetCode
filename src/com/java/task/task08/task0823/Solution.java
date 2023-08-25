package com.java.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] ch = s.toCharArray();
        try {
            for (int i = 0; i < ch.length; i++) {
                if(Character.isDigit(ch[i])){
                        continue;}
                 if(Character.isSpaceChar(ch[i]))
                     continue;
                 if (i == 0 && Character.isLetter(ch[i])){
                    ch[i] = Character.toUpperCase(ch[i]);}
                else if (Character.isSpaceChar(ch[i - 1]) && Character.isLetter(ch[i])){
                    ch[i] = Character.toUpperCase(ch[i]);}

            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вы ввели число!");

        }


            String x = String.copyValueOf(ch);
            System.out.println(x);
        }
    }

