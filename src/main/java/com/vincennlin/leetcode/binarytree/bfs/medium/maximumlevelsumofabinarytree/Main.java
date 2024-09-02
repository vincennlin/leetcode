package com.vincennlin.leetcode.binarytree.bfs.medium.maximumlevelsumofabinarytree;
/*
Given the root of a binary tree, the level of its root is 1, the level of its children is 2, and so on.

Return the smallest level x such that the sum of all the values of nodes at level x is maximal.

Example 1:


Input: root = [1,7,0,7,-8,null,null]
Output: 2
Explanation:
Level 1 sum = 1.
Level 2 sum = 7 + 0 = 7.
Level 3 sum = 7 + -8 = -1.
So we return the level with the maximum sum which is level 2.

Example 2:

Input: root = [989,null,10250,98693,-89388,null,null,null,-32127]
Output: 2

Constraints:

The number of nodes in the tree is in the range [1, 104].
-105 <= Node.val <= 105
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(7);
        root1.right = new TreeNode(0);
        root1.left.left = new TreeNode(7);
        root1.left.right = new TreeNode(-8);
        System.out.println(solution.maxLevelSum(root1)); // 2

        TreeNode root2 = new TreeNode(989);
        root2.right = new TreeNode(10250);
        root2.right.left = new TreeNode(98693);
        root2.right.right = new TreeNode(-89388);
        root2.right.right.right = new TreeNode(-32127);
        System.out.println(solution.maxLevelSum(root2)); // 2
    }
}
