package com.java.task.leetcode.medium.longestConsecutive;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 * You must write an algorithm that runs in O(n) time.
 * <p>
 * Example 1:
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 * <p>
 * Example 2:
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 */
public class Solution {
    public static void main(String[] args) {
//        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));// 4
//        System.out.println(longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));// 9
//        System.out.println(longestConsecutive(new int[]{9,1,4,7,3,-1,0,5,8,-1,6}));// 7

//        System.out.println(longestConsecutive1(new int[]{100, 14, 200, 11, 13, 12, 12}));// 4
//        System.out.println(longestConsecutive1(new int[]{0,3,7,2,5,8,4,6,0,1}));// 9
        System.out.println(longestConsecutive1(new int[]{9,1,4,7,3,-1,0,5,8,-1,6}));// 7

    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        TreeSet<Integer> res = new TreeSet<>();
        for (int i : nums) {
            res.add(i);
        }
        int initSize = res.size();
        Integer prev = res.pollFirst();
        int counter = 1;
        int maxCounter = 0;
        for (int i = 0; i < initSize; i++) {
            Integer cur = res.pollFirst();
            if (cur == null) {
                return Math.max(maxCounter, counter);
            }
            int difference = cur - prev;
            if (difference == 1) {
                counter++;
            } else if (difference > 1) {
                maxCounter = Math.max(maxCounter, counter);
                counter = 1;
            }
            prev = cur;
        }
        return maxCounter;
    }


    public static int longestConsecutive1(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);

        int result = 1;
        int prevCount = 1;
        int currentCount = 1;

        int i = 1;
        while (i < nums.length) {
            while (i < nums.length && nums[i] == nums[i - 1]) {
                currentCount = prevCount;
                i++;
            }
            if (i == nums.length) break;
            if (nums[i] == nums[i - 1] + 1) {
                currentCount = ++prevCount;
            } else {
                prevCount = 1;
            }
            result = Math.max(result, currentCount);
            i++;

        }
        return result;
    }

}
