package com.vincennlin.leetcode.binarytree.general.medium.flattenbinarytreetolinkedlist;
//114
class Solution {
//    public TreeNode flattenNode(TreeNode currentNode) {
//        if (currentNode == null) return null;
//        if (currentNode.left == null) {
//            currentNode.right = flattenNode(currentNode.right);
//            return currentNode;
//        }
//
//        TreeNode tempNode = flattenNode(currentNode.right);
//        currentNode.right = flattenNode(currentNode.left);
//
//        TreeNode pointerNode = currentNode.right;
//
//        while (pointerNode.right != null) {
//            pointerNode = pointerNode.right;
//        }
//        pointerNode.right = tempNode;
//        currentNode.left = null;
//        return currentNode;
//    }

    public void flatten(TreeNode root) {
        TreeNode currentNode = root;

        while (currentNode != null) {
            if (currentNode.left != null) {
                TreeNode rightMost = currentNode.left;
                while (rightMost.right != null) {
                    rightMost = rightMost.right;
                }

                rightMost.right = currentNode.right;

                currentNode.right = currentNode.left;
                currentNode.left = null;
            }
            currentNode = currentNode.right;
        }
    }
}
