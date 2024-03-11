package com.java.task.leetcode.easy.binaryTreePostOrderTraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of a binary tree, return the postorder traversal of its nodes' values.
 * <p>
 * Example 1:
 * Tree ->              1
 * 2
 * 3
 * Input: root = [1,null,2,3]
 * Output: [3,2,1]
 * <p>
 * Example 2:
 * Input: root = []
 * Output: []
 * <p>
 * Example 3:
 * Input: root = [1]
 * Output: [1]
 */
public class Solution {


    public static void main(String[] args) {

        TreeNode root = new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3)));

        System.out.println(postorderTraversal(root));
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        postorderTraversal(root, list);
        return list;
    }

    private static void postorderTraversal(TreeNode current, List<Integer> list) {
        if (current != null) {
            postorderTraversal(current.left, list);
            postorderTraversal(current.right, list);
            list.add(current.val);
        }

    }


    static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

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
