package com.java.task.task01.task0101;

public interface Movable {
    void move();
    default void cry(){
        System.out.println("movable crying");
    }
}
