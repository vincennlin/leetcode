package com.vincennlin.leetcode.linkedlist.easy.reverselinkedlist;
// 206
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        ListNode before = null;
        ListNode current = head;
        ListNode after;

        while (current != null) {
            after = current.next;
            current.next = before;
            before = current;
            current = after;
        }

        head = before;

        return head;
    }
}
