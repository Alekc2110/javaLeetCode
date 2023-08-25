package com.java.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        ArrayList<Integer> data = new ArrayList<>();
        ArrayList<String> word  = new ArrayList<>();
        for(int i = 0; i< array.length; i++) {
            if (isNumber(array[i]) == true)
                data.add(Integer.parseInt(array[i]));
            else
                word.add(array[i]);
        }
        for(int i = 0; i<data.size(); i++)
            for (int j = i+1; j<data.size();j++)
                if(data.get(i)<data.get(j)){
            int temp = data.get(i);
            data.set(i, data.get(j));
            data.set(j, temp);
            }
        for (int i = 0; i < word.size(); i++)
            for (int j = i + 1; j < word.size(); j++)
                if (isGreaterThan(word.get(i), (word.get(j)))) {
                    String tmp = word.get(i);
                    word.set(i, word.get(j));
                    word.set(j, tmp);
                }
         int x = 0, y = 0;
                for (int i =0; i<array.length; i++) {
                    if(isNumber(array[i])){
                        array[i]= data.get(x).toString();
                    x++;}
                    else{
                        array[i] = word.get(y);
                    y++;}
                }

    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
