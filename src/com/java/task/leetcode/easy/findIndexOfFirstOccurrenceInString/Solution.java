package com.java.task.leetcode.easy.findIndexOfFirstOccurrenceInString;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 * <p>
 * Example 1:
 * <p>
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * Example 2:
 * <p>
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 */
public class Solution {
    public static void main(String[] args) {
        String s = "sadbutsad";
        String needle = "sad";

//        String s = "leetcode";
//        String needle = "leeto";
        System.out.println(strStr(s, needle));
//        System.out.println(strStrReturnIndexOfFirstOccurrence(s, needle));
    }

    //alternative solution, returns array of indexes of first occurrences
    public static List<Integer> strStr(String haystack, String needle) {
        Pattern pt = Pattern.compile(needle);
        Matcher matcher = pt.matcher(haystack);

        ArrayList<Integer> list = new ArrayList<>();

        int index = 0;

        while (matcher.find()) {
            int i = haystack.indexOf(needle, index);
            list.add(index++, i);

        }

        if(list.size() == 0) list.add(-1);
        return list;
    }

    public static int strStrReturnIndexOfFirstOccurrence(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }

}
