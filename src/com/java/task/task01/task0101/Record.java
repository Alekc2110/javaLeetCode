package com.java.task.task01.task0101;

public record Record(int id, String name) implements Movable  /*cannot extends*/ {

    //private String lastName; fields not allowed except static
    private static String last;

    public Record {
        System.out.println("inside record constructor");
    }

    public Record (String lastName){
        this(1, lastName);
        System.out.println("inside second record constructor");
    }

    @Override
    public void move() {
        System.out.println("inside a record");
    }
}
