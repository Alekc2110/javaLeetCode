package com.java.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String a = r.readLine();
        return a;

    }

    public static int readInt() throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r.readLine());
        return a;

    }

    public static double readDouble() throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(r.readLine());
        return a;

    }

    public static boolean readBoolean() throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        Boolean a = Boolean.parseBoolean(r.readLine());
        return a;

    }

    public static void main(String[] args) {

    }
}
