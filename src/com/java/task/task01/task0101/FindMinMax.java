package com.java.task.task01.task0101;

import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindMinMax {
    public static final String WORD = "\\b[\\p{L}]+";
    private static StringBuilder min = new StringBuilder();
    private static StringBuilder max = new StringBuilder();

    public static void main(String[] args) throws UnsupportedEncodingException {
        String in = Util.getInput("minmax.txt");
        String convert = convert(in);
        Util.printResult(convert);
    }

    public static String convert(String input) {
        String[] split = new String[input.length()];
        Pattern search = Pattern.compile(WORD);
        Matcher matcher = search.matcher(input);
        int index = 0;
        while (matcher.find()) {
            split[index] = matcher.group();
            index++;
        }

        for (String s: split) {
            System.out.print(s+"|");
        }


        sortArray(split);

        int minValue = 0;
        int maxValue = 0;
        if (split.length != 0) {
            if (split[0] != null)
                minValue = split[0].length();
            for (int i = split.length - 1; i > 0; i--) {
                if (split[i] != null && split[i].length() > split[i - 1].length()) {
                    maxValue = split[i].length();
                    break;
                }
            }
        }
        matcher.reset();
        while (matcher.find()) {
            String word = matcher.group();
            if (word.length() == minValue) {
                min.append(word).append(" ");
            }
            if (word.length() == maxValue) {
                max.append(word).append(" ");
            }
        }
        String minWordList = min.toString();
        String maxWordList = max.toString();
        String minWords = removeDuplicateWords(minWordList);
        String maxWords = removeDuplicateWords(maxWordList);
        return combineStrings(minWords, maxWords);
    }

    private static void sortArray(String[] split) {
        for (int i = 0; i < split.length; i++) {
            int pos = i;
            String min = split[i];
            for (int j = i + 1; j < split.length; j++) {
                if (split[j] == null)
                    break;
                if (split[j].length() < min.length()) {
                    min = split[j];
                    pos = j;
                }
            }
                split[pos] = split[i];
                split[i] = min;

        }
    }

    private static String removeDuplicateWords(String input) {
        StringBuilder builder = new StringBuilder();
        String[] words = input.split(" ");
        sortDuplicatesArray(words);
        for (String word : words) {
            if (word != null && !word.isEmpty())
                builder.append(word).append(", ");
        }
        return builder.toString();
    }

    private static void sortDuplicatesArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    arr[j] = "";
                }
            }
        }
    }

    private static String combineStrings(String minWords, String maxWords) {
        min.setLength(0);
        max.setLength(0);
        min.append(minWords.trim());
        max.append(maxWords.trim());
        if (min.length() > 0)
            min.setLength(min.length() - 1);
        if (max.length() > 0)
            max.setLength(max.length() - 1);
        return "Min: ".concat(min.toString()).concat(System.lineSeparator()).concat("Max: ").concat(max.toString());
    }

}
