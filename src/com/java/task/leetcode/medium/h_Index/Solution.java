package com.java.task.leetcode.medium.h_Index;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper,
 * return the researcher's h-index.
 * According to the definition of h-index on Wikipedia:
 * The h-index is defined as the maximum value of h such that the given researcher has published at least h papers
 * that have each been cited at least h times.
 * <p>
 * Example 1:
 * Input: citations = [3,0,6,1,5]
 * Output: 3
 * Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively.
 * Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each,
 * their h-index is 3.
 * <p>
 * Example 2:
 * Input: citations = [1,3,1]
 * Output: 1
 */
public class Solution {
    public static void main(String[] args) {
        int[] papers = {3, 0, 6, 1, 5}; //3
        int[] papers1 = {1, 3, 1}; //1
        int[] papers2 = {1}; //1
        int[] papers3 = {0}; //0
        int[] papers4 = {100}; //1
        int[] papers5 = {11,15}; //2
        System.out.println(hIndex3(papers));
        System.out.println(hIndex3(papers1));
        System.out.println(hIndex3(papers2));
        System.out.println(hIndex3(papers3));
        System.out.println(hIndex3(papers4));
        System.out.println(hIndex3(papers5));
    }

    public static int hIndex(int[] citations) {
        int[] reversed = Arrays.stream(citations).boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();

        int index = 0;
        while (index < reversed.length) {
            if (reversed[index] <= index) {
                break;
            }
            index++;
        }
        return index;
    }

    public static int hIndex2(int[] citations) {
        int n = citations.length;
        int[] buckets = new int[n + 1];
        for (int c : citations) {
            if (c >= n) {
                buckets[n]++;
            } else {
                buckets[c]++;
            }
        }
        int count = 0;
        for (int i = n; i >= 0; i--) {
            count += buckets[i];
            if (count >= i) {
                return i;
            }
        }
        return 0;
    }

    public static int hIndex3(int[] citations) {
        Arrays.sort(citations);
        int length = citations.length;
        for (int index = length - 1; index >= 0; index--) {

            if (citations[index] < length - index) {
                return length - (index + 1);
            }
        }
        return length;
    }

}
