package com.java.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    int top, left, height, width;
    public  Rectangle(int top, int left, int height, int width){
        this.top = top;
        this.left = left;
        this.height = height;
        this.width = width;
    }
    public  Rectangle(int top, int left){
        this.top = top;
        this.left = left;
    }
    public  Rectangle(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }
    public  Rectangle(Rectangle other){
        this.top = other.top;
        this.left = other.left;
        this.width = other.width;
        this.height = other.height;
    }


    public static void main(String[] args) {

    }
}
