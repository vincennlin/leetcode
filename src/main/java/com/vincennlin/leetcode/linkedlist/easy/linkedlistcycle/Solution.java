package com.vincennlin.leetcode.linkedlist.easy.linkedlistcycle;
// 141
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slowNode = head;
        ListNode fastNode = head;

        while (fastNode != null && fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if (fastNode == slowNode) return true;
        }
        return false;
    }
}