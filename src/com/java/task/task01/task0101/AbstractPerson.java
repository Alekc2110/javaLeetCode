package com.java.task.task01.task0101;

public abstract class AbstractPerson {

    private int value;

    public AbstractPerson(int value) {
        this.value = value;
        print();
    }

    public static void print(){
        System.out.println("value");

    }

    private void doSomth() {

    }

    public void someMethod(){
        System.out.println("bla bla");
        doSomth();
    }

}
