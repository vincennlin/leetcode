package com.vincennlin.leetcode.binarytreegeneral.medium.lowestcommonancestorofabinarytree;
/*
Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

Example 1:

Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
Output: 3
Explanation: The LCA of nodes 5 and 1 is 3.

Example 2:

Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
Output: 5
Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.

Example 3:

Input: root = [1,2], p = 1, q = 2
Output: 1

Constraints:

The number of nodes in the tree is in the range [2, 105].
-109 <= Node.val <= 109
All Node.val are unique.
p != q
p and q will exist in the tree.
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root1 = new TreeNode(3);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(0);
        TreeNode node6 = new TreeNode(8);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(4);
        root1.left = node1;
        root1.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node4.left = node7;
        node4.right = node8;
        TreeNode p1 = node1;
        TreeNode q1 = node2;
        System.out.println(solution.lowestCommonAncestor(root1, p1, q1).val); // 3

        TreeNode root2 = new TreeNode(3);
        TreeNode node9 = new TreeNode(5);
        TreeNode node10 = new TreeNode(1);
        TreeNode node11 = new TreeNode(6);
        TreeNode node12 = new TreeNode(2);
        TreeNode node13 = new TreeNode(0);
        TreeNode node14 = new TreeNode(8);
        TreeNode node15 = new TreeNode(7);
        TreeNode node16 = new TreeNode(4);
        root2.left = node9;
        root2.right = node10;
        node9.left = node11;
        node9.right = node12;
        node10.left = node13;
        node10.right = node14;
        node12.left = node15;
        node12.right = node16;
        TreeNode p2 = node9;
        TreeNode q2 = node16;
        System.out.println(solution.lowestCommonAncestor(root2, p2, q2).val); // 5

        TreeNode root3 = new TreeNode(1);
        TreeNode node17 = new TreeNode(2);
        root3.left = node17;
        TreeNode p3 = root3;
        TreeNode q3 = node17;
        System.out.println(solution.lowestCommonAncestor(root3, p3, q3).val); // 1
    }
}
