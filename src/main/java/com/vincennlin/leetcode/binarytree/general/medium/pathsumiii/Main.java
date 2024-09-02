package com.vincennlin.leetcode.binarytree.general.medium.pathsumiii;
/*
Given the root of a binary tree and an integer targetSum, return the number of paths where the sum of the values along the path equals targetSum.

The path does not need to start or end at the root or a leaf, but it must go downwards (i.e., traveling only from parent nodes to child nodes).

Example 1:

Input: root = [10,5,-3,3,2,null,11,3,-2,null,1], targetSum = 8
Output: 3
Explanation: The paths that sum to 8 are shown.

Example 2:

Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
Output: 3

Constraints:

The number of nodes in the tree is in the range [0, 1000].
-109 <= Node.val <= 109
-1000 <= targetSum <= 1000
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root1 = new TreeNode(10);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(-3);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(2);
        root1.right.right = new TreeNode(11);
        root1.left.left.left = new TreeNode(3);
        root1.left.left.right = new TreeNode(-2);
        root1.left.right.right = new TreeNode(1);
        System.out.println(solution.pathSum(root1, 8)); // 3

        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(4);
        root2.right = new TreeNode(8);
        root2.left.left = new TreeNode(11);
        root2.right.left = new TreeNode(13);
        root2.right.right = new TreeNode(4);
        root2.left.left.left = new TreeNode(7);
        root2.left.left.right = new TreeNode(2);
        root2.right.right.left = new TreeNode(5);
        root2.right.right.right = new TreeNode(1);
        System.out.println(solution.pathSum(root2, 22)); // 3

        // [1000000000,1000000000,null,294967296,null,1000000000,null,1000000000,null,1000000000]
        TreeNode root3 = new TreeNode(1000000000);
        root3.left = new TreeNode(1000000000);
        root3.left.left = new TreeNode(294967296);
        root3.left.left.left = new TreeNode(1000000000);
        root3.left.left.left.left = new TreeNode(1000000000);
        root3.left.left.left.left.left = new TreeNode(1000000000);
        System.out.println(solution.pathSum(root3, 0)); // 0
    }
}
