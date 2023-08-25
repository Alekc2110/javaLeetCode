package com.java.task.leetcode.easy.uniqueOccurrences;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
 * Example:
 * Input: arr = [1,2,2,1,1,3]
 * Output: true
 * Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(arr));
    }
    //solution1
    public static boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Long> collect = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        HashSet<Long> setWithoutOccurrences = new HashSet<>(collect.values());

        return collect.values().size() == setWithoutOccurrences.size();
    }

}
