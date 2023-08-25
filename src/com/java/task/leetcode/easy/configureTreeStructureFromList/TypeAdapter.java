package com.java.task.leetcode.easy.configureTreeStructureFromList;

public interface TypeAdapter<T, N> {
    N newInstance();
    boolean isChildOf(T parentNodeData, T childNodeData);
    boolean isTopLevelItem(T data);
}