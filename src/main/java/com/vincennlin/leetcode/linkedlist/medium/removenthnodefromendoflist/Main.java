package com.vincennlin.leetcode.linkedlist.medium.removenthnodefromendoflist;
/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1]
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        ListNode result1 = solution.removeNthFromEnd(head1, 2);
        while (result1 != null) {
            System.out.println(result1.val);
            result1 = result1.next;
        }

        System.out.println();

        ListNode head2 = new ListNode(1);
        ListNode result2 = solution.removeNthFromEnd(head2, 1);
        while (result2 != null) {
            System.out.println(result2.val);
            result2 = result2.next;
        }

        System.out.println();

        ListNode head3 = new ListNode(1);
        head3.next = new ListNode(2);
        ListNode result3 = solution.removeNthFromEnd(head3, 2);
        while (result3 != null) {
            System.out.println(result3.val);
            result3 = result3.next;
        }
    }
}
