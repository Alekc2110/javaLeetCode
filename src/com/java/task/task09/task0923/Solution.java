package com.java.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String s = read.readLine();
        ArrayList<Character> vowel = new ArrayList<>();
        ArrayList<Character> con = new ArrayList<>();

        Character ch;
        for(int i= 0; i<s.length(); i++){
            ch = s.charAt(i);
            if (isVowel(ch) == true){
                vowel.add(ch);}
            if(ch == ' '){
            continue;}
            if(isVowel(ch)== false)
                con.add(ch);
            }
        for (Character d: vowel)
            System.out.print(d + " ");
        System.out.println();

        for (Character d: con)
            System.out.print(d + " ");


        }



    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}