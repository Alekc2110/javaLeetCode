package com.java.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for(int i =0; i<10; i++)
            list.add(read.readLine());
        String s = list.get(0);
        for (int i=1; i<list.size();i++){
            if(s.length()<list.get(i).length()) s = list.get(i);
            else{
                System.out.println(i);
                break;
            }

        }

    }
}

