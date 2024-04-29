package com.java.task.leetcode.easy.isHappy;

/**
 *
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




