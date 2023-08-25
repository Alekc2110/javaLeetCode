package com.java.task.task06.task0602;

/* 
Пустые кошки, пустые псы
*/

public class Cat {
    public static void main(String[] args) {

    }

    public void finalize(){
        System.out.println("Cat was destroyed");
    }

}

class Dog {
    public void finalize() {
        System.out.println("Dog was destroyed");
    }
}
