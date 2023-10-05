package com.java.task.leetcode.easy.sqrt_x;

/**
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
 * <p>
 * You must not use any built-in exponent function or operator.
 * <p>
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: x = 4
 * Output: 2
 * Explanation: The square root of 4 is 2, so we return 2.
 * Example 2:
 * <p>
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 */
public class Solution {

    public static void main(String[] args) {
//        int x = 100;
        int x = 8;
//        int x = 2147395599;
        System.out.println(mySqrt(x));

    }

    public static int mySqrt(int x) {
        int low = 0;
        int high = x;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            long res = (long) middle * middle;
            if (res == x) {
                return middle;
            } else if (res < x) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return low - 1;
    }


}
