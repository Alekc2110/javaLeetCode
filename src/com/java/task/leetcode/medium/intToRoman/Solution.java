package com.java.task.leetcode.medium.intToRoman;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two one's added together.
 * 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
 * Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given an integer, convert it to a roman numeral.
 *
 * Example 1:
 * Input: num = 3
 * Output: "III"
 * Explanation: 3 is represented as 3 ones.
 *
 * Example 2:
 * Input: num = 58
 * Output: "LVIII"
 * Explanation: L = 50, V = 5, III = 3.
 *
 * Example 3:
 * Input: num = 1994
 * Output: "MCMXCIV"
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
public class Solution {
    public static void main(String[] args) {
       int num1 = 3;
       int num2 = 58;
       int num3 = 994;
       int num4 = 594;
       int num5 = 1994;
       int num6 = 3999;
       int num7 = 10123;
        System.out.println(intToRoman(num1));
        System.out.println(intToRoman(num2));
        System.out.println(intToRoman(num3));
        System.out.println(intToRoman(num4));
        System.out.println(intToRoman(num5));
        System.out.println(intToRoman(num6));
        System.out.println(intToRoman(num7));

        System.out.println(intToRoman1(num1));
        System.out.println(intToRoman1(num2));
        System.out.println(intToRoman1(num3));
        System.out.println(intToRoman1(num4));
        System.out.println(intToRoman1(num5));
        System.out.println(intToRoman1(num6));
        System.out.println(intToRoman1(num7));

        System.out.println(intToRoman2(num1));
        System.out.println(intToRoman2(num2));
        System.out.println(intToRoman2(num3));
        System.out.println(intToRoman2(num4));
        System.out.println(intToRoman2(num5));
        System.out.println(intToRoman2(num6));
        System.out.println(intToRoman2(num7));
    }
    public static String intToRoman(int num) {
        String[] numbers = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        int countBitDepth = String.valueOf(num).length();

        if(countBitDepth == 1){
            return numbers[num];
        }
        if(countBitDepth == 2){
            return extractTens(num, numbers);
        }
        if(countBitDepth == 3){
            String tensString = extractTens(num, numbers);
            return extractHundreds(num, tensString);
        }
        if(countBitDepth > 3){
            int thousands = num / 1000;
            String tensString = extractTens(num, numbers);
            String hundredsString = extractHundreds(num, tensString);
            return "M".repeat(thousands) + hundredsString;
        }

        return "";
    }

    private static String extractHundreds(int num, String tensString) {
        int hundredsExtracted = num % 1000;
        int hundreds = hundredsExtracted / 100;
        if(hundreds == 4) {
            return "CD" + tensString;
        }
        if (hundreds == 9){
            return "CM" + tensString;
        }
        if (hundreds >= 5){
            return "D" + "C".repeat(hundreds - 5) + tensString;
        }
        return "C".repeat(hundreds) + tensString;
    }

    private static String extractTens(int num, String[] numbers) {
        int tensExtracted = num % 100;
        int remain1 = tensExtracted % 10;
        String tens = numbers[remain1];
        int remain2 = tensExtracted / 10;
        if(remain2 == 4) {
            return "XL" + tens;
        }
        if (remain2 == 9){
            return "XC" + tens;
        }
        if (remain2 >= 5){
            return "L" + "X".repeat(remain2 - 5) + tens;
        }
        return "X".repeat(remain2) + tens;
    }

    public static String intToRoman1(int num) {
       Map<Integer, String> m = Map.ofEntries(
               Map.entry(1, "I"),
               Map.entry(4, "IV"),
               Map.entry(5, "V"),
               Map.entry(9, "IX"),
               Map.entry(10, "X"),
               Map.entry(40, "XL"),
               Map.entry(50, "L"),
               Map.entry(90, "XC"),
               Map.entry(100, "C"),
               Map.entry(400, "CD"),
               Map.entry(500, "D"),
               Map.entry(900, "CM"),
               Map.entry(1000,"M"));

        TreeMap<Integer, String> map = new TreeMap<>(m);

        Map.Entry<Integer, String> entry = map.floorEntry(num);
        if(entry.getKey().equals(num)){
            return entry.getValue();
        }

        return entry.getValue() + intToRoman1(num - entry.getKey());
    }

    public static String intToRoman2(int num) {
        Map<Integer, String> map = Map.ofEntries(
                Map.entry(0, ""),
                Map.entry(1, "I"),
                Map.entry(2, "II"),
                Map.entry(3, "III"),
                Map.entry(4, "IV"),
                Map.entry(5, "V"),
                Map.entry(6, "VI"),
                Map.entry(7, "VII"),
                Map.entry(8, "VIII"),
                Map.entry(9, "IX"),
                Map.entry(10, "X"),
                Map.entry(20, "XX"),
                Map.entry(30, "XXX"),
                Map.entry(40, "XL"),
                Map.entry(50, "L"),
                Map.entry(60, "LX"),
                Map.entry(70, "LXX"),
                Map.entry(80, "LXXX"),
                Map.entry(90, "XC"),
                Map.entry(100, "C"),
                Map.entry(200, "CC"),
                Map.entry(300, "CCC"),
                Map.entry(400, "CD"),
                Map.entry(500, "D"),
                Map.entry(600, "DC"),
                Map.entry(700, "DCC"),
                Map.entry(800, "DCCC"),
                Map.entry(900, "CM"));
//                Map.entry(1000,"M"),
//                Map.entry(2000,"MM"),
//                Map.entry(3000,"MMM"));

        int n = num % 10; //выводим первый разряд из числа
        int x = num % 100 - n; //выводим десятые из числа
        int c = num % 1000 - (x + n); //выводим сотые из числа
//        int m = num % 10000 - (c + x + n); //выводим тысячные из числа

        int length = String.valueOf(num).length();


        return "M".repeat(num / 1000) + map.get(c) + map.get(x) + map.get(n);
    }
}
