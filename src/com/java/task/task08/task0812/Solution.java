package com.java.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arr = new ArrayList<>();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arr.add(Integer.parseInt(read.readLine()));
        }
        int count = 1;
        int max_count = 1;

        for (int i = 1; i < 10; i++) {
            if (arr.get(i - 1) != arr.get(i))
                count = 1;
            else {
                count++;
                if (count > max_count)
                    max_count = count;
            }
        }

        System.out.println(max_count);
    }
}
