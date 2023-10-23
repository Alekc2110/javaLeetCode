package com.java.task.leetcode.medium.sortColors;

import java.util.Arrays;

/**
 * Given an array nums with n objects colored red, white, or blue,
 * sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white,
 * and blue.
 * <p>
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 * <p>
 * You must solve this problem without using the library's sort function.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * Example 2:
 * <p>
 * Input: nums = [2,0,1]
 * Output: [0,1,2]
 * <p>
 * Constraints:
 * n == nums.length
 * 1 <= n <= 300
 * nums[i] is either 0, 1, or 2.
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int highIn = nums.length - 1;
        int lowIn = 0;
        int currentIn = 0;

        while (currentIn <= highIn) {
            if (nums[currentIn] == 0) {
                int temp = nums[currentIn];
                nums[currentIn] = nums[lowIn];
                nums[lowIn] = temp;
                lowIn++;
                currentIn++;
            } else if (nums[currentIn] == 1) {
                currentIn++;
            } else {
                int temp = nums[currentIn];
                nums[currentIn] = nums[highIn];
                nums[highIn] = temp;
                highIn--;
            }
        }
    }
}
