package com.java.task.mergeSort;

public class MergeSort1 {

    public static void mergeSort(int[] array) {
        int arrLength = array.length;

        //stop dividing array when array has 1 element
        if (arrLength < 2) {
            return;
        }
        // Find the middle point
        int midIndex = arrLength / 2;

        //creat 2 temp arrays
        int[] temp1 = new int[midIndex];
        int[] temp2 = new int[arrLength - midIndex];

        //copy elements from array to temp arrays
        for (int i = 0; i < temp1.length; i++) {
            temp1[i] = array[i];
        }
        for (int i = 0; i < temp2.length; i++) {
            temp2[i] = array[midIndex + i];
        }
        //recursive merge till split for arrays with 1 el
        mergeSort(temp1);
        mergeSort(temp2);

        //merge split arrays to 1 resultArray
        mergeSortedArrays(array, temp1, temp2);
    }

    private static void mergeSortedArrays(int[] resultArr, int[] tempArr1, int[] tempArr2) {
        int arrLength1 = tempArr1.length;
        int arrLength2 = tempArr2.length;
        int i = 0, j = 0, pointer = 0;

        //compare elements in tempArrays and copy the lowest to resultArray
        while (i < arrLength1 && j < arrLength2) {
            if (tempArr1[i] <= tempArr2[j]) {
                resultArr[pointer] = tempArr1[i];
                i++;
            } else {
                resultArr[pointer] = tempArr2[j];
                j++;
            }
            pointer++;
        }
        //Check if elements left in on of temp arrays then copy the rest to resultArray
        if (i < arrLength1) {
            System.arraycopy(tempArr1, i, resultArr, pointer, arrLength1 - i);
        }

        if (j < arrLength2) {
            System.arraycopy(tempArr2, j, resultArr, pointer, arrLength2 - j);
        }
    }
}
