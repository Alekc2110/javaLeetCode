package com.java.task.leetcode.medium._3sum;

import java.util.*;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
 * such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * Notice that the solution set must not contain duplicate triplets.
 * <p>
 * Example 1:
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * Notice that the order of the output and the order of the triplets does not matter.
 * <p>
 * Example 2:
 * Input: nums = [0,1,1]
 * Output: []
 * Explanation: The only possible triplet does not sum up to 0.
 * <p>
 * Example 3:
 * Input: nums = [0,0,0]
 * Output: [[0,0,0]]
 * Explanation: The only possible triplet sums up to 0.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4})); //  [[-1,-1,2],[-1,0,1]]
        System.out.println(threeSum(new int[]{0, 1, 1})); //  []
        System.out.println(threeSum(new int[]{0, 0, 0})); //  [[0,0,0]]
        System.out.println(threeSum(new int[]{0, 0, 0, 0})); //  [[0,0,0]]
        System.out.println(threeSum(new int[]{-1, 0, 1, 0})); //  [[-1,0,1]]

    }

    private static List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) return List.of();
        Set<List<Integer>> result  = new HashSet<>();
        int pointer1 = 0;
        Arrays.sort(nums);
        while (pointer1 < nums.length - 2) {
            int pointer2 = pointer1 + 1;
            int pointer3 = nums.length - 1;
            while (pointer2 < pointer3) {
                int sum = nums[pointer1] + nums[pointer2] + nums[pointer3];
                if (sum == 0) {
                    result.add(List.of(nums[pointer1], nums[pointer2], nums[pointer3]));
                    pointer2++;
                    pointer3--;
                } else if (sum < 0) {
                    pointer2++;
                } else {
                    pointer3--;
                }
            }
            pointer1++;

        }
        return new ArrayList<>(result);
    }

}
