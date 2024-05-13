package com.java.task.leetcode.easy.summaryRanges;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given a sorted unique integer array nums.
 * A range [a,b] is the set of all integers from a to b (inclusive).
 * Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
 * That is, each element of nums is covered by exactly one of the ranges, and there is no integer x
 * such that x is in one of the ranges but not in nums.
 * <p>
 * Each range [a,b] in the list should be output as:
 * "a->b" if a != b
 * "a" if a == b
 * <p>
 * Example 1:
 * Input: nums = [0,1,2,4,5,7]
 * Output: ["0->2","4->5","7"]
 * Explanation: The ranges are:
 * [0,2] --> "0->2"
 * [4,5] --> "4->5"
 * [7,7] --> "7"
 * <p>
 * Example 2:
 * Input: nums = [0,2,3,4,6,8,9]
 * Output: ["0","2->4","6","8->9"]
 * Explanation: The ranges are:
 * [0,0] --> "0"
 * [2,4] --> "2->4"
 * [6,6] --> "6"
 * [8,9] --> "8->9"
 */
public class Solution {
    public static void main(String[] args) {

//        int[] nums = {0,1,2,3};
        int[] nums = {0, 1, 2, 4, 5, 7}; //output -> ["0->2","4->5","7"]
//        int[] nums = {0,2,3,4,6,8,9}; //output -> ["0","2->4","6","8->9"]
        System.out.println(summaryRanges(nums));
    }

    public static List<String> summaryRanges(int[] nums) {
        ArrayList<String> strings = new ArrayList<>();
        if (nums.length == 0) {
            return strings;
        }
        if (nums.length == 1) {
            strings.add(nums[0] + "");
            return strings;
        }

        for (int currentIndex = 0, startIndex = 0; currentIndex < nums.length - 1; currentIndex++) {
            if (nums[currentIndex + 1] - nums[currentIndex] != 1) {
                if (startIndex == currentIndex) {
                    strings.add(nums[startIndex] + "");
                } else {
                    strings.add(nums[startIndex] + "->" + nums[currentIndex]);
                }
                startIndex = currentIndex + 1;

            }
            // проверить последний элемент в массиве
            if (currentIndex + 1 == nums.length - 1) {
                if (startIndex != currentIndex + 1) {
                    strings.add(nums[startIndex] + "->" + nums[currentIndex + 1]);
                } else {
                    strings.add(nums[startIndex] + "");
                }
            }
        }
        return strings;
    }

    public List<String> summaryRanges1(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0) {
            return list;
        }
        if (nums.length == 1) {
            list.add(nums[0] + "");
            return list;
        }
        for (int i = 0; i < nums.length; i++) {
            int startElement = nums[i];

            while (i + 1 < nums.length && (nums[i + 1] - nums[i]) == 1) {
                i++;
            }
            if (startElement != nums[i]) {
                list.add(startElement + "->" + nums[i]);
            } else {
                list.add(startElement + "");
            }
        }
        return list;
    }
}
