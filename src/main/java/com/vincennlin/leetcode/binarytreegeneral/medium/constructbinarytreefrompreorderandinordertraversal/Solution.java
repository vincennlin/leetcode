package com.vincennlin.leetcode.binarytreegeneral.medium.constructbinarytreefrompreorderandinordertraversal;

import java.util.*;

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

    private Map<Integer, Integer> inorderIndexMap;
    private int preorderIndex;

    public TreeNode buildTree(int[] preorder, int[] inorder, int inStart, int inEnd) {
        if (preorder.length == 0 || inStart > inEnd) return null;
        int current = preorder[preorderIndex++];
        TreeNode currentNode = new TreeNode(current);
        int currentIndexInInorder = inorderIndexMap.get(current);
        currentNode.left = buildTree(preorder, inorder, inStart, currentIndexInInorder - 1);
        currentNode.right = buildTree(preorder, inorder, currentIndexInInorder + 1, inEnd);
        return currentNode;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preorderIndex = 0;
        inorderIndexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }
        return buildTree(preorder, inorder, 0, inorder.length - 1);
    }
}
