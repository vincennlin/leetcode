package com.vincennlin.leetcode.binarysearchtree.easy.searchinabinarysearchtree;
/*
You are given the root of a binary search tree (BST) and an integer val.

Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.

Example 1:


Input: root = [4,2,7,1,3], val = 2
Output: [2,1,3]

Example 2:

Input: root = [4,2,7,1,3], val = 5
Output: []

Constraints:

The number of nodes in the tree is in the range [1, 5000].
1 <= Node.val <= 107
root is a binary search tree.
1 <= val <= 107
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        TreeNode result = solution.searchBST(root, 2);
        System.out.println(result.val); // 2
        System.out.println(result.left.val); // 1
        System.out.println(result.right.val); // 3

        TreeNode result2 = solution.searchBST(root, 5);
        System.out.println(result2); // null
    }
}
