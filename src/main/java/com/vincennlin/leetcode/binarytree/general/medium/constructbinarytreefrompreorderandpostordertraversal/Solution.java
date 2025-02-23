package com.vincennlin.leetcode.binarytree.general.medium.constructbinarytreefrompreorderandpostordertraversal;
// 889
class Solution {

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int[] preorderIndexMap = new int[preorder.length];
        int[] postorderIndexMap = new int[postorder.length];

        for (int i = 0; i < preorder.length; i++) {
            preorderIndexMap[preorder[i] - 1] = i;
            postorderIndexMap[postorder[i] - 1] = i;
        }

        return buildTree(preorder, postorder, preorderIndexMap, postorderIndexMap,
                0, preorder.length - 1, 0, postorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int[] postorder, int[] preorderIndexMap, int[] postorderIndexMap,
                               int preStart, int preEnd, int postStart, int postEnd) {
        if (preStart > preEnd && postStart > postEnd) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preStart]);

        if (preStart < preEnd && postStart < postEnd) {

            int leftVal = preorder[preStart + 1];
            int rightVal = postorder[postEnd - 1];

            root.left = buildTree(preorder, postorder, preorderIndexMap, postorderIndexMap,
                    preStart + 1, preorderIndexMap[rightVal - 1] - 1, postStart, postorderIndexMap[leftVal - 1]);

            if (leftVal != rightVal) {
                root.right = buildTree(preorder, postorder, preorderIndexMap, postorderIndexMap,
                        preorderIndexMap[rightVal - 1], preEnd, postorderIndexMap[leftVal - 1] + 1, postEnd - 1);
            }
        }

        return root;
    }
}