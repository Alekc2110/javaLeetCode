package com.java.task.leetcode.easy.orderofparentheses;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String json = """
                ({sentimentResponse(
                	documents=[(
                    )],
                	modelVersion=2022-11-01)})
                	""";
        String brackets = "{[{((()))}]}";

      //  System.out.println(checkOrderOfBracketsInStringOfBrackets(brackets));
        System.out.println(checkOrderOfBracketsInJson(json));
      //  System.out.println(isValidJson(json));


    }
    //implementation for only brackets presented in string example = "{[{()}]}"
    public static boolean checkOrderOfBracketsInStringOfBrackets(String s) {
        //check if string length not even -> false
        if (s.length() % 2 != 0) {
            return false;
        }

        char[] stack = new char[s.length()];
        int pointer = -1;
        for (char c : s.toCharArray()) {
            //check if we have open bracket then move pointer to the right and put char to stack
            if (c == '{' || c == '[' || c == '(') {
                stack[++pointer] = c;

            } else if (pointer < 0) {
                return false;
            } else if (c == '}' && stack[pointer] == '{') {
                pointer--;
            } else if (c == ']' && stack[pointer] == '[') {
                pointer--;
            } else if (c == ')' && stack[pointer] == '(') {
                pointer--;
            } else {
                return false;
            }
        }
        //if pointer == -1 -> we pass through all stack to the beginning, so we have right order of the brackets
        return pointer == -1;
    }

    public static boolean checkOrderOfBracketsInJson(String json) {
        HashMap<Character, Character> characters = new HashMap<>(Map.of('}', '{', ']', '[', ')', '('));
        Deque<Character> stack = new LinkedList<>();
//        Stack<Character> stack = new Stack<>(); // in his case should handle when stack.pop() EmptyStackException

        for (char c: json.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }
           else if(c == '}'){
                Character lastChar = stack.poll();
                if(lastChar == null || lastChar != characters.get(c)){
                    return false;
                }
            }
            else if(c == ']'){
                Character lastChar = stack.poll();
                if(lastChar == null || lastChar != characters.get(c)){
                    return false;
                }
            }
            else if(c == ')') {
                Character lastChar = stack.poll();
                if (lastChar == null || lastChar != characters.get(c)) {
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }

    public static boolean isValidJson(String json) {
        int n = json.length();
        int[] bracketsStack = new int[n + 1];
        int pointer = 0;

        for (int i = 0; i < n; i++) {
            char symbol = json.charAt(i);
            if (symbol == '(' || symbol == '[' || symbol == '{') {
                bracketsStack[++pointer] = symbol;
            } else if (symbol == ')') {
                if (pointer == 0 || bracketsStack[pointer] != '(') {
                    return false;
                }
                pointer--;
            } else if (symbol == ']') {
                if (pointer == 0 || bracketsStack[pointer] != '[') {
                    return false;
                }
                pointer--;
            } else if (symbol == '}') {
                if (pointer == 0 || bracketsStack[pointer] != '{') {
                    return false;
                }
                pointer--;
            }
        }
        return pointer == 0;
    }

}
