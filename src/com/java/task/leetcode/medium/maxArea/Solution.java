package com.java.task.leetcode.medium.maxArea;

/**
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of
 * the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * Return the maximum amount of water a container can store. *
 * Notice that you may not slant the container.
 *
 * Example 1:
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section)
 * the container can contain is 49.
 *
 * Example 2:
 * Input: height = [1,1]
 * Output: 1
 */
public class Solution {

    public static void main(String[] args) {

        int[] height = {1,8,6,2,5,4,8,3,7};
        int[] height1 = {1,1};
        int[] height2 = {1,2,4,3};
        int[] height3 = {1,3,2,5,25,24,5};
        int[] height4 = {1,8,100,2,100,4,8,3,7}; //200

        System.out.println(maxArea(height));
        System.out.println(maxArea(height1));
        System.out.println(maxArea(height2));
        System.out.println(maxArea(height3));
        System.out.println(maxArea(height4));

        System.out.println();

//        System.out.println(maxArea1(height));
//        System.out.println(maxArea1(height1));
//        System.out.println(maxArea1(height2));
//        System.out.println(maxArea1(height3));
//        System.out.println(maxArea1(height4));

    }

    public static int maxArea(int[] height) {
       int leftPointer = 0;
       int rightPointer = height.length - 1;
       int leftEL = height[leftPointer];
       int rightEL = height[rightPointer];

       int maxArea = 0;
       while (leftPointer < rightPointer){
           int curArea = сalcArea(leftPointer, rightPointer, leftEL, rightEL);
           maxArea = Math.max(curArea, maxArea);
          if(height[leftPointer] <= height[rightPointer]){
              leftPointer++;
              leftEL = height[leftPointer];

          } else {
              rightPointer--;
              rightEL = height[rightPointer];
          }
       }
        return maxArea;
    }

    private static int сalcArea(int leftPointer, int rightPointer, int leftEL, int rightEL) {
        return Math.min(leftEL, rightEL) * (rightPointer - leftPointer);
    }

    public static int maxArea1(int[] height) {
        int maxArea = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = height.length - 1; j > 0; j--) {
                int leftEL = height[i];
                int rightEL = height[j];
                int curArea = Math.min(leftEL, rightEL) * (j - i);
                maxArea = Math.max(curArea, maxArea);
            }
        }
        return maxArea;
    }


}
