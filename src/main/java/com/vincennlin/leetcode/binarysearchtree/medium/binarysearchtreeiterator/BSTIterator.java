package com.vincennlin.leetcode.binarysearchtree.medium.binarysearchtreeiterator;

import java.util.Deque;
import java.util.LinkedList;

//173
class BSTIterator {
    private final Deque<TreeNode> nodeStack;

    public BSTIterator(TreeNode root) {
        nodeStack = new LinkedList<>();
        pushAllLeftNodes(root);
    }

    private void pushAllLeftNodes(TreeNode currentNode) {
        while (currentNode != null) {
            nodeStack.push(currentNode);
            currentNode = currentNode.left;
        }
    }

    public int next() {
        TreeNode currentNode = nodeStack.pop();
        if (currentNode.right != null) pushAllLeftNodes(currentNode.right);
        return currentNode.val;
    }

    public boolean hasNext() {
        return !nodeStack.isEmpty();
    }
}