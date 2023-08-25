package com.java.task.task01.task0101;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Util {
    public static String getInput(String fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            Scanner scanner = new Scanner(new File(fileName), "UTF-8");
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
    public static void printResult(String st) throws UnsupportedEncodingException {
        PrintStream printStream = new PrintStream(System.out, true, "UTF-8");
        System.setOut(printStream);
        System.out.println(st);
    }

    public static void main(String[] args) {
        String input = Util.getInput("part1.txt");
        System.out.println(input);


    }
}
