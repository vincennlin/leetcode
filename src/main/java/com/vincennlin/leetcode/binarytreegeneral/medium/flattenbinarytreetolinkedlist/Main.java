package com.vincennlin.leetcode.binarytreegeneral.medium.flattenbinarytreetolinkedlist;
/*
Given the root of a binary tree, flatten the tree into a "linked list":

The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list and the left child pointer is always null.
The "linked list" should be in the same order as a pre-order traversal of the binary tree.


Example 1:


Input: root = [1,2,5,3,4,null,6]
Output: [1,null,2,null,3,null,4,null,5,null,6]
Example 2:

Input: root = []
Output: []
Example 3:

Input: root = [0]
Output: [0]

 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: root = [1,2,5,3,4,null,6]
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(5);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(4);
        root1.right.right = new TreeNode(6);

        solution.flatten(root1);

        while (root1 != null) {
            System.out.println(root1.val);
            root1 = root1.right;
        }

        // Example 2: root = []
        TreeNode root2 = null;

        solution.flatten(root2);

        // Example 3: root = [0]

        TreeNode root3 = new TreeNode(0);

        solution.flatten(root3);

        while (root3 != null) {
            System.out.println(root3.val);
            root3 = root3.right;
        }
    }
}
