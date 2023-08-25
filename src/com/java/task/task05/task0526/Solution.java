package com.java.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Woman w1 = new Woman("Маша", 20, "kirova");
        Woman w2 = new Woman("Даша", 25, "kirova");
        Man m1 = new Man("Dima", 30, "mers");
        Man m2 = new Man("Misha",20, "Mars");
        System.out.println(w1.name+" "+w1.age+ " "+w1.address);
        System.out.println(w2.name+" "+w2.age+ " "+w2.address);
        System.out.println(m1.name+" "+m1.age+ " "+m1.address);
        System.out.println(m2.name+" "+m2.age+ " "+m2.address);

    }

    public static class Man{
        String name, address;
        int age;
        public Man(String name, int age, String address){
            this.name = name;
            this.address = address;
            this.age = age;
        }
        public Man(String name, int age){
            this.name = name;
            this.address = "unknown";
            this.age = age;
        }
        public Man(String name){
            this.name = name;
            this.address = "unknown";
            this.age = 20;
        }
        public Man(){}

    }
    public static class Woman{
        String name, address;
        int age;
        public Woman(String name, int age, String address){
            this.name = name;
            this.address = address;
            this.age = age;

            }
    }
}
