package com.java.task.leetcode.easy.romanToInteger;

import java.util.*;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two ones added together.
 * 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
 * Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "III"
 * Output: 3
 * Explanation: III = 3.
 * Example 2:
 * <p>
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * Example 3:
 * <p>
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
public class Solution {

    public static void main(String[] args) {
//        System.out.println(romanToInt3("DCXXI"));
        System.out.println(romanToInt2("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        List<Character> list = new ArrayList<>(List.of('I', 'V', 'X', 'L', 'C', 'D', 'M'));

        int result = 0;
        char[] chars = s.toCharArray();

        for (int i = chars.length - 1; i >= 0; ) {
            if (i == 0) {
                result += map.get(chars[i]);
                break;
            }
            char prev = chars[i - 1];
            char cur = chars[i];
            if (list.indexOf(prev) < list.indexOf(cur)) {
                result += map.get(cur) - map.get(prev);
                i = i - 2;
            } else {
                result += map.get(chars[i]);
                i--;
            }

        }
        return result;
    }

    //M C M X C I V
    public static int romanToInt2(String s) {
        int num = 0;
        char prev = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'M' -> {
                    if (prev == 'C') {
                        num += 800;
                    } else {
                        num += 1000;
                    }
                    prev = 'M';
                }
                case 'D' -> {
                    if (prev == 'C') {
                        num += 300;
                    } else {
                        num += 500;
                    }
                    prev = 'D';
                }
                case 'C' -> {
                    if (prev == 'X') {
                        num += 80;
                    } else {
                        num += 100;
                    }
                    prev = 'C';
                }
                case 'L' -> {
                    if (prev == 'X') {
                        num += 30;
                    } else {
                        num += 50;
                    }
                    prev = 'X';
                }
                case 'X' -> {
                    if (prev == 'I') {
                        num += 8;
                    } else {
                        num += 10;
                    }
                    prev = 'X';
                }
                case 'V' -> {
                    if (prev == 'I') {
                        num += 3;
                    } else {
                        num += 5;
                    }
                }
                case 'I' -> {
                    num += 1;
                    prev = 'I';
                }
            }
        }
        return num;

    }

    public static int romanToInt3(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        //using String instead of list
        String list = "IVXLCDM";

        int result = 0;
        char[] chars = s.toCharArray();

        for (int i = chars.length - 1; i >= 0; ) {
            if (i == 0) {
                result += map.get(chars[i]);
                break;
            }
            char prev = chars[i - 1];
            char cur = chars[i];
            if (list.indexOf(prev) < list.indexOf(cur)) {
                result += map.get(cur) - map.get(prev);
                i = i - 2;
            } else {
                result += map.get(chars[i]);
                i--;
            }

        }
        return result;
    }
}
