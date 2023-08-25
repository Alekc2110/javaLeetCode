package com.java.task.task01.task0101;

public class Singleton {
    private static final Singleton instance = new Singleton();

    public Singleton() {
        System.out.println("singleton created");
    }

    public static Singleton getInstance() {
        return instance;
    }
}
