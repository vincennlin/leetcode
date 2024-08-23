package com.vincennlin.leetcode.binarysearchtree.easy.minimumabsolutedifferenceinbst;

import java.util.LinkedList;
import java.util.Queue;

//530
class Solution {
    private Queue<TreeNode> nodeQueue;
    private int minDifference;
    private int currentNum;

    private void traverse() {
        TreeNode currentNode = nodeQueue.poll();
        if (currentNode.left != null) {
            nodeQueue.add(currentNode.left);
            traverse();
        }
        if (currentNum >= 0) {
            int diff = currentNode.val - currentNum;
            if (diff < minDifference) {
                minDifference = diff;
            }
        }
        currentNum = currentNode.val;
        if (currentNode.right != null) {
            nodeQueue.add(currentNode.right);
            traverse();
        }
    }

    public int getMinimumDifference(TreeNode root) {
        if (root == null) return 0;
        minDifference = Integer.MAX_VALUE;
        currentNum = -1;
        nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        traverse();
        return minDifference;
    }
}
