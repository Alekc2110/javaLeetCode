package com.java.task.leetcode.easy.addBinary;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 * Given two binary strings a and b, return their sum as a binary string.
 *
 * Example 1:
 *
 * Input: a = "11", b = "1"
 * Output: "100"
 * Example 2:
 *
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 */
public class Solution {
    public static void main(String[] args) {
//     String a = "1010", b = "1011";
      String  a = "11", b = "1";
//
//      String  a =
//                "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
//       String b =
//                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

        System.out.println(addBinary2(a, b));
    }

    public static String addBinary(String a, String b) {
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);

        return num1.add(num2).toString(2);
    }

    public static String addBinary1(String a, String b) {
        int prefix = 0;
        StringBuilder builder = new StringBuilder();
        int index1 = a.length() - 1;
        int index2 = b.length() - 1;

        while (index1 >= 0 || index2 >= 0 || prefix == 1) {
            if (index1 >= 0) {
                prefix += a.charAt(index1) - '0';
                index1--;
            }

            if (index2 >= 0) {
                prefix += b.charAt(index2) - '0';
                index2--;
            }
            builder.append(prefix % 2);
            prefix = prefix/2;
        }

        return builder.reverse().toString();
    }

    public static String addBinary2(String a, String b) {
        LinkedList<Integer> stack = new LinkedList<>();
        int c = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (i >= 0 || j >= 0 || c == 1) {
            if (i >= 0){
                c += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0){
                c += b.charAt(j) - '0';
                j--;
            }

            stack.push(c % 2);
            c = c / 2;

        }
        return stack.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
