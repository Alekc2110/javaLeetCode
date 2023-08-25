package com.java.task.task01.task0101;

import java.util.*;


public class Vararg {

    List<String> viewList = new ArrayList<>();

    public Vararg(String ... strings) {
        viewList.addAll(List.of(strings));
    }


    @Override
    public String toString() {
        return "Vararg{" +
                "viewList=" + viewList +
                '}';
    }
}
