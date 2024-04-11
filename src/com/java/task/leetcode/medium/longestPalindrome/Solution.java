package com.java.task.leetcode.medium.longestPalindrome;


/**
 * Given a string s, return the longest
 * palindromic substring in s.
 *
 * Example 1:
 *
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 *
 * Example 2:
 *
 * Input: s = "cbbd"
 * Output: "bb"
 */
public class Solution {
    public static void main(String[] args) {
//        String s = "babad";
//        String s = "cbbd";
//        String s = "c";
//        String s = "ac";
//        String s = "abb";
//        String s = "ccc";
//        String s = "aaaa";
//
        String s = "ababbc";
        System.out.println(longestPalindrome(s));
        System.out.println(longestPalSubstr(s));
    }

    public static String longestPalindrome(String s) {
        if(s == null || s.length() < 1){
            return "";
        }
        if(s.length() == 1){
            return s;
        }

        int startIndex = 0;
        int subStrLength = 0;
        for (int i = 0; i < s.length(); i++) {
            int length1 = expandAroundCenter(s, i, i);          //расчет для строк с нечетной длиной
            int length2 = expandAroundCenter(s, i, i + 1); //расчет для строк с четной длиной
            int length = Math.max(length1,length2);
            if(length > subStrLength){
                startIndex = i - (length - 1)/2;
                subStrLength = length;
            }

        }

        String res = s.substring(startIndex, startIndex + subStrLength);
        return res;
    }

    private static int expandAroundCenter(String s, int left, int right){
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        int curLength = right - left - 1;
        return curLength;
    }



    // This function prints the longest
    // palindrome substring of str[].
    // It also returns the length of the
    // longest palindrome
    static int longestPalSubstr(String str)
    {
        // Get length of input string
        int n = str.length();

        // table[i][j] will be false if
        // substring str[i..j] is not palindrome.
        // Else table[i][j] will be true
        boolean table[][] = new boolean[n][n];

        // All substrings of length 1 are palindromes
        int maxLength = 1;
        for (int i = 0; i < n; ++i){
            table[i][i] = true;
        }

        // Check for sub-string of length 2.
        int start = 0;
        for (int i = 0; i < n - 1; ++i) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                table[i][i + 1] = true;
                start = i;
                maxLength = 2;
                printSubStr(str, start, start + 1); //print current palindrome
            }
        }

        // Check for lengths greater than 2.
        // k is length of substring
        for (int k = 3; k <= n; ++k) {

            // Fix the starting index
            for (int i = 0; i <= n - k; ++i) {

                // Get the ending index of substring from
                // starting index i and length k
                int j = i + k - 1;

                // Checking for sub-string from ith index to
                // jth index if str.charAt(i+1) to
                // str.charAt(j-1) is a palindrome
                if (table[i + 1][j - 1] && str.charAt(i) == str.charAt(j)) {
                    table[i][j] = true;
                    printSubStr(str, i, j); //print current palindrome
                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        System.out.print("Longest palindrome substring is: ");
        printSubStr(str, start,
                start + maxLength - 1);

        return maxLength;
    }

    // A utility function to print
    // a substring str[low..high]
    static void printSubStr(
            String str, int low, int high)
    {
        System.out.println(
                str.substring(
                        low, high + 1));
    }
}
