package com.vincennlin.leetcode.binarytree.general.medium.countgoodnodesinbinarytree;

class Solution {
    public int goodNodes(TreeNode root) {
        return traverse(root, Integer.MIN_VALUE);
    }

    private int traverse(TreeNode currentNode, int max) {
        if (currentNode == null) return 0;
        max = Math.max(currentNode.val, max);
        return (currentNode.val >= max ? 1 : 0) + traverse(currentNode.left, max) + traverse(currentNode.right, max);
    }
}
