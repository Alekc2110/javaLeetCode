package com.java.task.leetcode.medium.jumpGameII;

/**
 * You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
 * Each element nums[i] represents the maximum length of a forward jump from index i. In other words,
 * if you are at nums[i], you can jump to any nums[i + j] where:
 * 0 <= j <= nums[i] and
 * i + j < n
 * Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].
 *
 * Example 1:
 * Input: nums = [2,3,1,1,4]
 * Output: 2
 * Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
 *
 * Example 2:
 * Input: nums = [2,3,0,1,4]
 * Output: 2
 */
public class Solution {

    public static void main(String[] args) {
//        int[] nums = {2,3,1,1,4};// 2
//        int[] nums1 = {1,2};// 1
//        int[] nums2 = {2,3,0,1,4}; // 2
//        int[] nums3 = {0}; // 0
//        int[] nums4 = {1,2,3}; // 2
//        int[] nums5 = {1,2,1,1,1}; // 3
//        int[] nums6 = {10,9,8,7,6,5,4,3,2,1,1,0}; // 2
        int[] nums7 = {9,8,2,2,0,2,2,0,4,1,5,7,9,6,6,0,6,5,0,5}; // 3
//        System.out.println(jump(nums));
//        System.out.println(jump(nums1));
//        System.out.println(jump(nums2));
//        System.out.println(jump(nums3));
//        System.out.println(jump(nums4));
//        System.out.println(jump(nums5));
//        System.out.println(jump(nums6));
        System.out.println(jump(nums7));
    }
    public static int jump(int[] nums) {
        int jumps = 0;
        if (nums.length == 1) return jumps;

        int index = 0;
        while (index < nums.length) {
            int curJump = nums[index];

            int nextJumpIndex = jumpHelper(nums, index + 1, curJump + index);
            jumps++;

            if (nextJumpIndex >= nums.length - 1)
                return jumps;

            index = nextJumpIndex;

        }
        return jumps;
    }
    private static int jumpHelper(int[] nums, int start, int end) {
        if (end >= nums.length - 1)
            return nums.length - 1;

        int nextIndex = start;
        while (start < end) {
            if (nums[nextIndex] + nextIndex >= nums.length - 1) {
                return nextIndex;
            }
            if (nums[nextIndex] + nextIndex <= nums[start + 1] + start + 1) {
                nextIndex = start + 1;
            }
            start++;
        }
        return nextIndex;
    }

    public static int jump2(int[] nums) {
        int jumps = 0, curEnd = 0, curMaxJump = 0;
        for (int index = 0; index < nums.length - 1; index++) {
            curMaxJump = Math.max(curMaxJump, nums[index] + index);
            if (index == curEnd) {
                jumps++;
                curEnd = curMaxJump;
            }
        }
        return jumps;
    }
}
