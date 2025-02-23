package com.vincennlin.leetcode.binarytree.general.medium.constructbinarytreefrompreorderandpostordertraversal;
// 889
class Solution {

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int[] postorderIndexMap = new int[postorder.length + 1];

        for (int i = 0; i < preorder.length; i++) {
            postorderIndexMap[postorder[i]] = i;
        }

        return buildTree(preorder, postorderIndexMap,
                0, preorder.length - 1, 0);
    }

    private TreeNode buildTree(int[] preorder, int[] postorderIndexMap,
                               int preStart, int preEnd, int postStart) {
        if (preStart > preEnd) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preStart]);

        if (preStart == preEnd) {
            return root;
        }

        int leftVal = preorder[preStart + 1];

        int nodesInLeft = postorderIndexMap[leftVal] - postStart + 1;

        root.left = buildTree(preorder, postorderIndexMap,
                preStart + 1, preStart + nodesInLeft, postStart);

        root.right = buildTree(preorder, postorderIndexMap,
                preStart + nodesInLeft + 1, preEnd, postStart + nodesInLeft);

        return root;
    }
}