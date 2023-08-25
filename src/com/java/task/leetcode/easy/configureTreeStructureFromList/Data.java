package com.java.task.leetcode.easy.configureTreeStructureFromList;

public class Data {
    int id;
    String name;
    int parentId;

    public Data(int id, String name, int parentId) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return name;
    }
}