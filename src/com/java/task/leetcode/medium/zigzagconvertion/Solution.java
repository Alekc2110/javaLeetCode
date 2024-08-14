package com.java.task.leetcode.medium.zigzagconvertion;

import java.util.ArrayList;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string s, int numRows);
 * Example 1:
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * <p>
 * Example 2:
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * <p>
 * Example 3:
 * Input: s = "A", numRows = 1
 * Output: "A"
 */
class Solution {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING"; // output "PINALSIGYAHRPI"
        int numRows = 4;

//      String s = "PAYPALISHIRING"; // output "PAHNAPLSIIGYIR"
//      int numRows = 3;

//        System.out.println(convert1(s, numRows));
//        System.out.println(convert2(s, numRows));

    }

    public static String convert1(String s, int numRows) {
        int length = s.length();
        StringBuilder[] arr = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) arr[i] = new StringBuilder();

        int counter = 0;
        while (counter < length) {
            for (int i = 0; i < numRows && counter < length; i++) {
                arr[i].append(s.charAt(counter++));
            }
            for (int i = numRows - 2; i > 0 && counter < length; i--) {
                arr[i].append(s.charAt(counter++));
            }
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder el : arr) {
            res.append(el);
        }
        return res.toString();
    }

    public static String convert2(String s, int numRows) {
        if (numRows == 1 || s.length() < numRows)
            return s;

        ArrayList<StringBuilder> matrix = new ArrayList<>();
        for (int i = 0; i < numRows; i++)
            matrix.add(new StringBuilder());

        int row = 0;
        boolean down = false;
        char[] stringChars = s.toCharArray();
        for (char c : stringChars) {
            matrix.get(row).append(c);
            if (row == 0 || row == numRows - 1) {
                down = !down;
            }
            int incrementOrDecrement = down ? 1 : -1;
            row += incrementOrDecrement;
        }

        StringBuilder st = new StringBuilder();
        for (StringBuilder str : matrix)
            st.append(str);
        return st.toString();
    }
}
