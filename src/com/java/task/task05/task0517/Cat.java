package com.java.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name = null;
    String address = null;
    String color = null;
    int age, weight;
   public Cat(String name){
       this.name = name;
       this.age = 2;
       this.weight = 2;
       this.color = "red";

   }
   public Cat(String name, int weight, int age){
       this.name = name;
       this.age = age;
       this.weight = weight;
       this.color = "black";
          }

    public Cat(String name, int age){
       this.name = name;
       this.age = age;
       this.weight = 4;
       this.color = "white";
          }

    public Cat(int weight, String color){
       this.age = 3;
       this.weight = weight;
       this.color = color;
          }
    public Cat(int weight, String color, String address){
       this.age = 3;
       this.weight = weight;
       this.color = color;
       this.address = address;
          }

    public static void main(String[] args) {

    }
}
