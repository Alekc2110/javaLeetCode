package com.java.task.task01.task0101;

import java.io.IOException;

public class InheritanceExample {
    public static void main(String[] args) throws IOException {
        Child child = new Child("ch1");
        child.setChildField("child1");
        Child child2 = new Child("ch2");
        child2.setChildField("child1");
        Parent parent = new Parent("p1");

//        child.doParent();
//    //    child.doChild();
//        child.defParentField = "";
//        child.jump();
//        child.move();
//        child.cry();
        System.out.println(child.equals(child2));




    }
}
