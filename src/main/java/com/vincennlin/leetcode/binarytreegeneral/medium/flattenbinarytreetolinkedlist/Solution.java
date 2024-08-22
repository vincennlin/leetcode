package com.vincennlin.leetcode.binarytreegeneral.medium.flattenbinarytreetolinkedlist;
//114
class Solution {
    public TreeNode flattenNode(TreeNode currentNode) {
        if (currentNode == null) return null;
        if (currentNode.left == null) {
            currentNode.right = flattenNode(currentNode.right);
            return currentNode;
        }

        TreeNode tempNode = flattenNode(currentNode.right);
        currentNode.right = flattenNode(currentNode.left);

        TreeNode pointerNode = currentNode.right;

        while (pointerNode.right != null) {
            pointerNode = pointerNode.right;
        }
        pointerNode.right = tempNode;
        currentNode.left = null;
        return currentNode;
    }

    public void flatten(TreeNode root) {
        flattenNode(root);
    }
}
