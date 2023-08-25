package com.java.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
        Cat c1= new Cat();
        Cat c2= new Cat();
        Cat c3= new Cat();
        Cat c4= new Cat();
        Cat c5= new Cat();
        Cat c6= new Cat();
        Cat c7= new Cat();
        Cat c8= new Cat();
        Cat c9= new Cat();
        Cat c10= new Cat();
        System.out.println(Cat.catCount);

        //выведи значение переменной catCount
    }

    public static class Cat {
        public static int catCount;
        public  Cat(){
            catCount++;
        }

        //создай конструктор
    }
}
