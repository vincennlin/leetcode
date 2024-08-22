package com.vincennlin.leetcode.linkedlist.medium.removeduplicatesfromsortedlistii;
/*
Given the head of a sorted linked list, delete all nodes that have duplicate numbers,
 leaving only distinct numbers from the original list. Return the linked list sorted as well.

Example 1:

Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]

Example 2:

Input: head = [1,1,1,2,3]
Output: [2,3]
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(3);
        head1.next.next.next.next = new ListNode(4);
        head1.next.next.next.next.next = new ListNode(4);
        head1.next.next.next.next.next.next = new ListNode(5);

        ListNode result1 = solution.deleteDuplicates(head1);
        while (result1 != null) {
            System.out.println(result1.val);
            result1 = result1.next;
        }

        System.out.println();

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(1);
        head2.next.next = new ListNode(1);
        head2.next.next.next = new ListNode(2);
        head2.next.next.next.next = new ListNode(3);

        ListNode result2 = solution.deleteDuplicates(head2);
        while (result2 != null) {
            System.out.println(result2.val);
            result2 = result2.next;
        }
    }
}
