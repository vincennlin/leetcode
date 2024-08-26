package com.vincennlin.leetcode.linkedlist.medium.rotatelist;
//61
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        ListNode currentNode = head;
        int length = 1;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            length++;
        }

        currentNode.next = head;

        k = k % length;
        int steps = length - k;

        for (int i = 0; i < steps; i++) {
            currentNode = currentNode.next;
        }

        head = currentNode.next;
        currentNode.next = null;

        return head;
    }
}
