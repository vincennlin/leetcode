package com.vincennlin.leetcode.linkedlist.medium.removeduplicatesfromsortedlistii;
//82
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode dummyNode = new ListNode(0, null);
        ListNode lastSortedNode = dummyNode;
        int currentVal = 200;
        ListNode currentNode = head;

        while (currentNode != null) {
            if (currentNode.val != currentVal && (currentNode.next == null || currentNode.val != currentNode.next.val)) {
                lastSortedNode.next = currentNode;
                lastSortedNode = lastSortedNode.next;
            } else{
                lastSortedNode.next = null;
            }
            currentVal = currentNode.val;
            currentNode = currentNode.next;
        }

        return dummyNode.next;
    }
}
