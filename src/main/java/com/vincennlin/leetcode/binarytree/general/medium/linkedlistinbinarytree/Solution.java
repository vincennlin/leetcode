package com.vincennlin.leetcode.binarytree.general.medium.linkedlistinbinarytree;
// 1367
class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        return traverse(head, head, root);
    }

    private boolean traverse(ListNode head, ListNode currentListNode, TreeNode currentTreeNode) {
        if (currentTreeNode == null) return false;
        if (currentListNode.val == currentTreeNode.val) {
            if (currentListNode.next == null) {
                return true;
            } else {
                return traverse(head, currentListNode.next, currentTreeNode.left) || traverse(head, currentListNode.next, currentTreeNode.right);
            }
        } else {
            return traverse(head, head, currentTreeNode.left) || traverse(head, head, currentTreeNode.right);
        }
    }
}
