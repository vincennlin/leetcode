package com.vincennlin.leetcode.binarysearchtree.easy.minimumabsolutedifferenceinbst;
/*
Given the root of a Binary Search Tree (BST), return the minimum absolute difference between the values of any two different nodes in the tree.

Example 1:

Input: root = [4,2,6,1,3]
Output: 1

Example 2:

Input: root = [1,0,48,null,null,12,49]
Output: 1
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root1 = new TreeNode(4);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(6);
        root1.left.left = new TreeNode(1);
        root1.left.right = new TreeNode(3);
        int result1 = solution.getMinimumDifference(root1);

        System.out.println(result1); // 1

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(0);
        root2.right = new TreeNode(48);
        root2.right.left = new TreeNode(12);
        root2.right.right = new TreeNode(49);
        int result2 = solution.getMinimumDifference(root2);

        System.out.println(result2); // 1

        // [236,104,701,null,227,null,911]
        TreeNode root3 = new TreeNode(236);
        root3.left = new TreeNode(104);
        root3.right = new TreeNode(701);
        root3.left.right = new TreeNode(227);
        root3.right.right = new TreeNode(911);
        int result3 = solution.getMinimumDifference(root3);

        System.out.println(result3); // 9

        // [1564,1434,3048,1,null,null,3184]
        TreeNode root4 = new TreeNode(1564);
        root4.left = new TreeNode(1434);
        root4.left.left = new TreeNode(1);
        root4.right = new TreeNode(3048);
        root4.right.right = new TreeNode(3184);
        int result4 = solution.getMinimumDifference(root4);

        System.out.println(result4); // 130
    }
}
