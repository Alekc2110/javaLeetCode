package com.java.task.leetcode.easy.wordPattern;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Given a pattern and a string s, find if s follows the same pattern.
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
 * <p>
 * Example 1:
 * Input: pattern = "abba", s = "dog cat cat dog"
 * Output: true
 * <p>
 * Example 2:
 * Input: pattern = "abba", s = "dog cat cat fish"
 * Output: false
 * <p>
 * Example 3:
 * Input: pattern = "aaaa", s = "dog cat cat dog"
 * Output: false
 */
public class Solution {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
//        String s = "dog cat cat fish";

//        String pattern = "aaaa";
//        String s = "dog cat cat dog";
//        String s = "dog dog dog dog";
        System.out.println(wordPattern(pattern, s));

    }

    public static boolean wordPattern(String pattern, String s) {
        String[] strings = s.split(" ");
        if (pattern.length() != strings.length) {
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            //если map содержит символ, то проверяем слово с массива с value из map
            if (map.containsKey(pattern.charAt(i))) {
                String value = map.get(pattern.charAt(i));
                if (!value.equals(strings[i])) {
                    return false;
                }
            }
            // если map не содержит символ, то проверяем если такое value в map,
            // если да, то находим по этому value ключ и сравниваем с текущим символом -> если они не равны то return false;
            else {
                Set<Map.Entry<Character, String>> entries = map.entrySet();
                for (Map.Entry<Character, String> entry : entries) {
                    if (entry.getValue().equals(strings[i])) {
                        if (entry.getKey() != pattern.charAt(i)) {
                            return false;
                        }
                    }
                }
                map.put(pattern.charAt(i), strings[i]);
            }
        }
        return true;
    }

    public static boolean wordPattern1(String pattern, String s) {
        String[] strings = s.split(" ");
        if (pattern.length() != strings.length) {
            return false;
        }
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (map1.containsKey(pattern.charAt(i))) {
                String value = map1.get(pattern.charAt(i));
                if (!value.equals(strings[i])) {
                    return false;
                }
            } else if (map2.containsKey(strings[i])) {
                Character character = map2.get(strings[i]);
                if (character != pattern.charAt(i)) {
                    return false;
                }

            } else {
                map1.put(pattern.charAt(i), strings[i]);
                map2.put(strings[i], pattern.charAt(i));
            }
        }
        return true;
    }
}
