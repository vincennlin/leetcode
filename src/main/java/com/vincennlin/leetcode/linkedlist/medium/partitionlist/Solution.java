package com.vincennlin.leetcode.linkedlist.medium.partitionlist;
//86
class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;

        ListNode lessHeadNode = new ListNode();
        ListNode lessCurrentNode = lessHeadNode;
        ListNode greaterHeadNode = new ListNode();
        ListNode greaterCurrentNode = greaterHeadNode;
        ListNode currentNode = head;

        while (currentNode != null) {
            if (currentNode.val < x) {
                lessCurrentNode.next = currentNode;
                lessCurrentNode = lessCurrentNode.next;
            } else {
                greaterCurrentNode.next = currentNode;
                greaterCurrentNode = greaterCurrentNode.next;
            }
            currentNode = currentNode.next;
        }

        greaterCurrentNode.next = null;
        lessCurrentNode.next = greaterHeadNode.next;
        head = lessHeadNode.next;

        return head;
    }
}
