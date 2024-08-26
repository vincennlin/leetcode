package com.vincennlin.leetcode.divideandconquer.medium.sortlist;
//148
class Solution {
    private ListNode merge(ListNode node1, ListNode node2) {
        ListNode combinedHeadNode = new ListNode();
        ListNode currentNode = combinedHeadNode;

        while (node1 != null && node2 != null) {
            if (node1.val < node2.val) {
                currentNode.next = node1;
                node1 = node1.next;
            } else {
                currentNode.next = node2;
                node2 = node2.next;
            }
            currentNode = currentNode.next;
        }
        while (node1 != null) {
            currentNode.next = node1;
            node1 = node1.next;
            currentNode = currentNode.next;
        }
        while (node2 != null) {
            currentNode.next = node2;
            node2 = node2.next;
            currentNode = currentNode.next;
        }

        return combinedHeadNode.next;
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode slowNode = head;
        ListNode fastNode = head;
        fastNode = fastNode.next;

        while (fastNode != null && fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }

        ListNode previousNode = slowNode;
        slowNode = slowNode.next;
        previousNode.next = null;

        head = sortList(head);
        slowNode = sortList(slowNode);

        return merge(head, slowNode);
    }
}
