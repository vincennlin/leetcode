package com.vincennlin.leetcode.linkedlist.medium.removenthnodefromendoflist;
//19
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0, head);
        ListNode fastNode = dummyNode;
        ListNode slowNode = dummyNode;

        for (int i = 0; i < n; i++) {
            fastNode = fastNode.next;
        }

        while (fastNode.next != null) {
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }

        slowNode.next = slowNode.next.next;

        return dummyNode.next;
    }
}
