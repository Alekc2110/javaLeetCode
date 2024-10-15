package com.java.task.leetcode.easy.diameterOfBinaryTree;

/**
 * Given the root of a binary tree, return the length of the diameter of the tree.
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
 * This path may or may not pass through the root.
 * The length of a path between two nodes is represented by the number of edges between them.
 * <p>
 * Example 1:
 * Input: root = [1,2,3,4,5]
 * Output: 3
 * Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
 * <p>
 * Example 2:
 * Input: root = [1,2]
 * Output: 1
 */
public class Solution {
    static int max = 0;

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3)); // 3
        TreeNode root2 = new TreeNode(1, new TreeNode(2), null); // 1
        System.out.println(diameterOfBinaryTree(root));
        System.out.println(diameterOfBinaryTree(root2));
    }

    /**
     * time complexity O(n)
     * @param root
     * @return int max diameter
     */
    public static int diameterOfBinaryTree(TreeNode root) {
        max = 0;
        if (root == null) return 0;
        diameterOfBinaryTreeHelper(root);

        return max;
    }

    private static int diameterOfBinaryTreeHelper(TreeNode current) {
        if (current == null) return 0;

        int leftCount = diameterOfBinaryTreeHelper(current.left);
        int rightCount = diameterOfBinaryTreeHelper(current.right);
        max = Math.max(max, leftCount + rightCount);

        return Math.max(leftCount, rightCount) + 1;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

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
