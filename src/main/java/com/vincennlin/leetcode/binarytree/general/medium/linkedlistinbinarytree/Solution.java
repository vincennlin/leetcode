package com.vincennlin.leetcode.binarytree.general.medium.linkedlistinbinarytree;
// 1367
class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) return false;
        return traverse(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    private boolean traverse(ListNode head, TreeNode root) {
        if (head == null) return true;
        if (root == null) return false;
        if (head.val != root.val) return false;
        return traverse(head.next, root.left) || traverse(head.next, root.right);
    }
}
