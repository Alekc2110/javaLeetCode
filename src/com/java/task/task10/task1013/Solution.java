package com.java.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int age;
        private String name;
        private String sex;
        private int height;
        private int weight;
        private String town;
        public Human(){
        }
        public Human(int age, String name){
            this.age = age;
            this.name = name;
        }
        public Human(int age, String name, String sex){
            this.age = age;
            this.name = name;
            this.sex = sex;
        }
        public Human(int age, String name, String sex, int height){
            this.age = age;
            this.name = name;
            this.sex = sex;
            this.height = height;
        }
        public Human(String name, int age, String sex, int height){
            this.age = age;
            this.name = name;
            this.sex = sex;
            this.height = height;
        }
        public Human(int age, int height, int weight){
            this.age = age;
            this.height = height;
            this.weight = weight;
        }
        public Human(int age, int height, int weight, String town){
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.town = town;
        }
        public Human(int age, int height, int weight, String name, String town){
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.town = town;
            this.name = name;
        }
        public Human(int age, int weight, String name, String town){
            this.age = age;
            this.weight = weight;
            this.town = town;
            this.name = name;
        }
        public Human(int age, int weight, String name, String sex, String town){

            this.age = age;
            this.weight = weight;
            this.town = town;
            this.name = name;
            this.sex = sex;
        }
    }
}
