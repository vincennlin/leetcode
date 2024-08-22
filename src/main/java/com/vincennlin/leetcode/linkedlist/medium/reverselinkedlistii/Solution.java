package com.vincennlin.leetcode.linkedlist.medium.reverselinkedlistii;

import java.util.List;

//92
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode dummyNode = new ListNode(0, head);
        ListNode previousNode = dummyNode;

        for (int i = 1; i < left; i++) {
            previousNode = previousNode.next;
        }

        ListNode currentNode = previousNode.next;
        for (int i = 0; i < right - left; i++) {
            ListNode tempNode = currentNode.next;
            currentNode.next = tempNode.next;
            tempNode.next = previousNode.next;
            previousNode.next = tempNode;
        }

        return dummyNode.next;
    }
}