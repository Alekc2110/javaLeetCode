package com.java.task.combineTwoSortedArrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
//        Integer[] a = {1,2,3,5,6};
//        Integer[] a2 = {7,8,9,45};
        String[] a1 = {"aaa", "bbb", "ccc", "ddd"};
        String[] a2 = {"fff", "ggg", "hhh", "ppp"};


        long start = System.currentTimeMillis();

        System.out.println(Arrays.toString(combineTwoSortedArrays(a1, a2)));
        System.out.println("time: " + (System.currentTimeMillis() - start));
    }

    /**
     * Combine 2 arrays of type T using reflection api
     *
     * @param arr1 T[] array
     * @param arr2 T[] array
     * @param <T>  Generic type of Object
     * @return T[] array
     */
    @SuppressWarnings("unchecked")
    public static <T extends Comparable<T>> T[] combineTwoSortedArrays(T[] arr1, T[] arr2) {
        // Создаем массив типа T[] с использованием рефлексии
        T[] result = (T[]) Array.newInstance(arr1.getClass().getComponentType(), arr1.length + arr2.length);
        int pointer1 = 0;
        int pointer2 = 0;
        int intsPointer = 0;

        while (pointer1 < arr1.length && pointer2 < arr2.length) {
            if (arr1[pointer1].compareTo(arr2[pointer2]) < 0) {
                result[intsPointer] = arr1[pointer1];
                pointer1++;
            } else if (arr2[pointer2].compareTo(arr1[pointer1]) < 0) {
                result[intsPointer] = arr2[pointer2];
                pointer2++;
            }
            intsPointer++;

        }
        if (pointer1 < arr1.length) {
            System.arraycopy(arr1, pointer1, result, arr2.length + pointer1, arr1.length - pointer1);
        }
        if (pointer2 < arr2.length) {
            System.arraycopy(arr2, pointer2, result, arr1.length + pointer2, arr2.length - pointer2);
        }

        return result;
    }

    /**
     * Combine 2 arrays of type T using Arraylist<T>
     * where T type implements Comparable<T>
     *
     * @param arr1 T[] array
     * @param arr2 T[] array
     * @param <T>  Generic type of Object
     * @return T[] array
     */
    @SuppressWarnings("unchecked")
    public static <T extends Comparable<T>> T[] combineTwoSortedArrays2(T[] arr1, T[] arr2) {
        List<T> resultList = new ArrayList<>();
        int pointer1 = 0;
        int pointer2 = 0;

        while (pointer1 < arr1.length && pointer2 < arr2.length) {
            if (arr1[pointer1].compareTo(arr2[pointer2]) < 0) {
                resultList.add(arr1[pointer1]);
                pointer1++;
            } else if (arr2[pointer2].compareTo(arr1[pointer1]) < 0) {
                resultList.add(arr2[pointer2]);
                pointer2++;
            }

        }
        while (pointer1 < arr1.length) {
            resultList.add(arr1[pointer1]);
            pointer1++;
        }
        while (pointer2 < arr2.length) {
            resultList.add(arr2[pointer2]);
            pointer2++;
        }

        return resultList.toArray((T[]) new Comparable[resultList.size()]);
    }

    public static List<Integer> combineTwoSortedArrays(List<Integer> arr1, List<Integer> arr2) {
        List<Integer> list = new ArrayList<>(arr1);
        list.addAll(arr2);
        Collections.sort(list);
        return list;
    }
}
