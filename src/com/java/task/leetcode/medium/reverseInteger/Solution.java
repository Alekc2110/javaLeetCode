package com.java.task.leetcode.medium.reverseInteger;


/**
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * <p>
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: x = 123
 * Output: 321
 * Example 2:
 * <p>
 * Input: x = -123
 * Output: -321
 * Example 3:
 * <p>
 * Input: x = 120
 * Output: 21
 */
public class Solution {
    public static void main(String[] args) {
//        int x = 123;
//        int x = -123;
//        int x = 120;
        int x = -2147483648;

        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        if(x == Integer.MIN_VALUE){
            return 0;
        }

        int abs = Math.abs(x);
        StringBuilder reversed = new StringBuilder(String.valueOf(abs)).reverse();

        int res = Long.parseLong(reversed.toString()) > Integer.MAX_VALUE ? 0 : Integer.parseInt(reversed.toString());

        return x < 0 ? -res : res;
    }

    public static int reverse1(int x) {
        StringBuilder s = new StringBuilder();
        s.append(Math.abs(x));
        s.reverse();

        if (s.length() >= 10) {
            int c1 = Integer.parseInt(s.substring(0, 5));
            int c2 = Integer.parseInt(s.substring(5, 10));

            if (c1 > 21474 || c2 > 83647) {
                return 0;
            }
        }

        int num = Integer.parseInt(s.toString());

        return (x < 0) ? -num : num;
    }
}
