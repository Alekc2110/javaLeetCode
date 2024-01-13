package com.java.task.quickSort;



public class QuickSort2 {

    static void quickSort(int[] arr) {
        quickSort2Var(arr, 0, arr.length - 1);
    }

    private static void quickSort2Var(int[] arr, int start, int end) {
        if(start >= end) {
            return;
        }

        int partitionIndex = partition(arr, start, end);

        quickSort2Var(arr, start, partitionIndex - 1);
        quickSort2Var(arr, partitionIndex + 1, end);


    }

    private static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if(arr[j] < pivot){
                i++;
                QuickSort1.swap(arr, i, j);
            }
        }
        QuickSort1.swap(arr, i + 1, end);
        return i + 1;
    }
}
