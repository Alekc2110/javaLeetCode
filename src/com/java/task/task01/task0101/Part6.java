package com.java.task.task01.task0101;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part6 {

    private static final String LATN_EXP = "(^|\\s)([A-Za-z])(?=\\s|" + System.lineSeparator() + "|$)";
    private static final String CYRL_EXP = "(^|\\s)([\\p{InCyrillic}.*?\\-\\.])(?=\\s|" + System.lineSeparator() + "|$)";

    public void printPhrases() {
        String fileName = "part6.txt";
        String resource = null;
        try {
            resource = readFile(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            ;
        }
        input(resource);
    }

    public String readFile(final String path) throws FileNotFoundException {
        final StringBuilder builder = new StringBuilder();
        try (Scanner scan = new Scanner(new FileInputStream(new File(path)), "cp1251")) {
            while (scan.hasNextLine()) {
                builder.append(scan.nextLine()).append(System.lineSeparator());
            }
        }
        return builder.toString();
    }

    public void input(String resource) {
        resource = resource.replaceAll("[^A-Za-z\\p{InCyrillic}]", " ");
//
//        final String letterCyr = "\\p{InCyrillic}.*?\\-\\.";
//        final String startStrCyr = "(^|\\s)([" + letterCyr + "]";
//        final String endStrCyr = ")(?=\\s|" + LS + "|$)";

        Scanner sc = new Scanner(System.in, "cp1251");
        while (sc.hasNext()) {
            String str = sc.nextLine();
            if (str.equalsIgnoreCase("Latn")) {
                latn(resource, LATN_EXP, str);
            }
            if (str.equalsIgnoreCase("Cyrl")) {
                cyrl(resource, CYRL_EXP, str);
            }
            if (str.equalsIgnoreCase("stop")) {
                break;
            } else {
                System.out.println(str + ": Incorrect input");
            }
        }
    }


    private void cyrl(String resource, final String reg, String str) {
//        String regex = startStrCyr + "{1,}" + endStrCyr;
        System.out.println(str + ": " + getResTypeParse(reg, resource));
    }

    private void latn(String resource, final String reg, String str) {
//        String regex = startStr + "{0,}" + endStr;
        System.out.println(str + ": " + getResTypeParse(reg, resource));
    }

    public String getResTypeParse(final String regex, String input) {
        String word;
        StringBuilder out = new StringBuilder();
        Pattern pat = Pattern.compile(regex);
        Matcher m = pat.matcher(input);
        boolean found = false;
        while (m.find()) {
            word = m.group(2);
            if (!found) {
                out.append(word);
                found = true;
            } else {
                out.append(" ".concat(word));
            }
        }
//        if (!found) {
//            out.append("No such values");
//        }

        return out.toString().trim();
    }

    public static void main(String[] args) {
        Part6 part6 = new Part6();
        part6.printPhrases();

    }

}
