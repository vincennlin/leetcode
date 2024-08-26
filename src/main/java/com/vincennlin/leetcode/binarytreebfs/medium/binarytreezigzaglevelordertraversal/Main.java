package com.vincennlin.leetcode.binarytreebfs.medium.binarytreezigzaglevelordertraversal;
/*
Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).

Example 1:

Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]

Example 2:

Input: root = [1]
Output: [[1]]

Example 3:

Input: root = []
Output: []

Example 4:
Input: root = [1,2,3,4,null,null,5]
Output: [[1],[3,2],[4,5]]

Constraints:

The number of nodes in the tree is in the range [0, 2000].
-100 <= Node.val <= 100
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);

        System.out.println(solution.zigzagLevelOrder(root1));

        System.out.println();

        TreeNode root2 = new TreeNode(1);

        System.out.println(solution.zigzagLevelOrder(root2));

        System.out.println();

        TreeNode root3 = null;

        System.out.println(solution.zigzagLevelOrder(root3));

        System.out.println();

        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.right = new TreeNode(3);
        root4.left.left = new TreeNode(4);
        root4.right.right = new TreeNode(5);

        System.out.println(solution.zigzagLevelOrder(root4));
    }
}
