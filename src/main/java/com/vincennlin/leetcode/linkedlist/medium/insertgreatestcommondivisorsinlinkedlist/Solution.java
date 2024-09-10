package com.vincennlin.leetcode.linkedlist.medium.insertgreatestcommondivisorsinlinkedlist;
// 2807
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode currentNode = head;

        while (currentNode.next != null) {
            ListNode gcdNode = new ListNode(gcd(currentNode.val, currentNode.next.val));
            gcdNode.next = currentNode.next;
            currentNode.next = gcdNode;
            currentNode = gcdNode.next;
        }

        return head;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
