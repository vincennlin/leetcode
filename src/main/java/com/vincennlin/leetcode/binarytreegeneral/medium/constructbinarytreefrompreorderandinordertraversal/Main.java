package com.vincennlin.leetcode.binarytreegeneral.medium.constructbinarytreefrompreorderandinordertraversal;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
        int[] preorder1 = {3, 9, 20, 15, 7};
        int[] inorder1 = {9, 3, 15, 20, 7};
        Solution.TreeNode root1 = solution.buildTree(preorder1, inorder1);
        System.out.println("Example 1 tree constructed.");

        // Example 2: preorder = [-1], inorder = [-1]
        int[] preorder2 = {-1};
        int[] inorder2 = {-1};
        Solution.TreeNode root2 = solution.buildTree(preorder2, inorder2);
        System.out.println("Example 2 tree constructed.");

        int[] preorder3 = {1, 2};
        int[] inorder3 = {1, 2};
        Solution.TreeNode root3 = solution.buildTree(preorder3, inorder3);

        // Optional: You can add a method to print the tree or validate its structure
        printInOrder(root1); // should match inorder1
        System.out.println();
        printInOrder(root2); // should match inorder2
        System.out.println();
        printInOrder(root3);
        System.out.println();
    }

    // Helper method to print tree in InOrder fashion
    public static void printInOrder(Solution.TreeNode root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.print(root.val + " ");
            printInOrder(root.right);
        }
    }
}

