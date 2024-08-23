package com.vincennlin.leetcode.binarysearchtree.medium.kthsmallestelementinabst;
/*
Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.

Example 1:

Input: root = [3,1,4,null,2], k = 1
Output: 1

Example 2:

Input: root = [5,3,6,2,4,null,null,1], k = 3
Output: 3
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(4);
        root1.left.right = new TreeNode(2);
        int result1 = solution.kthSmallest(root1, 1);

        System.out.println(result1); // 1

        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(3);
        root2.right = new TreeNode(6);
        root2.left.left = new TreeNode(2);
        root2.left.right = new TreeNode(4);
        root2.left.left.left = new TreeNode(1);
        int result2 = solution.kthSmallest(root2, 3);

        System.out.println(result2); // 3

        // [236,104,701,null,227,null,911]
        TreeNode root3 = new TreeNode(236);
        root3.left = new TreeNode(104);
        root3.right = new TreeNode(701);
        root3.left.right = new TreeNode(227);
        root3.right.right = new TreeNode(911);
        int result3 = solution.kthSmallest(root3, 5);

        System.out.println(result3); // 701

        // [1564,1434,3048,1,null,null,3184]
        TreeNode root4 = new TreeNode(1564);
        root4.left = new TreeNode(1434);
        root4.left.left = new TreeNode(1);
        root4.right = new TreeNode(3048);
        root4.right.right = new TreeNode(3184);
        int result4 = solution.kthSmallest(root4, 3);

        System.out.println(result4); // 1564
    }
}
