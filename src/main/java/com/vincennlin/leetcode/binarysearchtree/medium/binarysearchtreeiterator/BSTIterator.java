package com.vincennlin.leetcode.binarysearchtree.medium.binarysearchtreeiterator;
//173
class BSTIterator {

    private TreeNode dummyNode;
    private TreeNode currentNode;

    public BSTIterator(TreeNode root) {
        traverse(root);
        currentNode = dummyNode;
    }

    public int next() {
        currentNode = currentNode.right;
        return currentNode.val;
    }

    public boolean hasNext() {
        return currentNode.right != null;
    }

    private void traverse(TreeNode currentNode) {
        if (currentNode == null) return;

        if (currentNode.left != null) traverse(currentNode.left);

        if (this.currentNode == null) {
            this.currentNode = new TreeNode(currentNode.val);
            dummyNode = new TreeNode();
            dummyNode.right = this.currentNode;
        } else {
            this.currentNode.right = new TreeNode(currentNode.val);
            this.currentNode = this.currentNode.right;
        }

        if (currentNode.right != null) traverse(currentNode.right);
    }
}