package com.java.task.leetcode.easy.configureTreeStructureFromList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Utils {

    public static String reduce(BiFunction<DataNode, String, String> reducer, String initial, DataNode node) {
        String value = reducer.apply(node, initial);
        if (node.children != null) {
            if(node.data !=null) System.out.println(node.data.name);
            for (DataNode node1: node.children) {
                value = reduce(reducer, value, node1);
            }
        }
        return value;
    }

    public static <X> List<X> filter(List<X> list, Function<X, Boolean> filterFunction) {
        ArrayList<X> result = new ArrayList<>();
        for(X item: list) {
            if (filterFunction.apply(item)) {
                result.add(item);
            }
        }
        return result;
    }

}
