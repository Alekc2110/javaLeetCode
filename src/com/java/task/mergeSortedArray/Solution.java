package com.java.task.mergeSortedArray;


import java.util.Arrays;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 * representing the number of elements in nums1 and nums2 respectively.
 * <p>
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * <p>
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that
 * should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 * Example 1:
 * <p>
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 * Example 2:
 * <p>
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 * Explanation: The arrays we are merging are [1] and [].
 * The result of the merge is [1].
 */
public class Solution {
    public static void main(String[] args) {
//        int[] nums1 = new int[]{1, 2, 3, 3, 0, 0, 0, 0, 0};
//        int m = 4;
//        int[] nums2 = {2, 2, 5, 6, 10};
//        int n = 5;

//        int[] nums1 = new int[]{4, 5, 6, 0, 0, 0};
//        int m = 3;
//        int[] nums2 = {1, 2, 3};
//        int n = 3;

        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        int[] merge = merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(merge));
//        merge1(nums1, m, nums2, n);
//        System.out.println(Arrays.toString(nums1));
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] resultArr = new int[m + n];
        int pointer1 = 0;
        int pointer2 = 0;
        int pointer3 = 0;
        while (pointer1 < m && pointer2 < n) {
            if (nums1[pointer1] <= nums2[pointer2]) {
                resultArr[pointer3] = nums1[pointer1];
                pointer1++;
                pointer3++;
            }
            if (nums1[pointer1] > nums2[pointer2]) {
                resultArr[pointer3] = nums2[pointer2];
                pointer2++;
                pointer3++;
            }

        }

        if (pointer1 < m) {
            System.arraycopy(nums1, pointer1, resultArr, pointer3, m - pointer1);
        }

        if (pointer2 < n) {
            System.arraycopy(nums2, pointer2, resultArr, pointer3, n - pointer2);
        }

        return resultArr;
    }

    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length != m + n) {
          throw new UnsupportedOperationException();
        }

        int pointer1 = m - 1;
        int pointer2 = n - 1;
        int pointer3 = nums1.length - 1;
        while (pointer2 >= 0) {
            if (pointer1 < 0) {
                System.arraycopy(nums2, 0, nums1, 0, pointer2 + 1);
                return;
            } else if ((nums2[pointer2] >= nums1[pointer1])) {
                nums1[pointer3] = nums2[pointer2];
                pointer2--;
                pointer3--;
            } else if ((nums2[pointer2] < nums1[pointer1])) {
                nums1[pointer3] = nums1[pointer1];
                pointer1--;
                pointer3--;
            }
        }

    }
}
