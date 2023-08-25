package com.java.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    int top, left, width, height;

    public  void initialize(int top, int left, int width, int height){
        this.height = height;
        this.top = top;
        this.left = left;
        this.width = width;
    }
    public  void initialize(int left, int width, int height){
        this.height = height;
        this.left = left;
        this.width = width;
    }
    public  void initialize(int top, int left){
        this.top = top;
        this.left = left;
    }
    public  void initialize(Rectangle other){
        this.top = other.top;
        this.left = other.left;
        this.width = other.width;
        this.height = other.height;

    }

    public static void main(String[] args) {

    }
}
