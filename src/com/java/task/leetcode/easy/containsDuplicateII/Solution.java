package com.java.task.leetcode.easy.containsDuplicateII;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer array nums and an integer k,
 * return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 *
 * Example 1:
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 *
 * Example 2:
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 *
 * Example 3:
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 */
public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        int k = 3;

//        int[] arr = {1,0,1,1};
//        int k = 1;

//        int[] arr = {1,2,3,1,2,3};
//        int k = 2;
        System.out.println(containsNearbyDuplicate(arr, k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
          //<Value, Index>
       Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(map.get(nums[i]) - i) <= k) return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

    public static boolean containsNearbyDuplicate2(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= i + 1; j--) {
                if(nums[i] == nums[j] && Math.abs(i-j) <=k) return true;
            }
        }
        return false;
    }
}
