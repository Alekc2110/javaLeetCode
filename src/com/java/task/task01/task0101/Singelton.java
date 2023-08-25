package com.java.task.task01.task0101;

public enum Singelton {

    SINGELTON1, SINGELTON;

    void doWorkSingl(){
        System.out.println("!!!!!!!!!!" + SINGELTON);
    }
    void doWorkSingl1(){
        System.out.println(SINGELTON1);
    }


    public int compareTo(Exam first) {
        return this.name().compareTo(first.name());
    }

}
