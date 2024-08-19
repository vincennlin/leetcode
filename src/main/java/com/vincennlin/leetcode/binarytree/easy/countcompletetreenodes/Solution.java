package com.vincennlin.leetcode.binarytree.easy.countcompletetreenodes;

import com.sun.source.tree.Tree;

//222
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

    private int count;

    public void traverse(TreeNode currentNode) {
        if (currentNode == null) return;
        count++;
        if (currentNode.left != null) traverse(currentNode.left);
        if (currentNode.right != null) traverse(currentNode.right);
    }

    public int countNodes(TreeNode root) {
        count = 0;
        traverse(root);
        return count;
    }
}
