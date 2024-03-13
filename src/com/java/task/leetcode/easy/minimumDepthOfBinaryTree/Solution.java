package com.java.task.leetcode.easy.minimumDepthOfBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 * Note: A leaf is a node with no children.
 * Example 1:
 * Tree ->                  3
 *                     9       20
 *                          15     7
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 2
 * <p>
 * Example 2:
 * Input: root = [2,null,3,null,4,null,5,null,6]
 * Output: 5
 */
public class Solution {
    public static void main(String[] args) {

//        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15, new TreeNode(10), null), new TreeNode(7)));
        TreeNode root = new TreeNode(2,  null,
                                             new TreeNode(3, null,
                                                     new TreeNode(4, null,
                                                             new TreeNode(5, null,
                                                                     new TreeNode(6)))));
        System.out.println(minDepth3(root));

    }

    public static int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        else if (root.left == null && root.right == null)
            return 1;
        else if (root.left == null)
            return 1 + minDepth(root.right);
        else if (root.right == null)
            return 1 + minDepth(root.left);
        else {
            return 1 + Math.min(minDepth(root.left), minDepth(root.right));
        }
    }

    private static int minDepth2(TreeNode root) {
        // Base case
        if (root == null) {
            return 0;
        }
        // Case 1: If the current node has no left child and no right child return 1.
        if (root.left == null && root.right == null)
            return 1;
        // Case 2: If the current node has no left child, recurse on the right child.
        if (root.left == null) {
            return minDepth2(root.right) + 1;
        }
        // Case 3: If the current node has no right child, recurse on the left child.
        if (root.right == null) {
            return minDepth2(root.left) + 1;
        }
        // Case 4: If the current node has both left and right children,
        return Math.min(minDepth2(root.left), minDepth2(root.right)) + 1;
    }

    private static int minDepth3(TreeNode root) {
        if (root == null)
            return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int depth = 1;

        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                root = q.poll();
                if (root.left == null && root.right == null)
                    return depth;
                if (root.left != null)
                    q.add(root.left);
                if (root.right != null)
                    q.add(root.right);
            }
            depth++;
        }
        return 0;
    }

    static class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;

        TreeNode() {
        }

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
