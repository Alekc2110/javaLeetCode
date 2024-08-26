package com.java.task.leetcode.medium.groupAnagrams;

import java.util.*;

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 * <p>
 * Example 1:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * <p>
 * Example 2:
 * Input: strs = [""]
 * Output: [[""]]
 * <p>
 * Example 3:
 * Input: strs = ["a"]
 * Output: [["a"]]
 */
public class Solution {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] strs1 = {""};
        String[] strs2 = {"a"};
        String[] strs3 = {"cab","tin","pew","duh","may","ill","buy","bar","max","doc"};
        // str3 expected [["max"],["buy"],["doc"],["may"],["ill"],["duh"],["tin"],["bar"],["pew"],["cab"]]

        System.out.println(groupAnagrams(strs));
        System.out.println(groupAnagrams(strs1));
        System.out.println(groupAnagrams(strs2));
        System.out.println(groupAnagrams(strs3));

    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> container = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (container.containsKey(sorted)) {
                container.get(sorted).add(str);
            } else {
                container.put(sorted, new ArrayList<>(List.of(str)));
            }
        }
         return container.values().stream().toList();
    }


    /**
     * Calculation, using in map hashcode of int[26] (containing count of characters in array, 26 -> quantity of latin letters)
     * as a Key in Map, Value -> List of words with the same hashcode.
     * @param strs String[]
     * @return List<List<String>>
     */
    public List<List<String>> groupAnagrams2(String[] strs) {
        Map<Integer, List<String>> container = new HashMap<>();
        for (String str : strs) {
            int hash = getHash(str);
            List<String> values = container.getOrDefault(hash, new ArrayList<>());
            values.add(str);
            container.put(hash, values);
        }
        return new ArrayList<>(container.values());
    }

    private static int getHash(String str) {
        int[] sig = new int[26];
        for(char c: str.toCharArray()) {
            sig[c - 'a'] += 1;
        }
        return Arrays.hashCode(sig);
    }
}
