package com.java.task.countQuantityOfHashtagsInList;


import java.util.*;
import java.util.stream.Collectors;

/**
 * Count hashtags in given list of strings and return list with most popular hashtags in descending order
 */
public class Solution {
    public static void main(String[] args) {
        List<String> twits = new ArrayList<>();
        twits.add("#Java and #Scala are the languages of cognitive and AI development.");
        twits.add("Some more info on the IBM investment in #Scala ... ");
        twits.add("IBM and @lightband are building an integrated platform for #Java and #Scala #cognitive app development.");

        System.out.println(countMostPopularHashTagInStringsList(twits));

    }


    public static List<String> countMostPopularHashTagInStringsList(List<String> list) {

        Map<String, Integer> map = list.stream()
                .map(String::trim)
                .flatMap(s -> Arrays.stream(s.split("\\s+")))
                .filter(s -> s.startsWith("#"))
                .collect(Collectors.groupingBy(s -> s, Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));


       return map.entrySet().stream().sorted((o1, o2) -> o2.getValue() - o1.getValue()).map(Map.Entry::getKey).toList();





    }
}
