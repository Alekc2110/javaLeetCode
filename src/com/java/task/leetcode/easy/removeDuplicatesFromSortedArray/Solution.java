package com.java.task.leetcode.easy.removeDuplicatesFromSortedArray;

import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order,
 * remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 * Change the array nums such that the first k elements of nums contain the unique elements in the order
 * they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 * Example:
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] arr) {
        /* create new array with unique elements*/
//        List<Integer> integers = Arrays.stream(arr).boxed().toList();
//        Set<Integer> set = new LinkedHashSet<>(integers);
//        arr = set.stream().mapToInt(Integer::intValue).toArray();
//        System.out.println(Arrays.toString(arr));
//        return arr.length;
        //***

        int pointer = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[pointer] != arr[j]) {
                arr[pointer + 1] = arr[j];
                pointer++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return pointer + 1;

    }

    public static int removeDuplicates2(int[] arr) {
        if (arr.length == 0)
            return 0;

        int pointer = 1;                           //index that unique characters will be inserted at

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {             //if true, num[i + 1] is a new unique number
                arr[pointer] = arr[i + 1] /*unique element*/;
                pointer++;
            }
        }
        return pointer;
    }


}
