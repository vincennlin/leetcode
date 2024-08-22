package com.vincennlin.leetcode.linkedlist.medium.reverselinkedlistii;

 /*
Given the head of a singly linked list and two integers left and right where left <= right,
 reverse the nodes of the list from position left to position right, and return the reversed list.

Example 1:

Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]
Example 2:

Input: head = [5], left = 1, right = 1
Output: [5]
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        ListNode result1 = solution.reverseBetween(head1, 2, 4);
        while (result1 != null) {
            System.out.println(result1.val);
            result1 = result1.next;
        }

        System.out.println();

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);

        ListNode result2 = solution.reverseBetween(head2, 1, 5);
        while (result2 != null) {
            System.out.println(result2.val);
            result2 = result2.next;
        }
    }
}
