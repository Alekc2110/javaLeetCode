package com.java.task.leetcode.easy.searchInsertPosition;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 * <p>
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Example 3:
 * <p>
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 */
public class Solution {
    public static void main(String[] args) {
//        int[] source = {1, 2, 4, 6, 7, 8};
        int[] source = {1,3,5,6};
//        int[] source = {1};
        System.out.println(searchInsert(source, 4));
    }

    public static int searchInsert(int[] nums, int target) {
        for (int n = 0; n < nums.length; n++) {
            if (nums[n] == target || nums[n] > target) {
                return n;
            }
        }
        return nums.length;
    }

    public static int searchInsert2(int[] nums, int target) {
        return divideArr(nums, 0, nums.length, target);
    }

    private static int divideArr(int[] arr, int startPosition, int endPosition, int target) {
        int start = startPosition;
        int end  = endPosition;

        int middleIndex = start + (end - start) / 2;
        if (end - start == 1) {
            if(target <= arr[middleIndex]){
                return middleIndex;
            }
           return middleIndex + 1;
        }

        if (target < arr[middleIndex]) {
            return divideArr(arr, start, middleIndex, target);
        } else if (target > arr[middleIndex]) {
            return divideArr(arr, middleIndex, end, target);
        } else {
            return middleIndex;
        }

    }

}
