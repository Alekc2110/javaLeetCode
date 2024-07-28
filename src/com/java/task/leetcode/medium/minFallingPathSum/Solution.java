package com.java.task.leetcode.medium.minFallingPathSum;


/**
 * Given an n x n array of integers matrix, return the minimum sum of any falling path through matrix.
 * A falling path starts at any element in the first row and chooses the element in the next row that is either
 * directly below or diagonally left/right. Specifically, the next element from position (row, col)
 * will be (row + 1, col - 1), (row + 1, col), or (row + 1, col + 1).
 * <p>
 * Example 1:
 * Input: matrix = [[2,1,3],[6,5,4],[7,8,9]]
 * Output: 13
 * Explanation: There are two falling paths with a minimum sum as shown.
 * <p>
 * Example 2:
 * Input: matrix = [[-19,57],[-40,-5]]
 * Output: -59
 * Explanation: The falling path with a minimum sum is shown.
 */
public class Solution {
    public static void main(String[] args) {
        int[][] matrix = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
//        int[][] matrix1 = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};

        System.out.println(minFallingPathSum(matrix));
//        System.out.println(minFallingPathSum1(matrix1));

    }

    public static int minFallingPathSum(int[][] matrix) {
        int size = matrix[0].length;
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int min = matrix[i - 1][j];
                if (j != 0) {
                    min = Math.min(matrix[i - 1][j - 1], min);
                }
                if (j < size - 1) {
                    min = Math.min(matrix[i - 1][j + 1], min);
                }
                matrix[i][j] = matrix[i][j] + min;
            }

        }
        int min = matrix[size - 1][0];
        for (int i = 1; i < size; i++) {
            min = Math.min(matrix[size - 1][i], min);
        }
        return min;
    }

    public static int minFallingPathSum1(int[][] matrix) {
        int matrixLength = matrix.length, matrixRowLength = -1, min;
        if (matrixLength > 0) matrixRowLength = matrix[0].length;
        for (int i = matrixLength - 2; i >= 0; i--) {
            for (int j = 0; j < matrixRowLength; j++) {
                min = matrix[i + 1][j];
                if (j > 0){
                    min = Math.min(min, matrix[i + 1][j - 1]);
                }
                if (j < (matrixRowLength - 1)){
                    min = Math.min(min, matrix[i + 1][j + 1]);
                }
                matrix[i][j] += min;
            }
        }
        min = Integer.MAX_VALUE;
        for (int i = 0; i < matrixRowLength; i++)
            min = Math.min(min, matrix[0][i]);
        return min;
    }
}
