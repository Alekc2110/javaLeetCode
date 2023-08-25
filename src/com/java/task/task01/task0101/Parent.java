package com.java.task.task01.task0101;

import java.io.IOException;
import java.util.Objects;

public class Parent extends GrandParent implements Jumpable{

    private String parentField;
    private String parentField1;
    String defParentField;

//    public Parent() {
//    }

    public Parent(String parentField) {
        this.parentField = parentField;
    }

    public final void doParent(){
        System.out.println("from parent");
    }

    public String getParentField() {
        return parentField;
    }

    public String getParentField1() {
        return parentField1;
    }

    public String getDefParentField() {
        return defParentField;
    }

    public void setParentField(String parentField) {
        this.parentField = parentField;
    }

    public void setParentField1(String parentField1) {
        this.parentField1 = parentField1;
    }

    public void setDefParentField(String defParentField) {
        this.defParentField = defParentField;
    }

    @Override
    public void jump() throws IOException {
        System.out.println("parent jump");
           }

    @Override
    public void move() {
        System.out.println("parent move");
    }


    protected void cryx() {
        System.out.println("cry from Parent");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Parent parent = (Parent) o;
        return Objects.equals(parentField, parent.parentField) && Objects.equals(parentField1, parent.parentField1) && Objects.equals(defParentField, parent.defParentField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), parentField, parentField1, defParentField);
    }

    @Override
    public String toString() {
        return "Parent{" +
                "parentField='" + parentField + '\'' +
                ", parentField1='" + parentField1 + '\'' +
                ", defParentField='" + defParentField + '\'' +
                '}';
    }
}
