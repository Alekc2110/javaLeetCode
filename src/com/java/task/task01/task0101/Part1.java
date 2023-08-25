package com.java.task.task01.task0101;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        String input = getInput(fileName);
        printDataToConsole(input);
    }

    public static String getInput(String fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            Scanner scanner = new Scanner(new File(fileName), "cp1251");
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine()).append(System.lineSeparator());
            }
            scanner.close();
            return sb.toString().trim();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return sb.toString();
    }

    public static void printDataToConsole(String input){
        StringBuffer sb = new StringBuffer();
        Pattern pattern = Pattern.compile("(?iu)[a-zа-я]{4,}");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            String word = matcher.group();
            matcher.appendReplacement(sb, word.substring(2));
        }
        matcher.appendTail(sb);
        System.out.print(sb);
    }

}
