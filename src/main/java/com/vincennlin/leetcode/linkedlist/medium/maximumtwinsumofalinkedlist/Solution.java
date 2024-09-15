package com.vincennlin.leetcode.linkedlist.medium.maximumtwinsumofalinkedlist;

import java.util.ArrayDeque;
import java.util.Deque;

// 2130
class Solution {
    public int pairSum(ListNode head) {
        Deque<Integer> valStack = new ArrayDeque<>();
        ListNode slowNode = head;
        ListNode fastNode = head;

        while (fastNode != null) {
            valStack.push(slowNode.val);
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }

        int max = Integer.MIN_VALUE;

        while (slowNode != null) {
            max = Math.max(max, valStack.pop() + slowNode.val);
            slowNode = slowNode.next;
        }

        return max;
    }
}
