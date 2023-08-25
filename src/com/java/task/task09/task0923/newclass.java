package com.java.task.task09.task0923;

public class newclass {
    public static void main(String[] args) {
        String str = "разделить.строку.по разделителю";
        String[] subStr;
        String delimeter = "\\."; // Разделитель
        subStr = str.split(delimeter);
        // Вывод результата на экран
        for (int i = 0; i < subStr.length; i++) {
            System.out.println(subStr[i]);
        }
    }
}
