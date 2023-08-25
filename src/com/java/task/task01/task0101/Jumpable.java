package com.java.task.task01.task0101;

import java.io.IOException;

public interface Jumpable {
    void jump() throws IOException;
    void move();
//    default void cry(){
//        System.out.println("jumpable crying");
//    }
}
