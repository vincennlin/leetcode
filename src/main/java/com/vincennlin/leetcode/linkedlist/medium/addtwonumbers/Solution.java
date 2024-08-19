package com.vincennlin.leetcode.linkedlist.medium.addtwonumbers;
//2
class Solution {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);
        ListNode currentNode = dummyNode;
        int extra = 0;

        while (l1 != null && l2 != null) {
            int newVal = (l1.val + l2.val + extra);
            extra = newVal / 10 > 0 ? 1 : 0;
            currentNode.next = new ListNode(newVal % 10);
            currentNode = currentNode.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int newVal = (l1.val + extra);
            extra = newVal / 10 > 0 ? 1 : 0;
            currentNode.next = new ListNode(newVal % 10);
            currentNode = currentNode.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            int newVal = (l2.val + extra);
            extra = newVal / 10 > 0 ? 1 : 0;
            currentNode.next = new ListNode(newVal % 10);
            currentNode = currentNode.next;
            l2 = l2.next;
        }

        if (extra > 0) {
            currentNode.next = new ListNode(extra);
            currentNode = currentNode.next;
        }

        return dummyNode.next;
    }
}