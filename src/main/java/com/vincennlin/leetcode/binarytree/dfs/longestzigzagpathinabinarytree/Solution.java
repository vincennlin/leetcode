package com.vincennlin.leetcode.binarytree.dfs.longestzigzagpathinabinarytree;
// 1372
class Solution {
    public int longestZigZag(TreeNode root) {
        return Math.max(maxZigZag(root.left,0,  false), maxZigZag(root.right, 0, true));
    }

    private int maxZigZag(TreeNode currentNode, int length, boolean toLeft) {
        if (currentNode == null) return length;
        if (toLeft) {
            return Math.max(
                    maxZigZag(currentNode.left, length + 1, false),
                    maxZigZag(currentNode.right, 0, true));
        } else {
            return Math.max(
                    maxZigZag(currentNode.right, length + 1, true),
                    maxZigZag(currentNode.left, 0, false));
        }
    }
}
