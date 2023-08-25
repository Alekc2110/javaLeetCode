package com.java.task.task01.task0101;

import java.time.LocalDate;

public class GrandParent extends BaseModel{
    private Long id;
    private String name;
    private String lastName;
    private LocalDate birthDay;
    private String neighbour;

    public GrandParent() {
        System.out.println("hello from GrandParent constructor without");

    }

    public GrandParent(Long id, String name, String lastName ) {
        System.out.println("hello from GrandParent constructor with param");
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public GrandParent(Long id, String name, String lastName, LocalDate birthDay, String neighbour) {
        // this(id, name, lastName);
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.neighbour = neighbour;
    }

    protected void run(){
        System.out.println("GrandParent running");
    }

    public void move() {
        System.out.println("GrandParent move");
    }

    protected void forGrandParentProtectedMethod() {
        System.out.println("GrandParent protected method");
    }
    void packagePrivateForGrandParent() {
        System.out.println("GrandParent packagePrivate method");
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

    public String getNeighbour() {
        return neighbour;
    }

    public void setNeighbour(String neighbour) {
        this.neighbour = neighbour;
    }


}
