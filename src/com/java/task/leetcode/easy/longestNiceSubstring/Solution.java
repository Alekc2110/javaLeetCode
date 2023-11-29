package com.java.task.leetcode.easy.longestNiceSubstring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * A string s is nice if, for every letter of the alphabet that s contains, it appears both in uppercase and lowercase.
 * For example, "abABB" is nice because 'A' and 'a' appear, and 'B' and 'b' appear.
 * However, "abA" is not because 'b' appears, but 'B' does not.
 * Given a string s, return the longest substring of s that is nice.
 * If there are multiple, return the substring of the earliest occurrence.
 * If there are none, return an empty string.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "YazaAay"
 * Output: "aAa"
 * Explanation: "aAa" is a nice string because 'A/a' is the only letter of the alphabet in s, and both 'A' and 'a' appear.
 * "aAa" is the longest nice substring.
 * Example 2:
 * <p>
 * Input: s = "Bb"
 * Output: "Bb"
 * Explanation: "Bb" is a nice string because both 'B' and 'b' appear. The whole string is a substring.
 * Example 3:
 * <p>
 * Input: s = "c"
 * Output: ""
 * Explanation: There are no nice substrings.
 */
public class Solution {
    public static void main(String[] args) {
        String s = "YazaAay";

        System.out.println(longestNiceSubstring3(s));

    }

    public static String longestNiceSubstring(String s) {
        var sub = longestNiceSubstring(s, 0, s.length());
        return s.substring(sub[0], sub[1]);
    }

    private static int[] longestNiceSubstring(String s, int left, int right) {
        var charSet = getCharSet(s, left, right);

        for (var i = left; i < right; i++)
            if (!charSet.contains(Character.toLowerCase(s.charAt(i)))
                    || !charSet.contains(Character.toUpperCase(s.charAt(i)))) {

                var prefix = longestNiceSubstring(s, left, i);
                var suffix = longestNiceSubstring(s, i + 1, right);
                return prefix[1] - prefix[0] >= suffix[1] - suffix[0]
                        ? prefix
                        : suffix;
            }

        return new int[]{left, right};
    }

    private static Set<Character> getCharSet(String s, int left, int right) {
        var charSet = new HashSet<Character>();

        for (var i = left; i < right; i++)
            charSet.add(s.charAt(i));

        return charSet;
    }

    public static String longestNiceSubstring2(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }

        for (int i = 0; i < s.length(); i++) {
            if (set.contains(Character.toUpperCase(s.charAt(i)))
                    && set.contains(Character.toLowerCase(s.charAt(i)))) {
                continue;
            }

            String s1 = longestNiceSubstring2(s.substring(0, i));
            String s2 = longestNiceSubstring2(s.substring(i + 1));
            return s1.length() >= s2.length() ? s1 : s2;
        }

        return s;
    }

    public static String longestNiceSubstring3(String s) {
        String result = "";
        // take first index, go from 0 to length-1 of the string
        for (int i = 0; i < s.length(); i++) {
            // take second index, this should go up to the length of the string <=
            for (int j = i + 1; j <= s.length(); j++) {
                //get the substring for the index range from i to j
                String temp = s.substring(i, j);
                // if length of the substring should be greater than 1
                // if the length should be greater that the previous computed result
                // if the substring is valid Nice String
                // then update the result with the current substring from range i and j
                if (temp.length() > 1 && result.length() < temp.length() && checkNice(temp)) {
                    result = temp;
                }
            }
        }
        return result;
    }

    //validate Nice String check
    public static boolean checkNice(String temp) {
        //add substring to the set
        Set<Character> s = new HashSet<>();
        for (char ch : temp.toCharArray()) {
            s.add(ch);
        }

        // return false If you do not find both lower case and upper case in the sub string
        //for e.g 'aAa' substring added to set will have both a and A in the substring which is valid
        // 'azaA' substring will fail for 'z'
        // 'aaaaaaaa' will return "" as result
        //make sure that the substring contains both lower and upper case
        for (char ch : s) {
            if (s.contains(Character.toUpperCase(ch)) != s.contains(Character.toLowerCase(ch)))
                return false;
        }
        return true;
    }
}

