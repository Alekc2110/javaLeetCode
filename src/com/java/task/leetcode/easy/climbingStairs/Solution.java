package com.java.task.leetcode.easy.climbingStairs;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Example 1:
 *
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 *
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */
public class Solution {
    public static void main(String[] args) {
//        System.out.println(climbStairs(10));
        System.out.println(myVarClimbingStairs(10));
    }

    //1st recursive approach
//    public static int climbStairs(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        int oneStep = climbStairs(n-1);
//        int twinStep = climbStairs(n - 2);
//        int res = oneStep + twinStep;
//        return res;
//    }


    //2nd approach using map for memorizing result
//    public static int climbStairs(int n) {
//        Map<Integer, Integer> memo = new HashMap<>();
//        return climbStairs(n, memo);
//    }
//
//    private static int climbStairs(int n, Map<Integer, Integer> memo) {
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        if (!memo.containsKey(n)) {
//            memo.put(n, climbStairs(n-1, memo) + climbStairs(n-2, memo));
//        }
//        return memo.get(n);
//    }

    //3rd approach using array
//    public static int climbStairs(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//
//        int[] dp = new int[n];
//        dp[0] = 1; dp[1] = 2;
//
//        for (int i = 2; i < n; i++) {
//            int i1 = dp[i - 1];
//            int i2 = dp[i - 2];
//            dp[i] = i1 + i2;
//        }
//        return dp[n -1];
//    }

    public static int myVarClimbingStairs(int n){
        int a = 0;
        int b = 1;
        int count = 0;

        if (n <= 1)
            return n;

        int result = 0;
        while (count != n) {
            result = a + b;
            a = b;
            b = result;

            count++;
        }

        return result;

    }

}
//[1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]
