package com.vincennlin.leetcode.binarysearchtree.easy.minimumabsolutedifferenceinbst;

import java.util.LinkedList;
import java.util.Queue;

//530
class Solution {
    private Integer previousValue;
    private int minDifference;

    private void inorderTraversal(TreeNode currentNode) {
        if (currentNode == null) return;

        inorderTraversal(currentNode.left);

        if (previousValue != null) {
            minDifference = Math.min(currentNode.val - previousValue, minDifference);
        }
        previousValue = currentNode.val;

        inorderTraversal(currentNode.right);
    }

    public int getMinimumDifference(TreeNode root) {
        if (root == null) return 0;
        minDifference = Integer.MAX_VALUE;
        previousValue = null;
        inorderTraversal(root);
        return minDifference;
    }
}
