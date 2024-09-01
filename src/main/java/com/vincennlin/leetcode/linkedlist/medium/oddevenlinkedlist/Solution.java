package com.vincennlin.leetcode.linkedlist.medium.oddevenlinkedlist;
// 328
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        if (head.next == null || head.next.next == null) return head;

        ListNode oddHeadNode = new ListNode();
        ListNode oddCurrentNode = oddHeadNode;
        ListNode evenHeadNode = new ListNode();
        ListNode evenCurrentNode = evenHeadNode;

        boolean isOdd = true;
        while (head != null) {
            if (isOdd) {
                oddCurrentNode.next = head;
                oddCurrentNode = oddCurrentNode.next;
            } else {
                evenCurrentNode.next = head;
                evenCurrentNode = evenCurrentNode.next;
            }
            head = head.next;
            isOdd = !isOdd;
        }

        oddCurrentNode.next = evenHeadNode.next;
        evenCurrentNode.next = null;

        return oddHeadNode.next;
    }
}