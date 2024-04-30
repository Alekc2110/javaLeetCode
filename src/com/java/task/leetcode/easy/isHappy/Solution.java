package com.java.task.leetcode.easy.isHappy;

/**
 * Write an algorithm to determine if a number n is happy.
 *
 * A happy number is a number defined by the following process:
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay),
 * or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.
 *
 * Example 1:
 * Input: n = 19
 * Output: true
 * Explanation:
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 *
 * Example 2:
 * Input: n = 2
 * Output: false
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(1));
        System.out.println(isHappy(7));
        System.out.println(isHappy(2));
        System.out.println(isHappy(14));
        System.out.println(isHappy(1400));
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = calculateSumOfSquares(slow);
            fast = calculateSumOfSquares(calculateSumOfSquares(fast));

        } while (slow != fast);

        return slow == 1;
    }

    private static int calculateSumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int pref = num % 10;
            sum += pref * pref;
            num = num / 10;
        }
        return sum;
    }
}




