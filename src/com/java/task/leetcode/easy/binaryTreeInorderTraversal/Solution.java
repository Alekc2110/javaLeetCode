package com.java.task.leetcode.easy.binaryTreeInorderTraversal;

import java.util.*;

/**
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 * <p>
 * Example 1:
 * <p>
 * Input: root = [1,null,2,3]
 * Output: [1,3,2]
 * Example 2:
 * <p>
 * Input: root = []
 * Output: []
 * Example 3:
 * <p>
 * Input: root = [1]
 * Output: [1]
 * <p>
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class Solution {
    public static void main(String[] args) {

//        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        TreeNode root = new TreeNode(5, new TreeNode(3, new TreeNode(2), new TreeNode(4)),
                                            new TreeNode(8, new TreeNode(6), new TreeNode(10)));

//        System.out.println(inorderTraversal(root));
        System.out.println(breadthOrderTraversal(root));

    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        var list  = new ArrayList<Integer>();
        inorderTraversal(root, list);
        return list;
    }

    private static void inorderTraversal(TreeNode current, List<Integer> list) {
        if(current != null){
            inorderTraversal(current.left, list);
            list.add(current.val);
            inorderTraversal(current.right, list);
        }
    }


    /**
     * Collect elements of the tree by horizontal layer of children
     * If root is null, returns empty list
     *
     * Example:
     * Tree ->              5
     *                  3       8
     *               2    4   6    10
     * returns [5,3,8,2,4,6,10]
     *
     * @param root TreeNode
     * @return List of elements in tree
     */
    public static List<Integer> breadthOrderTraversal(TreeNode root) {
        var list = new ArrayList<Integer>();
        if (root == null) return list;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current != null) {
                list.add(current.val);
                queue.add(current.left);
                queue.add(current.right);
            }
        }
        return list;
    }



    static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.right = right;
            this.left = left;
        }
    }
}
