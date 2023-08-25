package com.java.task.mergeSort;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
//        System.out.println(Arrays.toString(arr));
//        MergeSort.sort(arr, 0, arr.length - 1);
        MergeSort1.mergeSort(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println("done");
    }
}
