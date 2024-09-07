package com.vincennlin.leetcode.binarytree.general.medium.linkedlistinbinarytree;
/*
Given a binary tree root and a linked list with head as the first node.

Return True if all the elements in the linked list starting from the head correspond to some downward path connected in the binary tree otherwise return False.

In this context downward path means a path that starts at some node and goes downwards.



Example 1:



Input: head = [4,2,8], root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
Output: true
Explanation: Nodes in blue form a subpath in the binary Tree.
Example 2:



Input: head = [1,4,2,6], root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
Output: true
Example 3:

Input: head = [1,4,2,6,8], root = [1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3]
Output: false
Explanation: There is no path in the binary tree that contains all the elements of the linked list from head.


Constraints:

The number of nodes in the tree will be in the range [1, 2500].
The number of nodes in the list will be in the range [1, 100].
1 <= Node.val <= 100 for each node in the linked list and binary tree.
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode head1 = new ListNode(4, new ListNode(2, new ListNode(8)));
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(4);
        root1.right = new TreeNode(4);
        root1.left.right = new TreeNode(2);
        root1.right.left = new TreeNode(2);
        root1.left.right.left = new TreeNode(6);
        root1.left.right.right = new TreeNode(8);
        root1.left.right.right.left = new TreeNode(1);
        root1.left.right.right.right = new TreeNode(3);
        System.out.println(solution.isSubPath(head1, root1)); // true

        ListNode head2 = new ListNode(1, new ListNode(4, new ListNode(2, new ListNode(6))));
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(4);
        root2.right = new TreeNode(4);
        root2.left.right = new TreeNode(2);
        root2.right.left = new TreeNode(2);
        root2.left.right.left = new TreeNode(6);
        root2.left.right.right = new TreeNode(8);
        root2.left.right.right.left = new TreeNode(1);
        root2.left.right.right.right = new TreeNode(3);
        System.out.println(solution.isSubPath(head2, root2)); // true

        ListNode head3 = new ListNode(1, new ListNode(4, new ListNode(2, new ListNode(6, new ListNode(8)))));
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(4);
        root3.right = new TreeNode(4);
        root3.left.right = new TreeNode(2);
        root3.right.left = new TreeNode(2);
        root3.left.right.left = new TreeNode(6);
        root3.left.right.right = new TreeNode(8);
        root3.left.right.right.left = new TreeNode(1);
        root3.left.right.right.right = new TreeNode(3);
        System.out.println(solution.isSubPath(head3, root3)); // false

        // head = [1,10]
        // root = [1,null,1,10,1,9]
        ListNode head4 = new ListNode(1, new ListNode(10));
        TreeNode root4 = new TreeNode(1);
        root4.right = new TreeNode(1);
        root4.right.left = new TreeNode(10);
        root4.right.right = new TreeNode(1);
        root4.right.right.left = new TreeNode(9);
        System.out.println(solution.isSubPath(head4, root4)); // true
    }
}
