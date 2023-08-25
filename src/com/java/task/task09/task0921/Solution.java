package com.java.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
       readData();}

    public static void readData() {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<Integer> x = new ArrayList<>();
            try{
            while (true){
                x.add(Integer.parseInt(read.readLine()));
            }
            }
            catch (Exception e){
                for (Integer i: x)
                    System.out.println(i);


                }


        }
        //напишите тут ваш код
    }

