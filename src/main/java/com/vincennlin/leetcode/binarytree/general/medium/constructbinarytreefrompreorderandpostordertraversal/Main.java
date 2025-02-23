package com.vincennlin.leetcode.binarytree.general.medium.constructbinarytreefrompreorderandpostordertraversal;
/*
Given two integer arrays, preorder and postorder where preorder is the preorder traversal of a binary tree of distinct values and postorder is the postorder traversal of the same tree, reconstruct and return the binary tree.

If there exist multiple answers, you can return any of them.



Example 1:


Input: preorder = [1,2,4,5,3,6,7], postorder = [4,5,2,6,7,3,1]
Output: [1,2,3,4,5,6,7]
Example 2:

Input: preorder = [1], postorder = [1]
Output: [1]


Constraints:

1 <= preorder.length <= 30
1 <= preorder[i] <= preorder.length
All the values of preorder are unique.
postorder.length == preorder.length
1 <= postorder[i] <= postorder.length
All the values of postorder are unique.
It is guaranteed that preorder and postorder are the preorder traversal and postorder traversal of the same binary tree.
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: preorder = [1,2,4,5,3,6,7], postorder = [4,5,2,6,7,3,1]
        int[] preorder1 = {1, 2, 4, 5, 3, 6, 7};
        int[] postorder1 = {4, 5, 2, 6, 7, 3, 1};
        TreeNode root1 = solution.constructFromPrePost(preorder1, postorder1);

        // Example 2: preorder = [1], postorder = [1]
        int[] preorder2 = {1};
        int[] postorder2 = {1};
        TreeNode root2 = solution.constructFromPrePost(preorder2, postorder2);

        // Optional: You can add a method to print the tree or validate its structure
        printInOrder(root1); // should match inorder1
        System.out.println();
        printInOrder(root2); // should match inorder2
        System.out.println();

        // preorder = [2,1], postorder = [1,2]
        int[] preorder3 = {2, 1};
        int[] postorder3 = {1, 2};
        TreeNode root3 = solution.constructFromPrePost(preorder3, postorder3);
        printInOrder(root3);
        System.out.println();

        // preorder = [2,1,3], postorder = [3,1,2]
        int[] preorder4 = {2, 1, 3};
        int[] postorder4 = {3, 1, 2};
        TreeNode root4 = solution.constructFromPrePost(preorder4, postorder4);
        printInOrder(root4);
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
