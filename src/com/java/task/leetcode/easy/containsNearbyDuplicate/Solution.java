package com.java.task.leetcode.easy.containsNearbyDuplicate;

import java.util.HashMap;
import java.util.Map;

/**
 *Given an integer array nums and an integer k, return true if there are two distinct
 * indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
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
        int[] arr1  = {1,2,3,1}; //k = 3, true
        int[] arr2  = {1,0,1,1}; //k = 1, true
        int[] arr3  = {1,2,3,1,2,3}; //k = 2, false
        System.out.println(containsNearbyDuplicate(arr1, 3));
        System.out.println(containsNearbyDuplicate(arr2, 1));
        System.out.println(containsNearbyDuplicate(arr3, 2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                Integer curIndex = map.get(nums[i]);
                    if(Math.abs(curIndex - i) <= k){
                        return true;
                }
            }
                map.put(nums[i], i);
        }
        return false;
    }

}