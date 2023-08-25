package com.java.task.leetcode.easy.configureTreeStructureFromList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] params) {
        ArrayList<Data> items = new ArrayList<>();

        items.add(new Data(1, "Соки", 0));
        items.add(new Data(2, "Манго", 1));
        items.add(new Data(3, "Виноградный", 1));
        items.add(new Data(4, "Яблочный", 1));
        items.add(new Data(5, "Газировка", 0));
        items.add(new Data(6, "Кола", 5));
        items.add(new Data(7, "Кола 0.5л", 6));
        items.add(new Data(8, "Кола 1.5л", 6));
        items.add(new Data(9, "Минералка", 5));
        items.add(new Data(10, "Лимонад", 5));
        items.add(new Data(11, "Лимонад 0.5л", 10));
        items.add(new Data(12, "Лимонад 2л", 10));

        TypeAdapter<Data, DataNode> typeAdapter = new TypeAdapter<>() {
            @Override
            public DataNode newInstance() {
                return new DataNode();
            }

            @Override
            public boolean isChildOf(Data parentNodeData, Data childNodeData) {
                return parentNodeData.id == childNodeData.parentId;
            }

            @Override
            public boolean isTopLevelItem(Data data) {
                return data.parentId == 0;
            }
        };

        DataNode root = DataNode.makeTree(items, typeAdapter);

        String names = Utils.reduce((node, string) -> {
            if (node.children == null || node.children.isEmpty()) {
                if (string.length() > 0) {
                    string = string + ", ";
                }
                string = string + node.data.name;
            }

            return string;
        }, "", root);

        System.out.println("Имена товаров: " + names);
    }

}
