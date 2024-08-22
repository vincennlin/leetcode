package com.vincennlin.leetcode.binarysearchtree.easy.convertsortedarraytobinarysearchtree;
//108
class Solution {
    public TreeNode buildTree(int[] nums, int left, int right) {
        if (left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode currentNode = new TreeNode(nums[mid]);
        currentNode.left = buildTree(nums, left, mid - 1);
        currentNode.right = buildTree(nums, mid + 1, right);
        return currentNode;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }
}
