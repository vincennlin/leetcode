package com.vincennlin.leetcode.binarytreebfs.medium.binarytreerightsideview;
/*
Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

Example 1:

Input: root = [1,2,3,null,5,null,4]
Output: [1,3,4]

Example 2:

Input: root = [1,null,3]
Output: [1,3]

Example 3:

Input: root = []
Output: []

Constraints:

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.right = new TreeNode(5);
        root1.right.right = new TreeNode(4);

        System.out.println(solution.rightSideView(root1));

        System.out.println();

        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(3);

        System.out.println(solution.rightSideView(root2));

        System.out.println();

        TreeNode root3 = null;

        System.out.println(solution.rightSideView(root3));
    }
}
