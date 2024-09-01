package com.vincennlin.leetcode.linkedlist.medium.deletethemiddlenodeofalinkedlist;
// 2095
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null) return null;

        ListNode beforeNode = null;
        ListNode slowNode = head;
        ListNode fastNode = head;

        while (fastNode != null && fastNode.next != null) {
            beforeNode = slowNode;
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }

        if (beforeNode != null) {
            beforeNode.next = slowNode.next;
        } else {
            head = null;
        }

        return head;
    }
}