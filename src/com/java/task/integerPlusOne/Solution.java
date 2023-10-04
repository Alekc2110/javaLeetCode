package com.java.task.integerPlusOne;

import java.util.Arrays;

/**
 * Given integer as an array of numbers. Task is to increment integer and return it as array.
 */
public class Solution {

    public static void main(String[] args) {
        int[] arr = {1, 0, 9};
//        int[] arr = {2,1,0,9};
//        int[] arr = {9, 9, 9, 9};
//        int[] arr = {9, 9, 8, 9};
//        int[] arr = {1,0,1};
//        int[] arr = {9};

        System.out.println(Arrays.toString(plusOne(arr)));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                if (i == 0) {                        //check -> when 9 is the first element of array -> create new arr + 1 el and set arr[0] -> 1 and continue loop
                    digits = new int[digits.length + 1];
                    digits[i] = 1;
                }
                else {                               //if 9 is not the first el in arr -> set it to 0 and continue loop
                    digits[i] = 0;
                }

            } else {                                  // if it`s not 9 -> increment current number and return array
                digits[i]+= 1;
                return digits;
            }
        }
        return digits;
    }
}