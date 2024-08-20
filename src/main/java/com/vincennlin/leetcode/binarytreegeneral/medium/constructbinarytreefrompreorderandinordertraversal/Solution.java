package com.vincennlin.leetcode.binarytreegeneral.medium.constructbinarytreefrompreorderandinordertraversal;

import java.util.Arrays;

//105
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

    private int firstIndexOf(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) return i;
        }
        return -1;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) return null;
        TreeNode currentNode = new TreeNode(preorder[0]);
        if (preorder.length == 1 && inorder.length == 1) return currentNode;
        int currentIndexInInOrder = firstIndexOf(inorder, preorder[0]);
        int lastLeftIndexInPreOrder = firstIndexOf(inorder, inorder[currentIndexInInOrder - 1]);
        currentNode.left = buildTree(
                Arrays.copyOfRange(preorder, 1, lastLeftIndexInPreOrder + 1),
                Arrays.copyOfRange(inorder, 0, currentIndexInInOrder)
        );
        currentNode.right = buildTree(
                Arrays.copyOfRange(preorder, lastLeftIndexInPreOrder + 1, preorder.length - 1),
                Arrays.copyOfRange(inorder, currentIndexInInOrder + 1, inorder.length - 1)
        );
        return currentNode;
    }
}
