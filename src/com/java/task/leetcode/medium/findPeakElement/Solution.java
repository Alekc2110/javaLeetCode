package com.java.task.leetcode.medium.findPeakElement;

/**
 * A peak element is an element that is strictly greater than its neighbors.
 * Given a 0-indexed integer array nums, find a peak element, and return its INDEX.
 * If the array contains multiple peaks, return the index to any of the peaks.
 * You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered
 * to be strictly greater than a neighbor that is outside the array.
 * <p>
 * You must write an algorithm that runs in O(log n) time.
 * <p>
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: 2
 * Explanation: 3 is a peak element and your function should return the index number 2.
 * <p>
 * Example 2:
 * Input: nums = [1,2,1,3,5,6,4]
 * Output: 5
 * Explanation: Your function can return either index number 1 where the peak element is 2,
 * or index number 5 where the peak element is 6.
 */
public class Solution {
    public static void main(String[] args) {
      int[]arr = {1,2,3,1}; // should return index 2
//      int[]arr = {2, 1};
//        int[] arr = {2, 1, 2, 3, 4, 5};
//      int[]arr = {1,2,1,3,5,6,4}; // should return index 1 or 5
        System.out.println(findPeakElement1(arr));

//        getPrintStars(5);
//        getPrintRhombus(5);
//        getPrintLibras(5);
//        getPrintSquare(7);
        getPrintPrettySquare(4);
    }


//        4 4 4 4 4 4 4 4 4
//        4 3 3 3 3 3 3 3 4
//        4 3 2 2 2 2 2 3 4
//        4 3 2 1 1 1 2 3 4
//        4 3 2 1 0 1 2 3 4
//        4 3 2 1 1 1 2 3 4
//        4 3 2 2 2 2 2 3 4
//        4 3 3 3 3 3 3 3 4
//        4 4 4 4 4 4 4 4 4
    private static void getPrintPrettySquare(int n) {
        int originalN = n;
        n = 2 * n;

        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                 int atEveryIndex = originalN - Math.min(Math.min(col, row), Math.min(n - row, n - col)); //определяем мин координаты точки от краев матрицы
                System.out.print(atEveryIndex + " ");

            }
            System.out.println();
        }
    }

//            4 4 4 4 4 4 4 4 4
//            4 3 3 3 3 3 3 3 4
//            4 2 2 2 2 2 2 2 4
//            4 1 1 1 1 1 1 1 4
//            4 2 2 2 2 2 2 2 4
//            4 3 3 3 3 3 3 3 4
//            4 4 4 4 4 4 4 4 4
    private static void getPrintSquare(int n) {
        int number = 4;
        for (int row = 0; row <= n/2; row++) {
            System.out.print(number + " ");
            for (int col = 1; col <= n; col++) {
                System.out.print(number - row + " ");
            }
            System.out.print(number);
            System.out.println();

        }
        for (int row = 1; row <= n/2; row++) {
            System.out.print(number + " ");
            for (int col = 1; col <= n; col++) {
                System.out.print(row + 1 + " ");
            }
            System.out.print(number);
            System.out.println();

        }
    }

//           * * * * *
//            * * * *
//             * * *
//              * *
//               *
//               *
//              * *
//             * * *
//            * * * *
//           * * * * *
    public static void getPrintLibras(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//                 *
//                * *
//               * * *
//              * * * *
//             * * * * *
//              * * * *
//               * * *
//                * *
//                 *
    public static void getPrintRhombus(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void getPrintStars(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int searched = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                searched = i + 1;
            } else {
                return searched;
            }
        }

        return nums.length - 1;
    }

    public static int findPeakElement1(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        if (nums.length == 2 && nums[1] < nums[0]) {
            return 0;
        }
        int middleIndex = nums.length / 2;
        return findPeakElementHelper(nums, middleIndex);
    }

    private static int findPeakElementHelper(int[] nums, int index) {
        if (index <= 0) {
            return 0;
        }
        if (index >= nums.length - 1) {
            return nums.length - 1;
        }
        if (nums[index] > nums[index - 1] && nums[index] < nums[index + 1]) {
            return findPeakElementHelper(nums, index + 1);
        } else if (nums[index] < nums[index - 1] && nums[index] > nums[index + 1]) {
            return findPeakElementHelper(nums, index - 1);
        } else if (nums[index] < nums[index - 1] && nums[index] < nums[index + 1]) {
            return findPeakElementHelper(nums, index - 1);
        }
        return index;
    }
}
