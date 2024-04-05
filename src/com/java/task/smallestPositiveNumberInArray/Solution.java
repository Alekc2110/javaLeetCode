package com.java.task.smallestPositiveNumberInArray;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 10, 4, 5, 7, 25, 30};

        System.out.println(solution(arr));
    }

    public static int solution(int[] A) {
        Set<Integer> set = new HashSet<>();

        // Заполняем множество уникальными значениями из массива
        for (int num : A) {
            if (num > 0) {
                set.add(num);
            }
        }

        // Итерируемся по положительным целым числам,
        // начиная с 1, и находим первое отсутствующее в массиве
        int smallestPositive = 1;
        while (set.contains(smallestPositive)) {
            smallestPositive++;
        }

        return smallestPositive;
    }
}
