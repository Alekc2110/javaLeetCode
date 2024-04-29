package com.java.task.leetcode.easy.isIsomorphic;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character, but a character may map to itself.
 *
 * Example 1:
 * Input: s = "egg", t = "add"
 * Output: true
 *
 * Example 2:
 * Input: s = "foo", t = "bar"
 * Output: false
 *
 * Example 3:
 * Input: s = "paper", t = "title"
 * Output: true
 */
public class Solution {
    public static void main(String[] args) {
//        String s = "egg", t = "add"; //true
//        String s = "foo", t = "bar"; //false
//        String s = "paper", t = "title"; //true
        String s = "badc", t = "baba"; //true

        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Character> kesSValueTmap = new HashMap<>();
        Map<Character, Character> keyTValueSmap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if(kesSValueTmap.containsKey(s.charAt(i))){
                if(kesSValueTmap.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
            if(keyTValueSmap.containsKey(t.charAt(i))){
                if(keyTValueSmap.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
            }
            kesSValueTmap.put(s.charAt(i), t.charAt(i));
            keyTValueSmap.put(t.charAt(i), s.charAt(i));
        }
        return true;
    }

    public static boolean isIsomorphic1(String firstString, String secondString) {
        if(firstString.length() != secondString.length()) return false;

        Map<Character, Character> map = new HashMap<>();

        for(int i = 0; i < firstString.length(); i++) {

            char firstStringChar = firstString.charAt(i);
            char secondStringChar = secondString.charAt(i);

            if(!map.containsKey(firstStringChar)) {
                if(!map.containsValue(secondStringChar)) {
                    map.put(firstStringChar, secondStringChar);
                }
                else {
                    return false;
                }
            }
            else {
                char secondStringCurrentValue = map.get(firstStringChar);
                if(secondStringCurrentValue != secondStringChar) return false;
            }
        }
        return true;
    }
}
