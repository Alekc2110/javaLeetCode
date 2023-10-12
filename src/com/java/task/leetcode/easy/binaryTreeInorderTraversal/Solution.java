package com.java.task.leetcode.easy.binaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

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

        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));

        System.out.println(inorderTraversal(root));
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
