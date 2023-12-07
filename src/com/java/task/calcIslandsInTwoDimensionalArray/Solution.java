package com.java.task.calcIslandsInTwoDimensionalArray;

/**
 * Count quantity of islands in array. The island -> area marked as 1
 */
public class Solution {
    public static void main(String[] args) {

        int[][] area1 = {
                {1, 0, 0},
                {0, 0, 0},
                {1, 1, 1}
        };

        int[][] area2 = {
                {1, 1, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1}
        };
        int[][] area3 = {
                {1, 0, 1, 0, 1},
                {1, 0, 0, 0, 1},
                {1, 0, 1, 0, 0},
                {1, 0, 0, 1, 1}
        };

        System.out.println(calcIslands(area3));

    }

    public static int calcIslands(int[][] arr) {
        int islandCounts = 0;
        int startLine = 0;
        int endLine = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                startLine = arr[i - 1][0];
                endLine = arr[i - 1][arr[i-1].length - 1];
            }
            if(startLine == 1 && arr[i][0] == 1 && islandCounts > 0){
                islandCounts--;
            }
            if(endLine == 1 && arr[i][arr[i].length -1] == 1 && islandCounts > 0){
                islandCounts--;
            }
            for (int j = 0; j < arr[i].length; j++) {
                int cur = arr[i][j];
                if (cur == 1) {
                    while (j < arr[i].length - 1 && cur == 1) {
                        j++;
                        cur = arr[i][j];
                    }
                    islandCounts++;
                }
            }
        }
        return islandCounts;
    }
}
