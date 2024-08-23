package com.vincennlin.leetcode.binarysearchtree.medium.kthsmallestelementinabst;
//230
class Solution {
    private int k;
    private Integer ans;

    private void inorderTraversal(TreeNode currentNode) {
        if (currentNode == null) return;

        inorderTraversal(currentNode.left);

        k--;
        if (k == 0) {
            ans = currentNode.val;
            return;
        }

        if (ans != null) return;

        inorderTraversal(currentNode.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        this.ans = null;
        inorderTraversal(root);
        return ans;
    }
}
