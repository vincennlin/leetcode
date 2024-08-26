package com.vincennlin.leetcode.divideandconquer.medium.sortlist;
/*
Given the head of a linked list, return the list after sorting it in ascending order.

Example 1:

Input: head = [4,2,1,3]
Output: [1,2,3,4]

Example 2:

Input: head = [-1,5,3,4,0]
Output: [-1,0,3,4,5]

Example 3:

Input: head = []
Output: []

Constraints:

The number of nodes in the list is in the range [0, 5 * 104].
-105 <= Node.val <= 105

Follow up: Can you sort the linked list in O(n logn) time and O(1) memory (i.e. constant space)?
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode head1 = new ListNode(4);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(1);
        head1.next.next.next = new ListNode(3);

        ListNode result1 = solution.sortList(head1);
        while (result1 != null) {
            System.out.print(result1.val + " ");
            result1 = result1.next;
        }

        System.out.println();

        ListNode head2 = new ListNode(-1);
        head2.next = new ListNode(5);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(0);

        ListNode result2 = solution.sortList(head2);
        while (result2 != null) {
            System.out.print(result2.val + " ");
            result2 = result2.next;
        }

        System.out.println();

        ListNode head3 = null;

        ListNode result3 = solution.sortList(head3);
        while (result3 != null) {
            System.out.print(result3.val + " ");
            result3 = result3.next;
        }
    }
}
