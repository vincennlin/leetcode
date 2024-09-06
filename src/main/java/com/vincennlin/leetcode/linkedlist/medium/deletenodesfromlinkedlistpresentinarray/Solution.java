package com.vincennlin.leetcode.linkedlist.medium.deletenodesfromlinkedlistpresentinarray;

import java.util.HashSet;
import java.util.Set;

// 3217
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {

        Set<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }

        ListNode dummyNode = new ListNode();
        ListNode currentNode = head;
        dummyNode.next = currentNode;
        ListNode previousNode = dummyNode;

        while (currentNode != null) {
            if (numsSet.contains(currentNode.val)) {
                previousNode.next = currentNode.next;
            } else {
                previousNode = previousNode.next;
            }
            currentNode = currentNode.next;
        }

        return dummyNode.next;
    }
}
