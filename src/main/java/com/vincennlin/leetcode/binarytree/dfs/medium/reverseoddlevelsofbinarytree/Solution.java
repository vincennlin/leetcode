package com.vincennlin.leetcode.binarytree.dfs.medium.reverseoddlevelsofbinarytree;
// 2415
class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        dfs(root, false);
        return root;
    }

    private void dfs(TreeNode root, boolean isNodeOddLevel) {
        if (root == null) {
            return;
        }
        if (!isNodeOddLevel && root.left != null && root.right != null) {
            int temp = root.left.val;
            root.left.val = root.right.val;
            root.right.val = temp;
        }
        dfs(root.left, !isNodeOddLevel);
        dfs(root.right, !isNodeOddLevel);
    }
}
