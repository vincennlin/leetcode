package com.vincennlin.leetcode.binarysearchtree.medium.validatebinarysearchtree;
//98
class Solution {
    private Integer previousVal;
    private boolean isValid;

    private void inorderTraversal(TreeNode currentNode) {
        if (currentNode == null) return;

        inorderTraversal(currentNode.left);
        if (!isValid) return;

        if (previousVal != null) isValid = previousVal < currentNode.val;
        previousVal = currentNode.val;

        inorderTraversal(currentNode.right);
    }

    public boolean isValidBST(TreeNode root) {
        previousVal = null;
        isValid = true;
        inorderTraversal(root);
        return isValid;
    }
}
