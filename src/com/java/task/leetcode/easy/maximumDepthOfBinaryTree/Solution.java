package com.java.task.leetcode.easy.maximumDepthOfBinaryTree;

/**
 * Given the root of a binary tree, return its maximum depth.
 * A binary tree's maximum depth is the number of nodes along the longest
 * path from the root node down to the farthest leaf node.
 *
 * Example 1:
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 3
 *
 * Example 2:
 * Input: root = [1,null,2]
 * Output: 2
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public static void main(String[] args) {

//        TreeNode root = new TreeNode(1, null, new TreeNode(2));
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));




        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode root) {

     return maxDepthHelper(root);

    }

    private static int maxDepthHelper(TreeNode current){
        if(current == null){
           return 0;
        } else {
            return 1 + Math.max(maxDepthHelper(current.left), maxDepthHelper(current.right));
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
