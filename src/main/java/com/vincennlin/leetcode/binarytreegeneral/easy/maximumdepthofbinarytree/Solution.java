package com.vincennlin.leetcode.binarytreegeneral.easy.maximumdepthofbinarytree;
//104
import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
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

    private int maxDepth = 1;

    public void traverse (TreeNode node, int depth) {
        if (node.left == null && node.right == null) {
            if (maxDepth < depth) maxDepth = depth;
        }
        if (node.left != null) {
            traverse(node.left, depth + 1);
        }
        if (node.right != null) {
            traverse(node.right, depth + 1);
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        traverse(root, 1);
        return this.maxDepth;
    }
}
