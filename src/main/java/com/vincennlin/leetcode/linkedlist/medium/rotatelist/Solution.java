package com.vincennlin.leetcode.linkedlist.medium.rotatelist;
//61
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        if (k == 0) return head;

        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode currentNode = head;
        int length = 0;

        while (currentNode != null) {
            currentNode = currentNode.next;
            length++;
        }

        k = k % length;
        ListNode tailNode = head;
        for (int i = 0; i < k; i++) {
            tailNode = tailNode.next;
        }

        currentNode = head;
        while (tailNode.next != null) {
            tailNode = tailNode.next;
            currentNode = currentNode.next;
        }

        tailNode.next = dummyNode.next;
        dummyNode.next = currentNode.next;
        currentNode.next = null;

        return dummyNode.next;
    }
}
