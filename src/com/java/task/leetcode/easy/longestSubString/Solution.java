package com.java.task.leetcode.easy.longestSubString;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        String s = "bacabcbb";
//        String s1 = "bbbbb";
        int res = lengthOfLongestSubstring1var(s);
        System.out.println(res);
    }


    public static int lengthOfLongestSubstring1var(String s) {
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            StringBuilder str = new StringBuilder();
            for (int j = i ; j < s.length(); j++) {
                char currentChar = s.charAt(j);
                if(str.indexOf(String.valueOf(currentChar)) != -1){
                    break;
                }
                str.append(currentChar);
            }
            maxLength = Math.max(maxLength, str.length());
        }

        return maxLength;
    }

    public static int lengthOfLongestSubstring2var(String s) {
        int maxLength = 0;
        for (int leftBorder = 0, rightBoarder = 0; rightBoarder < s.length(); rightBoarder++) {
            char currentChar = s.charAt(rightBoarder);
            int indexOf1StAppearanceInSubString = s.indexOf(currentChar, leftBorder);
            if(indexOf1StAppearanceInSubString != rightBoarder){
                leftBorder = indexOf1StAppearanceInSubString + 1;
            }
            maxLength = Math.max(maxLength, rightBoarder - leftBorder + 1);
        }
        return maxLength;
    }

    public static int lengthOfLongestSubstring3var(String s) {
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int currentStartSubString = 0, rightBoarder = 0; rightBoarder < s.length(); rightBoarder++) {
            char currentChar = s.charAt(rightBoarder);
            if (map.containsKey(currentChar) &&
                    map.get(currentChar) >= currentStartSubString) {
                currentStartSubString = map.get(currentChar) + 1;
            }
            maxLength = Math.max(maxLength, rightBoarder - currentStartSubString + 1);
            map.put(currentChar, rightBoarder);
        }
        return maxLength;
    }
}