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

    public int getHeight(TreeNode currentNode) {
        int height = 0;
        while (currentNode != null) {
            currentNode = currentNode.left;
            height++;
        }
        return height;
    }

    public int countNodes(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        if (leftHeight == rightHeight) {
            return (1 << leftHeight) + countNodes(root.right);
        } else {
            return (1 << rightHeight) + countNodes(root.left);
        }
    }
}
