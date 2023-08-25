package com.java.task.leetcode.easy.arrayContainsDuplicate;


import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Given an integer array nums, return true if any value
 * appears at least twice in the array, and return false if every element is distinct.
 * <p>
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: false
 */
public class Solution {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 1};
        int[] nums = {1, 2, 3, 4};
        System.out.println(containsDuplicate2(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return nums.length != set.size();
    }

    public static boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
