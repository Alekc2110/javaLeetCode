package com.java.task.leetcode.medium.canJump;

/**
 * You are given an integer array nums. You are initially positioned at the array's first index,
 * and each element in the array represents your maximum jump length at that position.
 * <p>
 * Return true if you can reach the last index, or false otherwise.
 * <p>
 * Example 1:
 * Input: nums = [2,3,1,1,4]
 * Output: true
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * <p>
 * Example 2:
 * Input: nums = [3,2,1,0,4]
 * Output: false
 * Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 */
public class Solution {
    public static void main(String[] args) {
//        int[] nums = {0}; //true
//        int[] nums = {0, 1}; //false
          int[] nums = {3, 1, 0, 4, 3}; //true
//        int[] nums = {2, 3, 1, 1, 4}; //true
//        int[] nums = {4,0,4,2,2,0,1,3,3,0,3}; //true
//        int[] nums = {2, 0, 0}; //true
//        int[] nums = {1,1,2,2,0,1,1}; //true
//        int[] nums = {3,2,1,0,4}; //false
//        int[] nums = {4,0,4,2,2,0,1,3,3,0,3}; //true

        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        int canReachIndex = 0;
        for(int index = 0; index < nums.length; index++) {
            if(canReachIndex >= nums.length - 1) return true;
            if(index > canReachIndex) return false;
            canReachIndex = Math.max(canReachIndex, index + nums[index]);
        }
        return true;
    }

}

