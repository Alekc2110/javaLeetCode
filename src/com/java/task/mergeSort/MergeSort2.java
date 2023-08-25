package com.java.task.mergeSort;

public class MergeSort2 {

    static void sort(int[] arr, int leftInd, int rightInd) {
        if (leftInd < rightInd) {
            // Find the middle point
            int m = leftInd + (rightInd - leftInd) / 2;

            // Sort first and second halves of arr
            sort(arr, leftInd, m);
            sort(arr, m + 1, rightInd);

            // Merge the sorted halves
            merge(arr, leftInd, m, rightInd);
        }
    }

    private static void merge(int[] arr, int left, int middle, int right) {
        // Find sizes of two subArrays to be merged
        int n1 = middle - left + 1; // +1 -> to include arr[middle] element
        int n2 = right - middle;

        /* Create temp arrays */
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            leftArr[i] = arr[left + i];

        for (int j = 0; j < n2; ++j)
            rightArr[j] = arr[middle + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subArrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int pointer = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[pointer] = leftArr[i];
                i++;
            } else {
                arr[pointer] = rightArr[j];
                j++;
            }
            pointer++;
        }

        /* Copy remaining elements of Left[] if any exists*/
        if (i < n1) {
            System.arraycopy(leftArr, i, arr, pointer, n1 - i);
        }

        /* Copy remaining elements of Right[] if any  exists*/
        if (j < n2) {
            System.arraycopy(rightArr, j, arr, pointer, n2 - j);
        }
    }
}
