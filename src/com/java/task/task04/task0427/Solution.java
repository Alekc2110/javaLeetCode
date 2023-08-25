package com.java.task.task04.task0427;

import java.io.*;
import java.net.BindException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        while (true){
//            String s = bufferedReader.readLine();
//            if(s.toLowerCase(Locale.ROOT).contains("exit")){
//                break;
//            }
//
//            System.out.println(s + "!!!");
//        }


//        String path = "C:\\Users\\Alex\\IdeaProjects\\JavaRushTasks\\1.JavaSyntax\\src\\com\\javarush\\task\\task04\\task0427\\Condition.txt";
//
//
//        try (var br =
////                     new BufferedReader(new FileReader(path)
//                     new BufferedReader(new InputStreamReader(new FileInputStream(path))
//                     )) {
//            String s;
//            while ((s = br.readLine()) != null) {
//                System.out.println(s);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        try {
//            Files.lines(Path.of("C:\\Users\\Alex\\IdeaProjects\\JavaRushTasks\\1.JavaSyntax\\src\\com\\javarush\\task\\task04\\task0427\\Condition.txt")).forEach(System.out::println);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        String add = "new content\n";


//try (PrintStream ps = new PrintStream("Quest.info")){
//        try (var ps = new FileWriter("Quest.info", true)){
//
////           ps.println(add);
//            ps.write(add);
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



//       String vowels = "aeiouAEIOU";
//
//        try {
//            var res =
//                    Files
//                            .lines(Paths.get("part6.txt"))
//                            .flatMap(line -> Arrays.stream(line.split("")))
//                            .filter(c -> vowels.contains(c))
//                            .count();
//            System.out.println(res);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//       Files.walk(Paths.get("."), 2).forEach(System.out::println);
//       Files.find(Paths.get("."), 10, (p, b)-> p.endsWith("part6.txt")).forEach(System.out::println);


        System.setProperty("TEST_ENV_VAR", "not_null");
        

        Map<String, String> getenv = System.getenv();
        System.out.println(getenv.get("TEST_ENV_VAR"));


    }
}
