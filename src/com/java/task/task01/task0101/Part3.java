package com.java.task.task01.task0101;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part3 {

    public void generate() {
        String res = null;
        try {
            res = readFile("part3.txt");
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
        input(res);
    }

    public static String readFile(final String path) throws FileNotFoundException {
        final StringBuilder builder = new StringBuilder();
        try (Scanner scan = new Scanner(new FileInputStream(new File(path)), "cp1251")) {
            while (scan.hasNextLine()) {
                builder.append(scan.nextLine()).append(System.lineSeparator());
            }
        }
        return builder.toString();
    }

    public void input(String res) {
        String regex;
        Scanner sc = new Scanner(System.in, "cp1251");
        while (sc.hasNext()) {
            String str = sc.nextLine();
            switch (str) {
                case "char":
                    regex = "(^|\\s)([a-zA-Z\\p{InCyrillic}]{1})(?=\\s|$)";
                    System.out.println(getResByType(regex, res));
                    continue;
                case "String":
                    regex = "(^|\\s)([a-zA-Z\\p{InCyrillic}]{2,})(?=\\s|$)";
                    System.out.println(getResByType(regex, res));
                    continue;
                case "int":
                    regex = "(^|\\s)([+-]?([0-9]+))(?=\\s|$)";
                    System.out.println(getResByType(regex, res));
                    continue;
                case "double":
                    regex = "(^|\\s)[+-]?([0-9]+[.][0-9]*)|([.][0-9]+)";
                    System.out.println(getResByType(regex, res));
                    continue;
                case "stop":
                    return;
                default:
                    System.out.println("Incorrect input");
            }
        }
    }

    public String getResByType(final String regex, String input) {
        String word;
        StringBuilder out = new StringBuilder();
        Matcher m = Pattern.compile(regex).matcher(input);
        while (m.find()) {
            word = m.group(2);
            out.append(" ".concat(word));

        }
        out.append(System.lineSeparator());

        return out.toString();
    }

    public static void main(String[] args) throws IOException {
        Part3 part3 = new Part3();
        part3.generate();

    }
}
