package com.vincennlin.leetcode.binarytreegeneral.medium.constructbinarytreefrominorderandpostordertraversal;

import java.util.HashMap;
import java.util.Map;

//106
class Solution {
    private Map<Integer, Integer> inorderIndexMap;
    private int postorderIndex;

    private TreeNode buildTree(int[] inorder, int[] postorder, int inStart, int inEnd) {
        if (inStart > inEnd) return null;

        int currentVal = postorder[postorderIndex];
        postorderIndex--;
        TreeNode currentNode = new TreeNode(currentVal);
        if (inStart == inEnd) return currentNode;

        int currentIndex = inorderIndexMap.get(currentVal);
        currentNode.right = buildTree(inorder, postorder, currentIndex + 1, inEnd);
        currentNode.left = buildTree(inorder, postorder, inStart, currentIndex - 1);
        return currentNode;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        inorderIndexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexMap.put(inorder[i], i);
        }
        postorderIndex = inorder.length - 1;
        return buildTree(inorder, postorder, 0, postorderIndex);
    }
}
