package com.vincennlin.leetcode.binarytree.easy.pathsum;

class Solution {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean traverse(TreeNode currentNode, int currentSum, int targetSum) {
        if (currentNode.left == null && currentNode.right == null) {
            return currentSum + currentNode.val == targetSum;
        }
        if (currentNode.right == null) return traverse(currentNode.left, currentSum + currentNode.val, targetSum);
        if (currentNode.left == null) return traverse(currentNode.right, currentSum + currentNode.val, targetSum);
        return traverse(currentNode.left, currentSum + currentNode.val, targetSum)
                || traverse(currentNode.right, currentSum + currentNode.val, targetSum);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        return traverse(root, 0, targetSum);
    }
}