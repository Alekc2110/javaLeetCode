package com.java.task.task01.task0101;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part4 implements Iterable<String> {
    private static final String TEXT = "Класс должен разбирать текстовый файл и возвращать предложения из файла." + System.lineSeparator() +
            "Под предложением понимать последовательность, которая начинается с большой буквы и заканчивается точкой." + System.lineSeparator() +
            "Исходный файл брать небольшим по размеру." + System.lineSeparator() +
            "Достаточно несколько строк и несколько предложений.";

    private static String file;

    public Part4() {
        createFile();
        file = getInput();
    }

    public static void main(String[] args) {
        Part4 part4 = new Part4();
        Iterator<String> iterator = part4.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

    }

    public static String getInput() {
        StringBuilder sb = new StringBuilder();
        try {
            Scanner scanner = new Scanner(new File("part4.txt"), "cp1251");
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

    public void createFile() {
        try (OutputStreamWriter writer =
                     new OutputStreamWriter(new FileOutputStream("part4.txt"), "cp1251")) {
            writer.write(TEXT);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public Iterator<String> iterator() {
        return new MyIterator();
    }

    private static class MyIterator implements Iterator<String> {

        // Pattern pattern = Pattern.compile("[A-ZА-Я]+[A-Za-zА-Яа-я,;'\"\\s]+[.?!]");
        Pattern pattern = Pattern.compile("\\p{javaUpperCase}.*?\\.");
        Matcher matcher = pattern.matcher(file);

        @Override
        public boolean hasNext() {
            return matcher.find();
        }

        @Override
        public String next() {
            if (!hasNext())
                throw new NoSuchElementException();
            return matcher.group();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();

        }

    }
}
