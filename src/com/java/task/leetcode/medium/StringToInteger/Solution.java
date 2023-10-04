package com.java.task.leetcode.medium.StringToInteger;

import java.math.BigDecimal;

/**
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
 * <p>
 * The algorithm for myAtoi(string s) is as follows:
 * <p>
 * 1. Read in and ignore any leading whitespace.
 * 2. Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either.
 * This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
 * 3. Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
 * 4. Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0.
 * Change the sign as necessary (from step 2).
 * 5. If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range.
 * Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
 * 6. Return the integer as the final result.
 * Note:
 * <p>
 * Only the space character ' ' is considered a whitespace character.
 * Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "42"
 * Output: 42
 * Explanation: The underlined characters are what is read in, the caret is the current reader position.
 * Step 1: "42" (no characters read because there is no leading whitespace)
 * ^
 * Step 2: "42" (no characters read because there is neither a '-' nor '+')
 * ^
 * Step 3: "42" ("42" is read in)
 * ^
 * The parsed integer is 42.
 * Since 42 is in the range [-231, 231 - 1], the final result is 42.
 * <p>
 * Example 2:
 * <p>
 * Input: s = "   -42"
 * Output: -42
 * Explanation:
 * Step 1: "   -42" (leading whitespace is read and ignored)
 * ^
 * Step 2: "   -42" ('-' is read, so the result should be negative)
 * ^
 * Step 3: "   -42" ("42" is read in)
 * ^
 * The parsed integer is -42.
 * Since -42 is in the range [-231, 231 - 1], the final result is -42.
 */
public class Solution {
    public static void main(String[] args) {
       String s = "42";
//       String s = "";
//        String s = "    -42";
//        String s = "-2147483646";
//        String s = "+1";
//        String s = "+-12"; // -> answer 0


        System.out.println(myAtoi1(s));
    }

    public static int myAtoi(String s) {
        if(s.isBlank()) return 0;
        s = s.stripLeading();
        StringBuilder builder = new StringBuilder();
        char[] chars = s.toCharArray();
        char sign = chars[0];

        if(sign == '-' || sign == '+') {
            formNumberFromChars(1, chars, builder);
        } else if (Character.isDigit(sign)) {
            formNumberFromChars(0, chars, builder);
        }

        if(builder.toString().isEmpty()) return 0;

        if(sign == '-'){
            builder.insert(0, '-');
        }

        BigDecimal decimal = new BigDecimal(builder.toString());

        return decimal.compareTo(new BigDecimal(Integer.MAX_VALUE)) > 0 ? Integer.MAX_VALUE : decimal.compareTo(new BigDecimal(Integer.MIN_VALUE)) < 0 ? Integer.MIN_VALUE : decimal.intValue();

    }

    private static void formNumberFromChars(int start, char[] chars, StringBuilder builder) {
        for (int i = start; i < chars.length; i++) {
            if (!Character.isDigit(chars[i])) {
                break;
            }
            builder.append(chars[i]);
        }
    }


    public static int myAtoi1(String s) {
        int sign = 1;
        int result = 0;
        int index = 0;
        int arrLength = s.length();
        while (index < arrLength && s.charAt(index) == ' ')
            index++;

        if (index < arrLength && s.charAt(index) == '+') {
            index++;
        } else if (index < arrLength && s.charAt(index) == '-') {
            sign = -1;
            index++;
        }
        while (index < arrLength && Character.isDigit(s.charAt(index))) {
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && s.charAt(index) - '0' > Integer.MAX_VALUE % 10))
                return (sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
            result *= 10;
            result += s.charAt(index) - '0';
            index++;
        }
        return result * sign;
    }
}
