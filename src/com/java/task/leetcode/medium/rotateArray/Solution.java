package com.java.task.leetcode.medium.rotateArray;


import java.util.Arrays;

/**
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 * <p>
 * Example 1:
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * <p>
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * <p>
 * Example 2:
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 */
public class Solution {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7};
        int[] arr = {-1,-100,3,99};
//        int[] arr = {1,2};
//        int[] arr = {1,2,3};

        rotate1(arr, 7);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] nums, int k) {
        if (k % nums.length == 0) {
            return;
        } else {
           shiftElementsInArray(nums, k);
        }
    }
    private static void shiftElementsInArray(int[] nums, int k){
        int[] tempArr = new int[nums.length];
        int countElementsToLeft = k % nums.length;
        int countElementsToRight = nums.length - countElementsToLeft;
        //копируем во врем. массив элементы для сдвига
        System.arraycopy(nums, nums.length - countElementsToLeft, tempArr, 0, countElementsToLeft);
        //сдвигаем правые элементы влево в nums
        System.arraycopy(nums, 0, nums, nums.length - countElementsToRight, countElementsToRight);
        //из временного массива купируем в nums количество элементов для сдвига
        System.arraycopy(tempArr, 0, nums, 0, countElementsToLeft);
    }

    public static void rotate1(int[] nums, int k) {
        if (k % nums.length == 0) {
            return;
        } else {
            int[] tempArr = new int[nums.length];
            int countElementsToLeft = k % nums.length;
            int countElementsToRight = nums.length - countElementsToLeft;
            //пишем левую часть сдвига во врем. массив
            for (int pointer = nums.length - countElementsToLeft, i = 0; pointer < nums.length; pointer++, i++) {
                tempArr[i] = nums[pointer];
            }
            //пишем правую часть сдвига во врем. массив
            for (int pointer = 0, i = tempArr.length - countElementsToRight; pointer < countElementsToRight; pointer++, i++) {
                tempArr[i] = nums[pointer];
            }
            //переписываем данные из tempArr в nums
            System.arraycopy(tempArr, 0, nums, 0, nums.length);
        }
    }
}
