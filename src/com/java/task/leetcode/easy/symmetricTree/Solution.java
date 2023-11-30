package com.java.task.leetcode.easy.symmetricTree;

/**
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 * <p>
 * Example 1:
 * Input: root = [1,2,2,3,4,4,3]
 * Output: true
 * <p>
 * Example 2:
 * Input: root = [1,2,2,null,3,null,3]
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
//        [1,2,2,3,4,4,3]
//        TreeNode node = new TreeNode(1, new TreeNode(2,
//                                                          new TreeNode(3 , null, null), new TreeNode(4, null, null)),
//                                            new TreeNode(2,
//                                                          new TreeNode(4 , null , null), new TreeNode(3, null, null)));
//        [1,2,2,null,3,null,3]
        TreeNode node = new TreeNode(1, new TreeNode(2,
                                                          null, new TreeNode(3, null, null)),
                                            new TreeNode(2,
                                                          null, new TreeNode(3, null, null)));



        System.out.println(isSymmetric(node));
    }


    public static boolean isSymmetric(TreeNode root) {


        return isSymmetricHelper(root.left, root.right);
    }

    private static boolean isSymmetricHelper(TreeNode currentLeft, TreeNode currentRight){

        if(currentLeft == null && currentRight == null){
            return true;
        }

        if(currentLeft == null || currentRight == null){
            return false;
        }

        if(currentLeft.val != currentRight.val){
            return false;
        }

        return isSymmetricHelper(currentLeft.left, currentRight.right) && isSymmetricHelper(currentLeft.right, currentRight.left);
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
