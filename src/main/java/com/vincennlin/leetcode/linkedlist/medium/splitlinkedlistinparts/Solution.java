package com.vincennlin.leetcode.linkedlist.medium.splitlinkedlistinparts;
// 725
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] nodeArray = new ListNode[k];

        int count = 0;
        ListNode currentNode = head;

        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }

        currentNode = head;
        for (int i = 0; i < Math.min(k, count); i++) {
            ListNode dummyNode = new ListNode();
            dummyNode.next = currentNode;
            ListNode subCurrentNode = dummyNode;
            int size = count / k;
            if (i < count % k) size++;

            for (int j = 0; j < size; j++) {
                subCurrentNode.next = new ListNode(currentNode.val);
                subCurrentNode = subCurrentNode.next;
                currentNode = currentNode.next;
            }

            nodeArray[i] = dummyNode.next;
        }

        return nodeArray;
    }
}
