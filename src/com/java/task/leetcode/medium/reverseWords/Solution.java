package com.java.task.leetcode.medium.reverseWords;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Given an input string s, reverse the order of the words.
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * Return a string of the words in reverse order concatenated by a single space.
 * Note that s may contain leading or trailing spaces or multiple spaces between two words.
 * The returned string should only have a single space separating the words. Do not include any extra spaces.
 *
 * Example 1:
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 *
 * Example 2:
 * Input: s = "  hello world  "
 * Output: "world hello"
 * Explanation: Your reversed string should not contain leading or trailing spaces.
 *
 * Example 3:
 * Input: s = "a good   example"
 * Output: "example good a"
 * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */
public class Solution {
    public static void main(String[] args) {

//         String s = "the sky is blue";
         String s = "a good   example";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] strings = s.trim().split(" +");
        Arrays.stream(strings).forEach(System.out::println);
        StringBuilder result = new StringBuilder();
        for (int i = strings.length -  1;  i >= 0; i--) {
            if(i == 0){
                result.append(strings[i]);
               break;
            }
            result.append(strings[i]).append(" ");
        }
        return result.toString();
    }

    public static String reverseWords1(String s) {
        StringBuilder result = new StringBuilder();
        String[] strings = s.trim().split(" +");
        IntStream.iterate(strings.length - 1, i -> i >= 0, i -> --i)
                .forEach(i -> result.append(strings[i]).append(" "));

        return result.toString().stripTrailing();
    }

}
