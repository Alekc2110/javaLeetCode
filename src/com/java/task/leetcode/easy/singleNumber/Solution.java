package com.java.task.leetcode.easy.singleNumber;


import java.util.Arrays;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * <p>
 * Example 1:
 * Input: nums = [2,2,1]
 * Output: 1
 * <p>
 * Example 2:
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * <p>
 * Example 3:
 * Input: nums = [1]
 * Output: 1
 */
public class Solution {


    public static void main(String[] args) {
//        int[] arr = {3, 2, 3};
       int[] arr = {-4,1,2,1,2};

        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i+=2) {
            if(nums[i] != nums[i + 1])
              return nums[i];
        }
        return nums[nums.length - 1];
    }

    public static int singleNumber2(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res = res ^ num;
        }
        return res;
    }
}
