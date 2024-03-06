package com.java.task.leetcode.easy.sortedArrayToBST;

import java.util.ArrayList;
import java.util.List;


/**
 * Given an integer array nums where the elements are sorted in ascending order, convert it to a
 * height-balanced binary search tree
 * (A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.)
 * <p>
 * Example 1:
 * Input: nums = [-10,-3,0,5,9]
 * Output: [0,-3,9,-10,null,5]
 * Explanation: [0,-10,5,null,-3,null,9] is also accepted:
 * <p>
 * Example 2:
 * Input: nums = [1,3]
 * Output: [3,1]
 * Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
 */

public class Solution {

    public static void main(String[] args) {
//        int[] ints = {-10, -3, 0, 5, 9};
        int[] ints = {0, 1, 2, 3, 4, 5};

        System.out.println(inorderTraversal(sortedArrayToBST(ints)));
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = arrayToBSTHelper(nums, 0, nums.length - 1);
        return root;
    }

    private static TreeNode arrayToBSTHelper(int[] nums, int leftEdge, int rightEdge) {
        if (leftEdge > rightEdge) {
            return null;
        }
        int midIndex = leftEdge + (rightEdge - leftEdge) / 2;
        TreeNode node = new TreeNode(nums[midIndex]);
        node.right = arrayToBSTHelper(nums, midIndex + 1, rightEdge);
        node.left = arrayToBSTHelper(nums, leftEdge, midIndex - 1);

        return node;
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

    public static List<Integer> inorderTraversal(TreeNode root) {
        var list = new ArrayList<Integer>();
        inorderTraversal(root, list);
        return list;
    }

    private static void inorderTraversal(TreeNode current, List<Integer> list) {
        if (current != null) {
            inorderTraversal(current.left, list);
            list.add(current.val);
            inorderTraversal(current.right, list);
        }
    }
}
