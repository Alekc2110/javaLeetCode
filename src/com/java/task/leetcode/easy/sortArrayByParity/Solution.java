package com.java.task.leetcode.easy.sortArrayByParity;

import java.util.Arrays;

/**
 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
 * <p>
 * Return any array that satisfies this condition.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,1,2,4]
 * Output: [2,4,3,1]
 * Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 * Example 2:
 * <p>
 * Input: nums = [0]
 * Output: [0]
 */
public class Solution {
    public static void main(String[] args) {
//        int[] nums = {3,1,2,4};
        int[] nums = {0};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));

    }

    public static int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];

        int evenPointer = 0;
        int oddPointer = res.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                res[evenPointer] = num;
                evenPointer++;
            } else {
                res[oddPointer] = num;
                oddPointer--;
            }
        }

        return res;
    }

    public static int[] sortArrayByParity2(int[] nums) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        while (leftPointer < rightPointer) {
            int evenRight = Integer.MIN_VALUE;
            int oddLeft = Integer.MIN_VALUE;
            if (nums[leftPointer] % 2 != 0) {
                oddLeft = nums[leftPointer];
            }
            if (nums[rightPointer] % 2 == 0) {
                evenRight = nums[rightPointer];
            }

            if (oddLeft == Integer.MIN_VALUE && evenRight != Integer.MIN_VALUE) {
                leftPointer++;
                continue;
            } else if (oddLeft != Integer.MIN_VALUE && evenRight == Integer.MIN_VALUE) {
                rightPointer--;
                continue;
            } else if (oddLeft != Integer.MIN_VALUE) {
                nums[leftPointer] = evenRight;
                nums[rightPointer] = oddLeft;
            }
            leftPointer++;
            rightPointer--;

        }
        return nums;
    }
}
