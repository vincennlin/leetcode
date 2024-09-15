package com.vincennlin.leetcode.binarytree.dfs.longestzigzagpathinabinarytree;
/*
You are given the root of a binary tree.

A ZigZag path for a binary tree is defined as follow:

Choose any node in the binary tree and a direction (right or left).
If the current direction is right, move to the right child of the current node; otherwise, move to the left child.
Change the direction from right to left or from left to right.
Repeat the second and third steps until you can't move in the tree.
Zigzag length is defined as the number of nodes visited - 1. (A single node has a length of 0).

Return the longest ZigZag path contained in that tree.



Example 1:


Input: root = [1,null,1,1,1,null,null,1,1,null,1,null,null,null,1]
Output: 3
Explanation: Longest ZigZag path in blue nodes (right -> left -> right).
Example 2:


Input: root = [1,1,1,null,1,null,null,1,1,null,1]
Output: 4
Explanation: Longest ZigZag path in blue nodes (left -> right -> left -> right).
Example 3:

Input: root = [1]
Output: 0


Constraints:

The number of nodes in the tree is in the range [1, 5 * 104].
1 <= Node.val <= 100
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(1);
        root1.right.left = new TreeNode(1);
        root1.right.right = new TreeNode(1);
        root1.right.left.left = new TreeNode(1);
        root1.right.right.right = new TreeNode(1);
        root1.right.left.left.left = new TreeNode(1);
        root1.right.left.left.right = new TreeNode(1);
        root1.right.right.right.right = new TreeNode(1);
        root1.right.left.left.left.right = new TreeNode(1);
        root1.right.right.right.right.right = new TreeNode(1);
        root1.right.left.left.left.right.left = new TreeNode(1);
        root1.right.right.right.right.right.right = new TreeNode(1);
        root1.right.left.left.left.right.left.left = new TreeNode(1);
        root1.right.right.right.right.right.right.right = new TreeNode(1);
        System.out.println(solution.longestZigZag(root1)); // 3

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(1);
        root2.left.right = new TreeNode(1);
        root2.right.right = new TreeNode(1);
        root2.left.right.left = new TreeNode(1);
        root2.right.right.right = new TreeNode(1);
        root2.left.right.left.right = new TreeNode(1);
        root2.right.right.right.right = new TreeNode(1);
        System.out.println(solution.longestZigZag(root2)); // 4

        TreeNode root3 = new TreeNode(1);
        System.out.println(solution.longestZigZag(root3)); // 0
    }
}
