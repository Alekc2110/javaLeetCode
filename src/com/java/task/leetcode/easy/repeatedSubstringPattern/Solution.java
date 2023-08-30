package com.java.task.leetcode.easy.repeatedSubstringPattern;

/**
 * Given a string s, check if it can be constructed by taking a substring of it
 * and appending multiple copies of the substring together.
 *
 * Example 1:
 *
 * Input: s = "abab"
 * Output: true
 * Explanation: It is the substring "ab" twice.
 * Example 2:
 *
 * Input: s = "aba"
 * Output: false
 * Example 3:
 *
 * Input: s = "abcabcabcabc"
 * Output: true
 * Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
 */
public class Solution {



    public static void main(String[] args) {
        String s = "abcabcabcabc";
//        String s = "abab";
//        String s = "abc";
//        String s = "abaababaab";
        System.out.println(repeatedSubstringPattern(s));
    }
    public static boolean repeatedSubstringPattern(String s) {
//        StringBuilder res;

        for (int i = 1; i < s.length(); i++) {
//            res = new StringBuilder();
            String substring = s.substring(0, i);
//            if(s.length() % substring.length() == 0){
//                res.append(substring.repeat(s.length() / substring.length()));
//            }
//
//            if(res.toString().equals(s)){return true;}
//        }
            if(s.length() % substring.length() == 0 &&
                            substring.repeat(s.length() / substring.length()).equals(s)){
               return true;
            }

//            if(res.toString().equals(s)){return true;}
        }

        return false;
    }

    public static boolean repeatedSubstringPattern1(String s) {
        String concatenated = s + s;
        return concatenated.substring(1, concatenated.length() - 1).contains(s);
    }
}
