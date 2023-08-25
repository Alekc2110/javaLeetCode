package com.java.task.task01.task0101;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User extends AbstractPerson{
    Long id;
    String name;
    String lastName;
    LocalDate birthDay;
    String firstName;
    List<String> list = new ArrayList<>(List.of("!strike"));


    public User() {
        super(1);

        System.out.println("hello from user constructor without param");
    }

    public User(Long id, String name) {
        super(2);

        System.out.println("hello from user constructor with param");
        this.id = id;
        this.name = name;

    }

    public User(Long id, String name, LocalDate birthDay) {
        super(3);

        this.id = id;
        this.name = name;
//        this.lastName = lastName;
        this.birthDay = birthDay;
    }

//    @Override
//    public void run() {
//        System.out.println("user running");
//    }

//    @Override
//    public void jump() {
//        System.out.println("user jump");
//    }

    public void strike() {
        list.add("strike");
        System.out.println("user strike");
        System.out.println(list);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }


    public void runFast() {
        System.out.println("user runFast /////");
    }

    public static void jumpStatic() {
        System.out.println("user jump static");
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(birthDay, user.birthDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, lastName, birthDay);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDay=" + birthDay +
                ", firstName='" + firstName + '\'' +
                '}';
    }

//    @Override
//    public void doSomth() {
//        System.out.println("do somthing in User object");
//    }
}
