package com.vincennlin.leetcode.linkedlist.medium.removenthnodefromendoflist;
//19
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        ListNode frontNode = head;
        for (int i = 0; i < n; i++) {
            frontNode = frontNode.next;
        }

        if (frontNode == null) return head.next;

        ListNode backNode = head;
        while (frontNode.next != null) {
            backNode = backNode.next;
            frontNode = frontNode.next;
        }

        backNode.next = backNode.next.next;

        return head;
    }
}
