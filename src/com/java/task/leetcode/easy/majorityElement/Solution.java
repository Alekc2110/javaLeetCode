package com.java.task.leetcode.easy.majorityElement;


import java.util.*;
import java.util.stream.Stream;

/**
 * Given an array nums of size n, return the majority element.
 * <p>
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,2,3]
 * Output: 3
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 */
public class Solution {
    public static void main(String[] args) {
//       int[] arr = {3,2,3};
//       int[] arr = {2,2,1,1,1,2,2};
//        int[] arr = {2, 2, 1, 1, 1, 2, 2, 2,  3, 3,3,3,3,3, 4, 4, 4, 5, 5, 5, 10, 10, 10, 10, 10};
        int[] arr = {-1,100,2,100,100,4,100};
        System.out.println(majorityElement3(arr));
    }

    public static int majorityElement1(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                Integer counter = map.get(num);
                map.put(num, counter + 1);
            } else {
                map.put(num, 1);
            }
        }
        Map.Entry<Integer, Integer> max = map.entrySet()
                .stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .get();
       return max.getKey();
    }

    //??? not working properly
    public static int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }


    //-1, 2, 4, 100, 100, 100, 100

    public static int majorityElement3(int[] nums) {
        Arrays.sort(nums);
        int curElement = nums[0];
        int maxElement = nums[0];
        int counter = 1;
        int maxCounter = 1;

        for (int i = 1; i < nums.length; i++) {
            if (curElement == nums[i]) {
                counter++;
            } else {
                curElement = nums[i];
                counter = 1;
            }
            if(counter > maxCounter){
                maxCounter = counter;
                maxElement = curElement;
            }
        }
        return maxElement;
    }
}


//curElement = nums[i];
//        counter--;
//        if (counter == 0) {
//        if(i + 1 < nums.length){
//        if(nums[i] == nums[i + 1]){
//        {
//        maxElement = nums[i + 1];
//        curElement = nums[i + 1];
//        counter = curMaxCounter;
//        }
//        } else {
//        maxElement = nums[i + 1];
//        }
//        }
//        } else {
//        counter = curMaxCounter;
//        }