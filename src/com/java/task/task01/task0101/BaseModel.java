package com.java.task.task01.task0101;

import java.util.Objects;

public class BaseModel implements Movable {
    private Long id;
    private String firstName;
    private String lastName;


    protected BaseModel() {
        System.out.println("Hello from BaseModel constructor without param");
    }

    public BaseModel(Long id, String firstName, String lastName) {
        System.out.println("Hello from BaseModel constructor with param");
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
    }


//    public static void main(String[] args) {
//        double d1 = 1.000001;
//        double d2 = 1.000001;
//        int retval = Double.compare(d1, d2);
//
//        if(retval > 0) {
//            System.out.println("d1 is greater than d2");
//        } else if(retval < 0) {
//            System.out.println("d1 is less than d2");
//        } else {
//            System.out.println("d1 is equal to d2");
//        }
//
//    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    protected void run() {

        System.out.println("BaseModel running");
    }

    public void runFast() {
        System.out.println("BaseModel fast running");
    }

//    @Override
//    public void jump() {
////        jumpStatic();
//        System.out.println("BaseModel jump");
//    }

    public static void jumpStatic() {

        System.out.println("BaseModel jump static");
    }

    @Override
    public void move() {
        System.out.println("BaseModel move");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BaseModel testBat = (BaseModel) o;
        return Objects.equals(lastName, testBat.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lastName);
    }

    @Override
    public String toString() {
        return "BaseModel{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
