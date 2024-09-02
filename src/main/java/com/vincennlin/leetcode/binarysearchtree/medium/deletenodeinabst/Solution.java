package com.vincennlin.leetcode.binarysearchtree.medium.deletenodeinabst;
// 450
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                root = root.right;
            } else if (root.right == null) {
                root = root.left;
            } else {
                int subtreeMin = subtreeMin(root.right);
                root.val = subtreeMin;
                root.right = deleteNode(root.right, subtreeMin);
            }
        }
        return root;
    }

    private int subtreeMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.val;
    }
}