package com.vincennlin.leetcode.binarysearchtree.easy.searchinabinarysearchtree;
// 700
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        return traverse(root, val);
    }

    private TreeNode traverse(TreeNode currentNode, int val) {
        if (currentNode == null) return null;
        if (currentNode.val == val) return currentNode;
        if (val < currentNode.val) {
            return traverse(currentNode.left, val);
        } else {
            return traverse(currentNode.right, val);
        }
    }
}
