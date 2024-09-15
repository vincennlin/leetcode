package com.vincennlin.leetcode.linkedlist.medium.maximumtwinsumofalinkedlist;

// 2130
class Solution {
    public int pairSum(ListNode head) {
        ListNode slowNode = head;
        ListNode fastNode = head;

        while (fastNode != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }

        ListNode previousNode = null;
        while (slowNode != null) {
            ListNode nextNode = slowNode.next;
            slowNode.next = previousNode;
            previousNode = slowNode;
            slowNode = nextNode;
        }

        int max = Integer.MIN_VALUE;
        ListNode startNode = head;
        ListNode endNode = previousNode;

        while (endNode != null) {
            max = Math.max(max, startNode.val + endNode.val);
            startNode = startNode.next;
            endNode = endNode.next;
        }

        return max;
    }
}
