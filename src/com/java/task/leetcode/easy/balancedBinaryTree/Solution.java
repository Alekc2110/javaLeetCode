package com.java.task.leetcode.easy.balancedBinaryTree;


/**
 * Given a binary tree, determine if it is
 * height-balanced:
 * binary tree is a binary tree in which the depth of the two subtrees
 * of every node never differs by more than one.
 * <p>
 * Example 1:
 * Tree ->                  3
 *                      9       20
 *                           15     7
 * Input: root = [3,9,20,null,null,15,7]
 * Output: true
 * <p>
 * Example 2:
 * Tree ->                   1
 *                       2       2
 *                   3       3
 *                4     4
 * Input: root = [1,2,2,3,3,null,null,4,4]
 * Output: false
 *
 * Example 3:
 * Input: root = []
 * Output: true
 */
public class Solution {


    public static void main(String[] args) {

//        TreeNode root = new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3)));
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
//        TreeNode root = new TreeNode(1,  new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)),
//                                             new TreeNode(2));

        System.out.println(isBalancedBinaryTree(root));
    }

//    root = [1,null,2,null,3]
    public static boolean isBalancedBinaryTree(TreeNode root) {
        // If the tree is empty, we can say it’s balanced...
        if (root == null)  return true;
        // Height Function will return -1, when it’s an unbalanced tree...
        return heightCalculate(root) == -1 ? false: true;
    }

    private static int heightCalculate(TreeNode current) {
        // Base case...
        if (current == null)  return 0;
        // Height of left subtree...
        int leftHeight = heightCalculate(current.left);
        // Height of height subtree...
        int rightHeight = heightCalculate(current.right);
        // In case of left subtree or right subtree unbalanced, return -1...
        if (leftHeight == -1 || rightHeight == -1)  return -1;
        // If their heights differ by more than ‘1’, return -1...
        if (Math.abs(leftHeight - rightHeight) > 1)  return -1;
        // Otherwise, return the height of this subtree as max(leftHeight, rightHeight) + 1...
        return Math.max(leftHeight, rightHeight) + 1;
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
