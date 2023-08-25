package com.java.task.task01.task0101;

import com.sun.jdi.connect.spi.ClosedConnectionException;

import java.util.Objects;

public final class Child extends Parent implements Movable {

    private String childField;
    private String childField1;
    public String childFieldPublic;
    public double value;



    public Child(String parentField) {
        super(parentField);

        this.childField = parentField;
    }

    void doChild(){
        System.out.println("from child");
    }

    public String getChildField() {
        return childField;
    }

    public void setChildField(String childField) {
        this.childField = childField;
    }

    public String getChildField1() {
        return childField1;
    }

    public void setChildField1(String childField1) {
        this.childField1 = childField1;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }


    @Override
    public void move() {
        System.out.println("child move");
    }

//    @Override
//    public void cry() {
//    }

    @Override
    public void jump() throws ClosedConnectionException {
        System.out.println("child jump");
    }

    public void doSomething(){
        System.out.println("doing something");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Child child)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(child.value, value) == 0 && Objects.equals(childField, child.childField) && Objects.equals(childField1, child.childField1) && Objects.equals(childFieldPublic, child.childFieldPublic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), childField, childField1, childFieldPublic, value);
    }

    @Override
    public String toString() {
        return "Child{" +
                "childField='" + childField + '\'' +
                ", childField1='" + childField1 + '\'' +
                ", childFieldPublic='" + childFieldPublic + '\'' +
                ", value=" + value +
                '}';
    }
}
