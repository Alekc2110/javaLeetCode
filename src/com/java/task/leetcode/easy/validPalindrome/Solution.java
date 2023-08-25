package com.java.task.leetcode.easy.validPalindrome;


/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
 * and removing all non-alphanumeric characters, it reads the same forward and backward.
 * Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 * Example 1:
 *
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 *
 * Example 2:
 *
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 */
public class Solution {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
//        String s = "race a car";
//        String s = "   ";
        int x = 121;
//        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(String s) {
        String compactStr = s.replaceAll("[\\s\\W_]+", "");

        StringBuilder str = new StringBuilder();

        for (int i = compactStr.length() -1; i >= 0; i--) {
            str.append(compactStr.charAt(i));
        }

        return str.toString().equalsIgnoreCase(compactStr);
    }

    public static boolean isPalindrome1(String s) {
       if(s.isEmpty()) return true;

       int first = 0;
       int last = s.length() - 1;

       while (first < last){
           if(!Character.isLetterOrDigit(s.charAt(first))){
               first++;
           } else if (!Character.isLetterOrDigit(s.charAt(last))) {
               last--;
           } else {
               if(Character.toLowerCase(s.charAt(first)) != Character.toLowerCase(s.charAt(last))) return false;
               first++;
               last--;
           }
       }
        return true;
    }

    /**
     * Given an integer x, return true if x is a 
     * palindrome, and false otherwise.
     *
     * Example 1:
     *
     * Input: x = 121
     * Output: true
     * Explanation: 121 reads as 121 from left to right and from right to left.
     * Example 2:
     *
     * Input: x = -121
     * Output: false
     * Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
     * Therefore, it is not a palindrome.
     * @param x integer value
     * @return boolean
     */
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int left = 0;
        int right = str.length() - 1;
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
}
