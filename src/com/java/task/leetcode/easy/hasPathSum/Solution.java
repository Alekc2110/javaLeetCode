package com.java.task.leetcode.easy.hasPathSum;



/**
 * Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path
 * such that adding up all the values along the path equals targetSum.
 * A leaf is a node with no children.
 * <p>
 * Example 1:
 * Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
 * Output: true
 * Explanation: The root-to-leaf path with the target sum is shown.
 * <p>
 * Example 2:
 * Input: root = [1,2,3], targetSum = 5
 * Output: false
 * Explanation: There two root-to-leaf paths in the tree:
 * (1 --> 2): The sum is 3.
 * (1 --> 3): The sum is 4.
 * There is no root-to-leaf path with sum = 5.
 */
public class Solution {
    public static void main(String[] args) {
//[5,4,8,11,null,13,4,7,2,null,null,null,1],
        TreeNode root = new TreeNode(5,
                new TreeNode(4, new TreeNode(11, new TreeNode(7, new TreeNode(2), null), null), null),
                new TreeNode(8, new TreeNode(4, new TreeNode(1), null), new TreeNode(13)));
//        System.out.println(hasPathSum(root, 22));//false
        System.out.println(hasPathSum(root, 29));//true


    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        return hasPathSumHelper(root, targetSum);
    }

    public static boolean hasPathSumHelper(TreeNode cur, int targetSum) {
        if (cur == null) return false;
        targetSum = targetSum - cur.val;
        if (cur.right == null && cur.left == null) {
            if (targetSum == 0) {
                return true;
            }
        }
        boolean left = hasPathSumHelper(cur.left, targetSum);
        boolean right = hasPathSumHelper(cur.right, targetSum);

        return left || right;
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
