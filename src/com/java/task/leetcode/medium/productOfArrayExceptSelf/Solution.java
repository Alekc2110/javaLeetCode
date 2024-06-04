package com.java.task.leetcode.medium.productOfArrayExceptSelf;

import java.util.*;

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums
 * except nums[i].
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * <p>
 * Example 1:
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * <p>
 * Example 2:
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 */

public class Solution {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {-1, 1, 0, -3, 3};
        int[] arr3 = {0, 1, 1, -3, 3};
        int[] arr4 = {0, 2, 3, 4};
        int[] arr5 = {0, 4, 0};

//        System.out.println(Arrays.toString(productExceptSelf1(arr1)));
//        System.out.println(Arrays.toString(productExceptSelf1(arr2)));
//        System.out.println(Arrays.toString(productExceptSelf1(arr3)));
//        System.out.println(Arrays.toString(productExceptSelf1(arr4)));
//        System.out.println(Arrays.toString(productExceptSelf1(arr5)));
//        System.out.println("**************************************");

        System.out.println(Arrays.toString(productExceptSelf2(arr1)));
        System.out.println(Arrays.toString(productExceptSelf2(arr2)));
        System.out.println(Arrays.toString(productExceptSelf2(arr3)));
        System.out.println(Arrays.toString(productExceptSelf2(arr4)));
        System.out.println(Arrays.toString(productExceptSelf2(arr5)));
    }

    public static int[] productExceptSelf1(int[] nums) {
        // The length of the input array
        int length = nums.length;

        // Final answer array to be returned
        int[] resultArr = new int[length];

        // answer[i] contains the multiplyResult of all the elements to the left
        // Note: for the element at index '0', there are no elements to the left,
        // so the answer[0] would be 1
        resultArr[0] = 1;
        for (int i = 1; i < length; i++) {

            // answer[i - 1] already contains the multiplyResult of elements to the left of 'i - 1'
            // Simply multiplying it with nums[i - 1] would give the product of all
            // elements to the left of index 'i'
            resultArr[i] = nums[i - 1] * resultArr[i - 1];
        }

        // R contains the multiplyResult of all the elements to the right
        // Note: for the element at index 'length - 1', there are no elements to the right,
        // so the R would be 1
        int R = 1;
        for (int i = length - 1; i >= 0; i--) {

            // For the index 'i', R would contain the
            // multiplyResult of all elements to the right. We update R accordingly
            resultArr[i] = resultArr[i] * R;
            R *= nums[i];
        }

        return resultArr;
    }

    public static int[] productExceptSelf2(int[] nums) {
        List<Integer> list = new ArrayList<>(); // key -> index for 0
        int[] resultArr = new int[nums.length];

        int curMultiply = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            if (curMultiply == 0) {
                list.add(0);
                curMultiply = nums[i + 1];
            }
            else if (nums[i + 1] == 0) {
                list.add(i + 1);
            }
            else {
                curMultiply = curMultiply * nums[i + 1];
            }
        }
            if (list.size() > 1) {
                return resultArr;
            } else if (list.size() == 1) {
                int index = list.get(0);
                resultArr[index] = curMultiply;
                return resultArr;
            } else {
                for (int i = 0; i < nums.length; i++) {
                    resultArr[i] = curMultiply / nums[i];
                }
            }
            return resultArr;
        }

    }
