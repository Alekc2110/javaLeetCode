package com.java.task.leetcode.medium.kthLargestElementInArray;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Given an integer array nums and an integer k, return the kth largest element in the array.
 * <p>
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,2,1,5,6,4], k = 2
 * Output: 5
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
 * Output: 4
 */
public class Solution {
    public static void main(String[] args) {
//        int[] nums = {3, 2, 1, 5, 6, 4};
//        int k = 2;

        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(findKthLargest2(nums, k));
    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    /**
     * Quick Select Algorithm
     *
     * @param nums
     * @param k
     * @return int - kth largest value in array
     */
    public static int findKthLargest1(int[] nums, int k) {
        int start = 0;
        int end = nums.length - 1;
        int index = nums.length - k;
        while (start < end) {
            int pivotIndex = partition(nums, start, end);
            if (pivotIndex < index) start = pivotIndex + 1;
            else if (pivotIndex > index) end = pivotIndex - 1;
            else return nums[pivotIndex];
        }
        return nums[start];
    }

    private static int partition(int[] nums, int start, int end) {
        int pivot = start;
        int temp;
        while (start <= end) {
            while (start <= end && nums[start] <= nums[pivot]) start++;
            while (start <= end && nums[end] > nums[pivot]) end--;

            if (start > end) break;

            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
        temp = nums[end];
        nums[end] = nums[pivot];
        nums[pivot] = temp;
        return end;
    }

    public static int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int integer : nums) {
            pq.add(integer);
        }

        System.out.println(pq);
        while (k > 1) {
            pq.poll();
            --k;
        }
        return pq.poll();
    }


}
