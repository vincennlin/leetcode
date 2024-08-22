package com.vincennlin.leetcode.binarytreegeneral.medium.constructbinarytreefrominorderandpostordertraversal;
/*
Given two integer arrays inorder and postorder where inorder is the inorder traversal of a binary tree and postorder is the postorder traversal of the same tree, construct and return the binary tree.

Example 1:

Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
Output: [3,9,20,null,null,15,7]
Example 2:

Input: inorder = [-1], postorder = [-1]
Output: [-1]
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
        int[] inorder1 = {9, 3, 15, 20, 7};
        int[] postorder1 = {9, 15, 7, 20, 3};
        TreeNode root1 = solution.buildTree(inorder1, postorder1);
        System.out.println("Example 1 tree constructed.");

        // Example 2: inorder = [-1], postorder = [-1]
        int[] inorder2 = {-1};
        int[] postorder2 = {-1};
        TreeNode root2 = solution.buildTree(inorder2, postorder2);
        System.out.println("Example 2 tree constructed.");

        int[] inorder3 = {1, 2};
        int[] postorder3 = {2, 1};
        TreeNode root3 = solution.buildTree(inorder3, postorder3);

        // Optional: You can add a method to print the tree or validate its structure
        printInOrder(root1); // should match inorder1
        System.out.println();
        printInOrder(root2); // should match inorder2
        System.out.println();
        printInOrder(root3);
        System.out.println();
    }

    public static void printInOrder(TreeNode root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.print(root.val + " ");
            printInOrder(root.right);
        }
    }
}
