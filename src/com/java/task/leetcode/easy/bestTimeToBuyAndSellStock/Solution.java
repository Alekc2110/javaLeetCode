package com.java.task.leetcode.easy.bestTimeToBuyAndSellStock;

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different
 * day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * <p>
 * Example 1:
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * <p>
 * Example 2:
 * <p>
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 */
public class Solution {

    public static void main(String[] args) {
//        int[] prices = new int[]{7, 6, 4, 3, 1};
        int[] prices2 = new int[]{7, 3, 5, 1, 7, 4};
        int[] prices3 = new int[]{2, 1, 2, 1, 0, 1, 2};
        System.out.println(maxProfit(prices3));
    }

    public static int maxProfit(int[] prices) {
        int minPrice = prices[0], maxProfit = 0;
        for (int curPrice : prices) {
            if (curPrice < minPrice) {
                minPrice = curPrice;
            }
            maxProfit = Math.max(maxProfit, curPrice - minPrice);
        }
        return maxProfit;
    }

    public static int maxProfit1(int[] prices) {
        int maxSum = 0;

        for (int i = 1; i < prices.length; i++) {
            for (int j = i; j > 0; j--) {
                int sum = prices[i] - prices[j - 1];
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }
}
