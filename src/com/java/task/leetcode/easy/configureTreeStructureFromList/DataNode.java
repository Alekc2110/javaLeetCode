package com.java.task.leetcode.easy.configureTreeStructureFromList;


import java.util.ArrayList;
import java.util.List;

public class DataNode {

    Data data;
    ArrayList<DataNode> children;
    DataNode parent;

    public DataNode() {
    }

    public static DataNode makeTree(List<Data> datas, TypeAdapter<Data, DataNode> typeAdapter) {
        DataNode root = typeAdapter.newInstance();

        root.children = new ArrayList<>();
        List<Data> dataList = Utils.filter(datas, typeAdapter::isTopLevelItem);
        for (Data top: dataList) {
            DataNode node = createNode(top, root, datas, typeAdapter);
            root.children.add(node);
        }
        return root;
    }

    private static DataNode createNode(Data newData, DataNode parent, List<Data> datas, TypeAdapter<Data, DataNode> typeAdapter) {
        DataNode node = typeAdapter.newInstance();
        node.data = newData;
        node.parent = parent;

        List<Data> directChildren = Utils.filter(datas, data -> newData.id == data.parentId);
        if (!directChildren.isEmpty()) {
            node.children = new ArrayList<>();
            for (Data child: directChildren) {
                DataNode node1 = createNode(child, node, datas, typeAdapter);
                node.children.add(node1);
            }
        }
        return node;
    }



    @Override
    public String toString() {
        return data != null ? data.name : "root";
    }
}
