package com.java.task.leetcode.easy.isAnagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 * <p>
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * <p>
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 */
public class Solution {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram"; //true
//        String s = "rat", t = "cat"; //false

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char currentChar = t.charAt(i);
            if (!map.containsKey(currentChar)) {
                return false;
            }
            map.put(currentChar, map.get(currentChar) - 1);
        }
        return map.values().stream().filter(i -> i != 0).findFirst().isEmpty();
    }

    public static boolean isAnagram1(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }
        List<Integer> list = new ArrayList<>(Collections.nCopies(26, 0));

        for (int i = 0; i < s.length(); i++) {
            char currentChar1 = s.charAt(i);
            char currentChar2 = t.charAt(i);
            int index1 = currentChar1 - 'a';
            int index2 = currentChar2 - 'a';
            list.set(index1, list.get(index1) + 1);
            list.set(index2, list.get(index2) - 1);
        }

      return !list.stream().anyMatch(i -> i != 0);
    }

}
