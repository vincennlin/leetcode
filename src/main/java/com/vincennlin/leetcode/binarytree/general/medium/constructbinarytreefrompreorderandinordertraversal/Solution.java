package com.vincennlin.leetcode.binarytree.general.medium.constructbinarytreefrompreorderandinordertraversal;

import java.util.*;

//105
class Solution {

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
