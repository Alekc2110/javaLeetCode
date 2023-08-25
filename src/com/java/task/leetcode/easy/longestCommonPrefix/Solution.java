package com.java.task.leetcode.easy.longestCommonPrefix;


/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * <p>
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * <p>
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */
public class Solution {
    public static void main(String[] args) {
//        String[] strs = {"flower", "flow", "flowet"};
//        String[] strs = {"flower","flawer","flvwer","flower"};
//        String[] strs = {"cir", "car"};
        String[] strs = {"car","cadog","race"};

        System.out.println(longestCommonPrefix1(strs));

    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        String pattern = strs[0];
        int pointer = 0;

        while (pointer < pattern.length()) {
            int counter = 0;
            for (int i = 1; i < strs.length; i++) {
                if (pointer >= strs[i].length())
                    break;

                if (pattern.charAt(pointer) == strs[i].charAt(pointer))
                    counter++;

            }

            if (counter == strs.length - 1) {
                sb.append(pattern.charAt(pointer));
            } else {
                return sb.toString();
            }

            pointer++;

        }
        return sb.toString();
    }

    public static String longestCommonPrefix1(String[] strs) {
        String prefix = strs[0];
        for (int index = 1; index < strs.length; index++) {

            while (strs[index].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }

        }
        return prefix;
    }
}
