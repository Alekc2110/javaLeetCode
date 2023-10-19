package com.java.task.leetcode.easy.sameTree;

/**
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 * <p>
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 * <p>
 * Example 1:
 * <p>
 * Input: p = [1,2,3], q = [1,2,3]
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: p = [1,2], q = [1,null,2]
 * Output: false
 * <p>
 * Example 3:
 * <p>
 * Input: p = [1,2,1], q = [1,1,2]
 * Output: false
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

        TreeNode node1 = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        TreeNode node2 = new TreeNode(1, null, new TreeNode(2, new TreeNode(1), null));

//        TreeNode node1 = new TreeNode(1, new TreeNode(1), new TreeNode(3));
//        TreeNode node2 = new TreeNode(1, new TreeNode(1), new TreeNode(4));


        System.out.println(isSameTree(node1, node2));

    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // base check when successfully passed to bottom of two nodes
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        // check if left subtrees and right subtrees returns TRUE -> return true. Otherwise, return false
        if (isSameTree(p.left, q.left) && isSameTree(p.right, q.right)) {
            return true;
        }
        return false;


    }


    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
