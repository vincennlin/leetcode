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

    private int firstIndexOf(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) return i;
        }
        return -1;
    }

    public TreeNode buildTree(Queue<Integer> preorder, int[] inorder) {
        if (preorder.isEmpty() || inorder.length == 0) return null;
        int current = preorder.poll();
        TreeNode currentNode = new TreeNode(current);
        if (inorder.length != 1) {
            int currentIndexInInorder = firstIndexOf(inorder, current);
            currentNode.left = buildTree(preorder, Arrays.copyOfRange(inorder, 0, currentIndexInInorder));
            currentNode.right = buildTree(preorder, Arrays.copyOfRange(inorder, currentIndexInInorder + 1, inorder.length));
        } else {
            currentNode.left = null;
            currentNode.right = null;
        }
        return currentNode;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Queue<Integer> preorderQueue = new LinkedList<>();
        for (int num : preorder) preorderQueue.offer(num);

        return buildTree(preorderQueue, inorder);
    }
}
