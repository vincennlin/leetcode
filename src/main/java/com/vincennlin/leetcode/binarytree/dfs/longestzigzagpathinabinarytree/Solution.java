package com.vincennlin.leetcode.binarytree.dfs.longestzigzagpathinabinarytree;
// 1372
class Solution {
    private int maxLength;

    public int longestZigZag(TreeNode root) {
        maxLength = 0;
        dfs(root, 0, true);
        dfs(root, 0, false);
        return maxLength;
    }

    private void dfs(TreeNode currentNode, int length, boolean toLeft) {
        if (currentNode == null) return;

        maxLength = Math.max(maxLength, length);
        if (toLeft) {
            dfs(currentNode.left, length + 1, false);
            dfs(currentNode.right, 1, true);
        } else {
            dfs(currentNode.right, length + 1, true);
            dfs(currentNode.left, 1, false);
        }
    }
}
