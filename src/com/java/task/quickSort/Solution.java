package com.java.task.quickSort;

import java.util.Arrays;
import java.util.Random;

public class Solution {

    public static void main(String[] args) {
          int[] arr = {1, 6, 6, 7, 8, 10, -255, -1, -10, 25, -500};
//          int[] arr = {-500, -255, -10, -1, 1, 6, 6, 7, 8, 10, 25};
//        int[] arr = {10, 3, 15, 8, 25, 1, 0};

//        QuickSort1.quickSort(arr);
//        QuickSort2.quickSort(arr);
        quickSortTest(arr);


        System.out.println(Arrays.toString(arr));
    }


    private static void quickSortTest(int[] arr){
        quickSortTest(arr, 0, arr.length -1);
    }

    private static void quickSortTest(int[] arr, int low, int high){
       if(low>= high){
           return;
       }
       int partitionIndex = partition(arr, low, high);

       quickSortTest(arr, low, partitionIndex - 1);
       quickSortTest(arr, partitionIndex + 1, high);
    }

    private static int partition(int[] arr, int low, int high) {
      int pointer1 = low;
      int pointer2 = high;

      int pivot = arr[high];

      while (pointer1 < pointer2){
          while (arr[pointer1] <= pivot && pointer1 < pointer2){
              pointer1++;
          }

          while (arr[pointer2] >= pivot && pointer1 < pointer2){
              pointer2--;
          }

          swap(arr, pointer1, pointer2);

      }
      swap(arr, pointer1, high);
        return pointer1;
    }

    private static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
