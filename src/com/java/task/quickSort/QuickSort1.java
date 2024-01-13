package com.java.task.quickSort;

import java.util.Random;

public class QuickSort1 {

    static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);

    }

    private static void quickSort(int[] arr, int leftIndex, int rightIndex) {
        if (leftIndex >= rightIndex) {
            return;
        }

        int leftPointer = partitionArray(arr, leftIndex, rightIndex);

        quickSort(arr, leftIndex, leftPointer - 1);
        quickSort(arr, leftPointer + 1, rightIndex);


    }

    private static int partitionArray(int[] arr, int lowIndex, int highIndex) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;
        int pivot = arr[highIndex];
        // random pivot selection
//        int pivotIndex = new Random().nextInt(highIndex-lowIndex) + lowIndex;
//        swap(arr,pivotIndex,highIndex);
//        int pivot = arr[highIndex];

        while (leftPointer < rightPointer) {
            while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(arr, leftPointer, rightPointer);
        }
        swap(arr, leftPointer, highIndex);

        return leftPointer;
    }


    public static void quickSortBasicApproach(int[] array, int low, int high) {
        int i = low, j = high;
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int middleElement = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        while (i <= j) {
            while (array[i] < middleElement) {
                i++;
            }

            while (array[j] > middleElement) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j) {
            quickSortBasicApproach(array, low, j);
            // printArray(array);
        }
        if (high > i) {
            quickSortBasicApproach(array, i, high);
            //  printArray(array);
        }
    }


    /**
     * Implementation of quickSort with 2 variants:
     * 1st - peek pivot as element of higher index in array
     * 2nd - peek middle element as pivot
     *
     * @param array - array of integers
     */
    public static void quickSortBasic(int[] array) {
        quickSortArr(array, 0, array.length - 1);
    }

    private static void quickSortArr(int[] arr, int lowIndex, int highIndex) {
        //check if arr has 1 element, then we don`t need to sort it anymore
        if (lowIndex >= highIndex) {
            return;
        }
// ------------------------------------------------------------------------------------
//        // peek the element for pivot for 1var partition method ***
        int pivIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int piv = arr[pivIndex];
//        // when we peek random el for pivot, then we swap it with last el in array - arr[highIndex]
        swap(arr, pivIndex, highIndex);
// ------------------------------------------------------------------------------------
        // peek the middle!!! element for pivot for 2var partition method ***
//        int piv = arr[lowIndex + (highIndex - lowIndex) / 2];
// ------------------------------------------------------------------------------------

        // do arr partition for higher and lower elements around pivot element
        int leftPointer = arrPartition(arr, lowIndex, highIndex, piv); // 1 var
//        int leftPointer = arrPartition2Var(arr, lowIndex, highIndex, piv); // 2 var

        // recursive sort left part of arr that is lower than piv element
        quickSortArr(arr, lowIndex, leftPointer - 1);

//        // recursive sort right part of arr that is higher than piv element
        quickSortArr(arr, leftPointer + 1, highIndex);

//        // recursive sort right part of arr that is higher than piv element for partition var2!******
//        quickSortArr(arr, leftPointer, highIndex);
    }


    private static int arrPartition(int[] arr, int lowIndex, int highIndex, int piv) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        //move leftPointer to right and rightPointer to left until they meet each other
        while (leftPointer < rightPointer) {

            //1st loop: when moving to right, then compare el - arr[leftPointer] with
            // el piv until we find el > piv, then stop this loop
            while (arr[leftPointer] <= piv && leftPointer < rightPointer) {
                leftPointer++;
            }
            //2nd loop: when moving to left, then compare el - arr[rightPointer] with
            // el piv until we find el < piv, then stop this loop
            while (arr[rightPointer] >= piv && leftPointer < rightPointer) {
                rightPointer--;
            }
            //swap elements - from 1st loop with 2nd loop
            swap(arr, leftPointer, rightPointer);
        }
        // last swap piv element with the last left element from while loop arr[leftPointer]
        swap(arr, leftPointer, highIndex);

        return leftPointer;
    }

    private static int arrPartition2Var(int[] arr, int lowIndex, int highIndex, int piv) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        //move leftPointer to right and rightPointer to left until they meet each other
        while (leftPointer <= rightPointer) {

            //1st loop: when moving to right, then compare el - arr[leftPointer] with
            // el piv until we find el > piv, then stop this loop
            while (arr[leftPointer] < piv) {
                leftPointer++;
            }
            //2nd loop: when moving to left, then compare el - arr[rightPointer] with
            // el piv until we find el < piv, then stop this loop
            while (arr[rightPointer] > piv) {
                rightPointer--;
            }
            //swap elements - from 1st loop with 2nd loop
            if (leftPointer <= rightPointer) {
                swap(arr, leftPointer, rightPointer);
                leftPointer++;
                rightPointer--;
            }
        }

        return leftPointer;
    }


    static void swap(int[] arr, int index, int index2) {
        int temp = arr[index];
        arr[index] = arr[index2];
        arr[index2] = temp;
    }

}
