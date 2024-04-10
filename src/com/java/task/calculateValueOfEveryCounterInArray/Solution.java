package com.java.task.calculateValueOfEveryCounterInArray;

import java.util.Arrays;

/**
 * You are given N counters, initially set to 0, and you have two possible operations on them:
 *
 * increase(X) − counter X is increased by 1,
 * max counter − all counters are set to the maximum value of any counter.
 * A non-empty array A of M integers is given. This array represents consecutive operations:
 *
 * if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
 * if A[K] = N + 1 then operation K is max counter.
 * For example, given integer N = 5 and array A such that:
 *
 *     A[0] = 3
 *     A[1] = 4
 *     A[2] = 4
 *     A[3] = 6
 *     A[4] = 1
 *     A[5] = 4
 *     A[6] = 4
 * the values of the counters after each consecutive operation will be:
 *
 *     (0, 0, 1, 0, 0)
 *     (0, 0, 1, 1, 0)
 *     (0, 0, 1, 2, 0)
 *     (2, 2, 2, 2, 2)
 *     (3, 2, 2, 2, 2)
 *     (3, 2, 2, 3, 2)
 *     (3, 2, 2, 4, 2)
 * The goal is to calculate the value of every counter after all operations.
 *
 * Write a function:
 *
 * class Solution { public int[] solution(int N, int[] A); }
 *
 * that, given an integer N and a non-empty array A consisting of M integers, returns a sequence of integers representing the values of the counters.
 *
 * Result array should be returned as an array of integers.
 */
public class Solution {
    public static void main(String[] args) {

        int[] ints = {3, 4, 4, 6, 1, 4, 4};
//        int[] ints = {2, 1, 1, 2, 1};
        System.out.println(Arrays.toString(solution(5, ints)));
//        System.out.println(Arrays.toString(solution(1, ints)));
    }


   //{3,2,2,4,2}
    public static int[] solution(int n, int[] arr) {
        int[] res = new int[n];
        // Переменная для хранения текущего максимального значения счетчика
        int maxCounter = 0;
        // Переменная для хранения последнего максимального значения счетчика,
        // которое было применено ко всем счетчикам
        int lastMaxCounter = 0;

        for (int i = 0; i < arr.length; i++) {
            // Если операция увеличения счетчика (A[K] = X), X находится в диапазоне от 1 до N
            if (arr[i] >= 1 && arr[i] <= n) {
                int resIndex = arr[i] - 1;
                // Увеличиваем значение счетчика и проверяем, не превышает ли оно последнего максимального значения
                res[resIndex] = Math.max(res[resIndex], lastMaxCounter);
                res[resIndex]++; // Увеличиваем счетчик на 1
                // Обновляем значение максимального счетчика, если необходимо
                maxCounter = Math.max(maxCounter, res[resIndex]);
            }
            // Если операция max counter (A[K] = N + 1)
            else if (arr[i] == n + 1) {
                // Запоминаем текущее максимальное значение счетчика
                lastMaxCounter = maxCounter;
            }
        }

        // Проходим по всем счетчикам и устанавливаем те, которые не были обновлены после последней операции max counter,
        // значение равное последнему максимальному значению счетчика
        for (int i = 0; i < res.length; i++) {
            res[i] = Math.max(res[i], lastMaxCounter);
        }

        return res;
    }

}
