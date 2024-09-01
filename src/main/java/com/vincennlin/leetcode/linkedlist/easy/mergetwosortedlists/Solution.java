package com.vincennlin.leetcode.linkedlist.easy.mergetwosortedlists;
// 21
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode();
        ListNode currentNode = dummyNode;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                currentNode.next = list1;
                list1 = list1.next;
            } else {
                currentNode.next = list2;
                list2 = list2.next;
            }
            currentNode = currentNode.next;
        }
        while (list1 != null) {
            currentNode.next = list1;
            list1 = list1.next;
            currentNode = currentNode.next;
        }
        while (list2 != null) {
            currentNode.next = list2;
            list2 = list2.next;
            currentNode = currentNode.next;
        }
        return dummyNode.next;
    }
}