package com.java.task.leetcode.easy.canConstructRansomeNote;

import java.util.HashMap;

/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed
 * by using the letters from magazine and false otherwise.
 * Each letter in magazine can only be used once in ransomNote.
 * Example 1:
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * <p>
 * Example 2:
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * <p>
 * Example 3:
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 */
public class Solution {
    public static void main(String[] args) {
//        String ransomNote = "a", magazine = "b";
//        String ransomNote1 = "aa", magazine1 = "ab";
        String ransomNote2 = "aac", magazine2 = "aab";

//        System.out.println(canConstruct(ransomNote, magazine));
//        System.out.println(canConstruct1(ransomNote1, magazine1));
        System.out.println(canConstruct2(ransomNote2, magazine2));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> noteLettersStorage = new HashMap<>();

        char[] ransomNoteCharArray = ransomNote.toCharArray();

        for (int i = 0; i < ransomNoteCharArray.length; i++) {
            if (!noteLettersStorage.containsKey(ransomNoteCharArray[i])) {
                noteLettersStorage.put(ransomNoteCharArray[i], 1);
            } else {
                noteLettersStorage.put(ransomNoteCharArray[i], noteLettersStorage.get(ransomNoteCharArray[i]) + 1);
            }
        }

        char[] magazineLetters = magazine.toCharArray();
        for (int i = 0; i < magazineLetters.length; i++) {
            if (noteLettersStorage.containsKey(magazineLetters[i])) {
                noteLettersStorage.put(magazineLetters[i], noteLettersStorage.get(magazineLetters[i]) - 1);
            }
        }

        return noteLettersStorage.values().stream().noneMatch(count -> count > 0);
    }


    public static boolean canConstruct1(String ransomNote, String magazine) {
        int[] m = new int[26];
        char[] magazineCharArray = magazine.toCharArray();
        for (char c : magazineCharArray)
            m[c - 'a']++;

        char[] ransomNoteCharArray = ransomNote.toCharArray();
        for (char c : ransomNoteCharArray) {
            if (m[c - 'a']-- == 0)
                return false;
        }
        return true;
    }

    public static boolean canConstruct2(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineLettersMap = new HashMap<>(26);


        char[] magazineLetters = magazine.toCharArray();
        for (int i = 0; i < magazineLetters.length; i++) {
            char cur = magazineLetters[i];
            magazineLettersMap.computeIfPresent(cur, (c, integer) -> ++integer);
            magazineLettersMap.putIfAbsent(cur, 1);
        }

        char[] noteCharArray = ransomNote.toCharArray();
        for (int i = 0; i < noteCharArray.length; i++) {
            Integer count = magazineLettersMap.get(noteCharArray[i]);
            if(count == null || count == 0){
                return false;
            }
            magazineLettersMap.put(noteCharArray[i], --count);
        }
        return true;
    }
}
