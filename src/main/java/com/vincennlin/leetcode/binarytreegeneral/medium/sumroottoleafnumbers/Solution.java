package com.vincennlin.leetcode.binarytreegeneral.medium.sumroottoleafnumbers;

class Solution {
    private int sumNumbers(TreeNode currentNode, int currentSum) {
        if (currentNode == null) return 0;
        currentSum = 10 * currentSum + currentNode.val;
        if (currentNode.left == null && currentNode.right == null){
            return currentSum;
        } else {
            return sumNumbers(currentNode.left, currentSum) + sumNumbers(currentNode.right, currentSum);
        }
    }

    public int sumNumbers(TreeNode root) {
        return sumNumbers(root, 0);
    }
}
