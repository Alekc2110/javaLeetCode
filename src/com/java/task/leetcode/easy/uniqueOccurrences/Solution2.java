package com.java.task.leetcode.easy.uniqueOccurrences;

public class Solution2 {
    class Node {
        int key;
        int count;
        Node left;
        Node right;
    }
    class Tree {
        private Node root;
        private Tree countTree;

        public Tree(int key) {
            root = createNode(key);
        }

        public boolean addNode(int key) {
            return addNode(root, key);
        }

        public boolean inorder() {
            if (root == null) {
                return false;
            }
            return inorder(root);
        }
        private boolean inorder(Node current) {
            if (current.left != null && !inorder(current.left)) {
                return false;
            }

            if (countTree == null) {
                countTree = new Tree(current.count);
            } else if (!countTree.addNode(current.count)) {
                return false;
            }

            if (current.right != null) {
                return inorder(current.right);
            }
            return true;
        }

        private boolean addNode(Node root, int key) {
            if (root.key == key) {
                root.count++;
                return false;
            }

            if (root.key > key) {
                if (root.left == null) {
                    root.left = createNode(key);
                    return true;
                }
                return addNode(root.left, key);
            }
            if (root.right == null) {
                root.right = createNode(key);
                return true;
            }
            return addNode(root.right, key);
        }

        private Node createNode(int key) {
            Node newNode = new Node();
            newNode.count = 1;
            newNode.key = key;
            newNode.left = null;
            newNode.right = null;
            return newNode;
        }
    }

    public boolean uniqueOccurrences(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        Tree tree = new Tree(arr[0]);
        for (int index = 1; index < arr.length; index++) {
            tree.addNode(arr[index]);
        }
        return tree.inorder();
    }
}
