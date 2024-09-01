package com.vincennlin.leetcode.binarytree.general.medium.populatingnextrightpointersineachnodeii;
/*
Given a binary tree

struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

Example 1:

Input: root = [1,2,3,4,5,null,7]
Output: [1,#,2,3,#,4,5,7,#]
Explanation: Given the above binary tree (Figure A), your function should populate each next pointer to point to its next right node, just like in Figure B. The serialized output is in level order as connected by the next pointers, with '#' signifying the end of each level.

Example 2:

Input: root = []
Output: []

 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: root = [1,2,3,4,5,null,7]
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.right = new Node(7);
        Node result1 = solution.connect(root1);
        System.out.println("Example 1 tree constructed.");

        // Example 2: root = []
        Node root2 = null;
        Node result2 = solution.connect(root2);
        System.out.println("Example 2 tree constructed.");
    }
}
