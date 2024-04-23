package com.java.task.leetcode.easy.isSubsequence;


/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * A subsequence of a string is a new string that is formed from the original string by deleting
 * some (can be none) of the characters without disturbing the relative positions of the remaining characters.
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 *
 * Example 1:
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 *
 * Example 2:
 * Input: s = "axc", t = "ahbgdc"
 * Output: false
 */
public class Solution {
    public static void main(String[] args) {
//        String s = "abc", t = "ahbgdc"; //true
//        String s = "axc", t = "ahbgdc"; //false
//        String s = "abcde", t = "aec"; //false
//        String s = "aaa", t = "bbaa"; //false
//        String s = "aaa", t = ""; //false
        String s = "", t = "bbaa"; //true
//        String s = "", t = ""; //false
        System.out.println(isSubsequence(s, t));

    }
    public static boolean isSubsequence(String pattern, String str) {
        if (pattern == null || str == null || pattern.length() > str.length()) {
            return false;
        }
        if(pattern.isBlank()){
            return false;
        }

        for (int i = 0, indexPointer = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            if(str.indexOf(currentChar, indexPointer) == -1){
                return false;
            }
            else {
                if(indexPointer > str.length() - 1){
                    return false;
                }
                int curIndex = str.indexOf(currentChar, indexPointer);
                indexPointer = curIndex + 1;
            }
        }
        return true;
    }
}
